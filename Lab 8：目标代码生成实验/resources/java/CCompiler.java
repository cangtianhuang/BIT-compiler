import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class CCompiler {
	// 字符缓冲输出流，用以写入文件
	private final BufferedWriter writer;
	private final ArrayList<String> constList;
	private final ArrayList<String> dataList;
	private final ArrayList<String> codeList;
	private int index;
	private final ArrayList<CQuat> CQuats;
	private final Util util;
	private final Map<String, LinkedList<Integer>> ActiveTable;
	private int tempData = 0;
	private final Map<String, PosInfo> varDes;
	private final Map<String, String> SymbolTable;

	private static final String[] regs = {"eax", "ebx", "ecx", "edx", "esi", "edi"};

	private static int isInReg(String pos) {
		return switch (pos) {
			case "eax" -> 0;
			case "ebx" -> 1;
			case "ecx" -> 2;
			case "edx" -> 3;
			case "esi" -> 4;
			case "edi" -> 5;
			default -> -1;
		};
	}

	private static boolean isMem(String id) {
		return !isConst(id) && isInReg(id) == -1;
	}

	public static boolean isConst(String id) {
		Pattern pattern = Pattern.compile("-?[0-9]+");
		return pattern.matcher(id).matches();
	}

	private static class ArrayInfo {
		public static int global = 1, local = 2;
		public int type, dim;
		public ArrayList<Integer> list;
	}

	private final Map<String, ArrayInfo> arrayMap;

	private int getArrayDimSize(String id, int dim) {
		if (arrayMap.get(id) == null) return 1;
		ArrayInfo info = arrayMap.get(id);
		int size = 1;
		for (int i = dim + 1; i < info.list.size(); i++) {
			size *= info.list.get(i);
		}
		return size;
	}

	private class PosInfo {
		private final String id;
		private String activePos;
		// 0~5：寄存器，6：局部变量，7：函数参数，8：全局变量，9：全局临时变量
		private final boolean[] flags = new boolean[10];
		private String temp_data;

		public PosInfo(String id) {
			this.id = id;
		}

		public String getFirstPos() {
			if (activePos != null) return activePos;
			for (int i = 0; i < 10; i++) {
				if (flags[i]) {
					return switch (i) {
						case 6, 7, 8 -> id;
						case 9 -> temp_data;
						default -> regs[i];
					};
				}
			}
			System.out.println("error 01");
			return null;
		}

		public String getMemPos() {
			if (flags[6] || flags[7] || flags[8]) return id;
			if (flags[9]) return temp_data;
			return null;
		}

		public void putPos(String pos) {
			int i = isInReg(pos);
			if (i != -1) {
				if (flags[i]) return;
				flags[i] = true;
				activePos = pos;
				String oldId = SymbolTable.put(pos, id);
				if (oldId != null) util.releaseVar(oldId, pos);
			} else if (pos.equals("local")) {
				if (flags[6]) return;
				flags[6] = true;
				activePos = id;
				SymbolTable.put(id, id);
			} else if (pos.equals("para")) {
				if (flags[7]) return;
				flags[7] = true;
				activePos = id;
				SymbolTable.put(id, id);
			} else if (pos.equals("data")) {
				if (flags[8]) return;
				flags[8] = true;
				activePos = id;
				SymbolTable.put(id, id);
			} else if (pos.startsWith("tempData")) {
				if (flags[9]) return;
				flags[9] = true;
				temp_data = pos;
				activePos = pos;
				String oldId = SymbolTable.put(pos, id);
				if (oldId != null) util.releaseVar(oldId, pos);
			}
		}

		public void releaseVar(String pos) {
			int i = isInReg(pos);
			if (i != -1) {
				if (flags[i] && !SymbolTable.get(pos).equals(id)) {
					flags[i] = false;
					if (ActiveTable.get(id) != null && ActiveTable.get(id).getLast() > index) {
						String new_pos = util.getNewReg();
						if (new_pos == null) new_pos = getMemPos();
						codeList.add("\tmov " + new_pos + ", " + pos);
						putPos(new_pos);
						activePos = new_pos;
					} else varDes.remove(id);
				}
			} else if (pos.equals("local")) {
				if (flags[6]) {
					flags[6] = false;
				}
			} else if (pos.equals("para")) {
				if (flags[7]) {
					flags[7] = false;
				}
			} else if (pos.equals("data")) {
				if (flags[8]) {
					flags[8] = false;
				}
			} else if (pos.startsWith("tempData")) {
				if (flags[9] && !SymbolTable.get(pos).equals(id)) {
					flags[9] = false;
					if (ActiveTable.get(id) != null && ActiveTable.get(id).getLast() > index) {
						String new_pos = util.getNewReg();
						if (new_pos == null) new_pos = getMemPos();
						codeList.add("\tmov " + new_pos + ", " + pos);
						putPos(new_pos);
					} else varDes.remove(id);
				}
			}
		}

		public void delete() {
			for (int i = 0; i < 6; i++) {
				if (flags[i] && SymbolTable.get(regs[i]).equals(id)) {
					flags[i] = false;
					SymbolTable.replace(regs[i], null);
				}
			}
			if (flags[9] && SymbolTable.get(temp_data).equals(id)) {
				flags[9] = false;
				SymbolTable.replace(temp_data, null);
			}
		}
	}

	private class Util {

		public Util() {
			for (String reg : regs) {
				SymbolTable.put(reg, null);
			}
		}

		public String getNewReg() {
			for (String reg : regs) {
				if (SymbolTable.get(reg) == null) return reg;
			}
			releaseRegs();
			for (String reg : regs) {
				if (SymbolTable.get(reg) == null) return reg;
			}
			return null;
		}

		public String getNewReg(boolean isRequire, String... reg) {
			List<String> list = Arrays.asList(reg);
			if (!isRequire) {
				for (String reg1 : regs) {
					if (!list.contains(reg1) && SymbolTable.get(reg1) == null) return reg1;
				}
				releaseRegs();
				for (String reg1 : regs) {
					if (!list.contains(reg1) && SymbolTable.get(reg1) == null) return reg1;
				}
				return null;
			}
			for (String reg1 : reg) {
				if (SymbolTable.get(reg1) == null) return reg1;
				String id = SymbolTable.get(reg1);
				if (ActiveTable.get(id) != null && ActiveTable.get(id).getLast() < index) {
					varDes.get(id).delete();
					varDes.remove(id);
					return reg1;
				}
			}
			return getNewReg();
		}

		public String getId(String pos) {
			if (isConst(pos)) return pos;
			if (SymbolTable.get(pos) == null) return null;
			return SymbolTable.get(pos);
		}

		public String getPos(String id) {
			if (isConst(id)) return id;
			if (varDes.get(id) == null) return null;
			return varDes.get(id).getFirstPos();
		}

		public String getMemPos(String id) {
			if (isConst(id)) return id;
			if (varDes.get(id) == null) return null;
			return varDes.get(id).getMemPos();
		}

		// 将标识符为id的变量，储存在位置pos中，pos可以是寄存器、局部变量、全局变量、临时变量、函数参数
		public void putVar(String id, String pos) {
			if (id == null || pos == null || isConst(id) || isInReg(id) != -1) return;
			if (varDes.get(id) == null) {
				PosInfo info = new PosInfo(id);
				info.putPos(pos);
				varDes.put(id, info);
			} else varDes.get(id).putPos(pos);
		}

		public void releaseRegs() {
			for (String reg : regs) {
				String id = SymbolTable.get(reg);
				if (ActiveTable.get(id) != null && ActiveTable.get(id).getLast() < index) {
					varDes.get(id).delete();
					varDes.remove(id);
				}
			}
		}

		public void releaseVar(String id, String pos) {
			if (varDes.get(id) != null) varDes.get(id).releaseVar(pos);
		}

		public void delete(String id) {
			if (varDes.get(id) != null) varDes.get(id).delete();
		}
	}

	public CCompiler(CInterpreter interpreter, String path) throws IOException {
		this.CQuats = interpreter.CQuats;
		this.ActiveTable = interpreter.ActiveTable;
		FileWriter fileWriter = new FileWriter(path);
		writer = new BufferedWriter(fileWriter);
		constList = new ArrayList<>();
		dataList = new ArrayList<>();
		codeList = new ArrayList<>();
		varDes = new HashMap<>();
		SymbolTable = new HashMap<>();
		util = new Util();
		arrayMap = new HashMap<>();
	}

	public void run() throws IOException {
		writer.write("""
				.386
				.model flat, stdcall
				option casemap:none
								
				""");
		writer.write("""
				include msvcrt.inc
				include kernel32.inc
				includelib msvcrt.lib
				includelib kernel32.lib
				scanf PROTO C:DWORD, :vararg
				printf PROTO C:DWORD, :vararg
				""");
		readExDecls();
		readFunc();
		constList.add("szPause db 'pause', 0");
		writer.write("\n.const\n");
		for (String s : constList) {
			writer.write(s + "\n");
		}
		writer.write("\n.data\n");
		for (String s : dataList) {
			writer.write(s + "\n");
		}
		writer.write("\n.code\n");
		for (String s : codeList) {
			writer.write(s + "\n");
		}
		writer.write("""
				start:
				\tcall main
				\tinvoke crt_system, addr szPause
				\tinvoke ExitProcess, 0
				end start
				""");
		writer.close();
	}

	private void readExDecls() {
		while (index < CQuats.size()) {
			CQuat cQuat = CQuats.get(index);
			String op = cQuat.getOp();
			switch (op) {
				case "var", "array", "pointer" -> {
					dataList.add(globalDeclaration(cQuat));
					index++;
				}
				case "funcDef" -> {
					StringBuilder builder = new StringBuilder(cQuat.getRes() + " proto ");
					index++;
					builder.append(readPara());
					codeList.add(builder.toString());
				}
				case "=" -> {
					adjustInit(cQuat);
					index++;
				}
				default -> {
					return;
				}
			}
		}
	}

	private String readPara() {
		int paraNum = 0;
		StringBuilder builder = new StringBuilder();
		while (index < CQuats.size()) {
			CQuat cQuat = CQuats.get(index);
			String op = cQuat.getOp();
			if (op.equals("param")) {
				if (paraNum != 0) builder.append(", ");
				builder.append(cQuat.getRes()).append(":").append(ascertainType(cQuat.getArg1()));
				paraNum++;
				util.putVar(cQuat.getRes(), "para");
				index++;
			} else break;
		}
		return builder.toString();
	}

	private void adjustInit(CQuat cQuat) {
		int i = 0;
		for (String s : dataList) {
			if (s.startsWith(cQuat.getRes())) {
				String[] ss = s.split(" ");
				if (cQuat.getArg1().startsWith("{")) {
					ss[2] = cQuat.getArg1().substring(1, cQuat.getArg1().length() - 1);
				} else ss[2] = cQuat.getArg1();
				dataList.set(i, ss[0] + " " + ss[1] + " " + ss[2]);
				break;
			}
			i++;
		}
	}

	private String globalDeclaration(CQuat cQuat) {
		util.putVar(cQuat.getRes(), "data");
		switch (cQuat.getOp()) {
			case "var", "pointer" -> {
				util.putVar(cQuat.getRes(), "data");
				return cQuat.getRes() + " " + ascertainType(cQuat.getArg1()) + " ?";
			}
			case "array" -> {
				util.putVar(cQuat.getRes(), "data");
				ArrayInfo info = new ArrayInfo();
				info.type = ArrayInfo.global;
				String[] nums = cQuat.getArg2().substring(1, cQuat.getArg2().length() - 1).split("]\\[");
				info.dim = nums.length;
				info.list = new ArrayList<>();
				for (String num : nums) info.list.add(Integer.parseInt(num));
				arrayMap.put(cQuat.getRes(), info);
				return cQuat.getRes() + " " + ascertainType(cQuat.getArg1()) + " " + generateArray(cQuat.getArg2());
			}
			default -> {
				return null;
			}
		}
	}

	private String generateArray(String array) {
		if (array.equals("")) return "0";
		return Integer.parseInt(array.substring(1, array.indexOf("]"))) + " dup(" +
				generateArray(array.substring(array.indexOf("]") + 1)) + ")";
	}

	private void readFunc() {
		StringBuilder argList = new StringBuilder();
		Map<String, ArrayList<String>> quote = new HashMap<>();
		while (index < CQuats.size()) {
			if (CQuats.get(index).getOp().equals("funcBegin")) {
				String func = CQuats.get(index).getRes();
				index++;
				codeList.add("\n" + func + " proc uses ebx esi edi " + readPara());
				readLocalDeclaration();
				boolean isEnd = false;
				while (index < CQuats.size() && !isEnd) {
					CQuat cQuat = CQuats.get(index);
					String op = cQuat.getOp();
					switch (op) {
						case "var", "array", "pointer" -> tempDeclaration(cQuat);
						case "arg" -> {
							if (argList.isEmpty()) util.releaseRegs();
							String arg = cQuat.getRes();
							if (arg.startsWith("\"")) {
								arg = setConst(func, arg);
								argList.append(" ,addr ").append(arg);
							} else argList.append(" ,").append(util.getPos(arg));
						}
						case "invoke" -> {
							util.putVar(cQuat.getRes(), "eax");
							boolean[] k = new boolean[2];
							if (SymbolTable.get("ecx") != null && ActiveTable.get(SymbolTable.get("ecx")).getLast() >= index) {
								codeList.add("\tpush ecx");
								k[0] = true;
							}
							if (SymbolTable.get("edx") != null && ActiveTable.get(SymbolTable.get("edx")).getLast() >= index) {
								codeList.add("\tpush edx");
								k[1] = true;
							}
							codeList.add("\tinvoke " + cQuat.getArg1() + argList);
							argList.setLength(0);
							if (k[1]) codeList.add("\tpop edx");
							if (k[0]) codeList.add("\tpop ecx");
						}
						case "label" -> codeList.add(cQuat.getRes() + ":");
						case "jmp" -> codeList.add("\tjmp " + cQuat.getRes());
						case "jz", "jnz" -> {
							String pos = util.getPos(cQuat.getArg1());
							codeList.add("\ttest " + pos + ", " + pos);
							codeList.add("\t" + op + " " + cQuat.getRes());
						}
						case "je" -> {
							codeList.add("\tcmp " + util.getPos(cQuat.getArg1()) + " " + util.getPos(cQuat.getArg2()));
							codeList.add("\tje " + cQuat.getRes());
						}
						case ".if" -> codeList.add("\t.if " + util.getPos(cQuat.getArg1()));
						case ".endif", ".else" -> codeList.add("\t" + op);
						case "ret" -> {
							if (!cQuat.getArg1().equals("")) {
								MOV("eax", util.getPos(cQuat.getArg1()), false);
							}
							codeList.add("\tret");
						}
						case "funcEnd" -> {
							isEnd = true;
							codeList.add(func + " endp");
						}
						case "=" -> {
							if (cQuat.getRes().startsWith("&")) {
								ArrayList<String> list = quote.get(cQuat.getRes());
								String reg = util.getNewReg(true, "esi");
								if (arrayMap.get(list.get(0)) == null) break;
								codeList.add("\tlea " + reg + ", " + util.getPos(list.get(0)));
								for (int i = 1; i < list.size(); i++) {
									int size = getArrayDimSize(list.get(0), i - 1);
									if (isConst(list.get(i)))
										codeList.add("\tlea " + reg + ", [" + reg + "+" + Integer.parseInt(list.get(i)) * size * 4 + "]");
									else {
										if (size == 1) {
											if (isMem(util.getPos(list.get(i)))) {
												String reg1 = util.getNewReg(false, reg);
												codeList.add("\tmov " + reg1 + ", " + util.getPos(list.get(i)));
												codeList.add("\tlea " + reg + ", [" + reg + "+" + reg1 + "*4]");
											} else {
												codeList.add("\tlea " + reg + ", [" + reg + "+" + util.getPos(list.get(i)) + "*4]");
											}
										} else {
											if (isMem(util.getPos(list.get(i)))) {
												String reg1 = util.getNewReg(false, reg);
												codeList.add("\tmov " + reg1 + ", " + util.getPos(list.get(i)));
												codeList.add("\timul " + reg1 + ", " + size);
												codeList.add("\tlea " + reg + ", [" + reg + "+" + reg1 + "*4]");
											} else {
												codeList.add("\timul " + util.getPos(list.get(i)) + ", " + size);
												codeList.add("\tlea " + reg + ", [" + reg + "+" + util.getPos(list.get(i)) + "*4]");
											}
										}
									}
								}
								if (isMem(util.getPos(cQuat.getArg1())) || isConst(cQuat.getArg1())) {
									String reg1 = util.getNewReg(false, reg);
									codeList.add("\tmov " + reg1 + ", " + util.getPos(cQuat.getArg1()));
									codeList.add("\tmov [" + reg + "], " + reg1);
								} else codeList.add("\tmov [" + reg + "], " + util.getPos(cQuat.getArg1()));
							} else if (cQuat.getRes().startsWith("%")) assiQuat(cQuat);
							else MOV(util.getPos(cQuat.getRes()), util.getPos(cQuat.getArg1()), false);
						}
						case "*=", "/=", "%=", "+=", "-=", "<<=", ">>=", "&=", "^=", "|=" -> {
							CQuat cQuat1 = new CQuat(op.substring(0, 1), cQuat.getRes(), cQuat.getArg1(), cQuat.getRes());
							basicQuat(cQuat1);
						}
						case "+", "-", "*", "/", "%", "||", "&&", "==", "!=", "<", ">", "<=", ">=" -> basicQuat(cQuat);
						case "++" -> {
							String pos = util.getMemPos(cQuat.getRes());
							if (pos == null) pos = util.getPos(cQuat.getRes());
							codeList.add("\tinc " + pos);
						}
						case "--" -> {
							String pos = util.getMemPos(cQuat.getRes());
							if (pos == null) pos = util.getPos(cQuat.getRes());
							codeList.add("\tdec " + pos);
						}
						case "~" -> codeList.add("\tnot " + util.getPos(cQuat.getRes()));
						case "!" -> {
							codeList.add("\tpush eax");
							codeList.add("\tmov eax, " + util.getPos(cQuat.getRes()));
							codeList.add("\ttest eax, eax");
							codeList.add("\tsetz al");
							codeList.add("\tmovzx eax, al");
							codeList.add("\tmov " + util.getPos(cQuat.getRes()) + ", eax");
							codeList.add("\tpop eax");
						}
						case "[]=" -> {
							ArrayList<String> list;
							if (cQuat.getArg1().startsWith("&"))
								list = quote.get(cQuat.getArg1());
							else {
								list = new ArrayList<>();
								list.add(cQuat.getArg1());
							}
							list.add(cQuat.getArg2());
							quote.put(cQuat.getRes(), list);
						}
						case "=[]" -> {
							String reg = util.getPos(cQuat.getArg1());
							if (reg == null || isInReg(reg) == -1 || ActiveTable.get(cQuat.getArg1()).getLast() > index)
								reg = util.getNewReg(true, "esi");
							ArrayList<String> list;
							if (cQuat.getArg1().startsWith("%"))
								list = quote.get(cQuat.getArg1());
							else {
								codeList.add("\tlea " + reg + ", " + util.getPos(cQuat.getArg1()));
								list = new ArrayList<>();
								list.add(cQuat.getArg1());
							}
							list.add(cQuat.getArg2());
							quote.put(cQuat.getRes(), list);
							int size = getArrayDimSize(list.get(0), list.size() - 2);
							if (isConst(cQuat.getArg2()))
								codeList.add("\tlea " + reg + ", [" + reg + "+" + Integer.parseInt(cQuat.getArg2()) * size * 4 + "]");
							else {
								if (size == 1) {
									if (isMem(util.getPos(cQuat.getArg2()))) {
										String reg1 = util.getNewReg(false, reg);
										codeList.add("\tmov " + reg1 + ", " + util.getPos(cQuat.getArg2()));
										codeList.add("\tlea " + reg + ", [" + reg + "+" + reg1 + "*4]");
									} else
										codeList.add("\tlea " + reg + ", [" + reg + "+" + util.getPos(cQuat.getArg2()) + "*4]");

								} else {
									if (isMem(util.getPos(cQuat.getArg2()))) {
										String reg1 = util.getNewReg(false, reg);
										codeList.add("\tmov " + reg1 + ", " + util.getPos(cQuat.getArg2()));
										codeList.add("\timul " + reg1 + ", " + size);
										codeList.add("\tlea " + reg + ", [" + reg + "+" + reg1 + "*4]");
									} else {
										codeList.add("\timul " + util.getPos(cQuat.getArg2()) + ", " + size);
										codeList.add("\tlea " + reg + ", [" + reg + "+" + util.getPos(cQuat.getArg2()) + "*4]");
									}
								}
							}
							util.putVar(cQuat.getRes(), reg);
							CQuat cQuat1 = CQuats.get(index + 1);
							if (cQuat1.getOp().equals("&") && cQuat1.getArg1().equals(cQuat.getRes())) {
								index++;
								util.putVar(cQuat1.getRes(), reg);
							} else if (list.size() == arrayMap.get(list.get(0)).dim + 1) {
								codeList.add("\tmov " + reg + ", [" + reg + "]");
								quote.clear();
							}
						}
						case "&" -> {
							String reg = util.getNewReg();
							util.putVar(cQuat.getRes(), reg);
							codeList.add("\tlea " + reg + ", " + util.getPos(cQuat.getArg1()));
						}
						default -> System.out.println("Unconsidered operator: " + op);
					}
					index++;
				}
				util.releaseRegs();
			}
		}
	}

	private void readLocalDeclaration() {
		while (index < CQuats.size()) {
			CQuat cQuat = CQuats.get(index);
			String op = cQuat.getOp();
			if (op.equals("var") || op.equals("array") || op.equals("pointer")) {
				if (op.equals("array")) {
					ArrayInfo info = new ArrayInfo();
					info.type = ArrayInfo.local;
					String[] nums = cQuat.getArg2().substring(1, cQuat.getArg2().length() - 1).split("]\\[");
					info.dim = nums.length;
					info.list = new ArrayList<>();
					for (String num : nums) info.list.add(Integer.parseInt(num));
					arrayMap.put(cQuat.getRes(), info);
				}
				codeList.add("\t" + localDeclaration(cQuat));
				index++;
			} else break;
		}
	}

	private String localDeclaration(CQuat cQuat) {
		String op = cQuat.getOp();
		switch (op) {
			case "var", "pointer" -> {
				util.putVar(cQuat.getRes(), "local");
				return "local " + cQuat.getRes() + ":" + ascertainType(cQuat.getArg1());
			}
			case "array" -> {
				util.putVar(cQuat.getRes(), "local");
				int k = 1;
				for (int i : arrayMap.get(cQuat.getRes()).list) k *= i;
				return "local " + cQuat.getRes() + "[" + k + "]:" + ascertainType(cQuat.getArg1());
			}
			default -> {
				return null;
			}
		}
	}

	private void tempDeclaration(CQuat cQuat) {
		String reg = util.getPos(cQuat.getRes());
		if (reg != null) return;
		util.releaseRegs();
		reg = util.getNewReg(true, "ecx");
		if (reg != null) {
			util.putVar(cQuat.getRes(), reg);
			return;
		}
		if (ActiveTable.get(cQuat.getRes()).getLast() > index) {
			String reg1 = regs[index % 6];
			MOV(util.getMemPos(util.getId(reg1)), reg1, true);
		} //else util.putVar(cQuat.getRes(), "tempData" + tempData++);
	}

	private String setConst(String func, String value) {
		String name = func + "StrConst" + constList.size();
		value = value.substring(1, value.length() - 1);
		String[] values = value.split("\\\\n", -1);
		StringBuilder builder = new StringBuilder(name + " db ");
		for (int i = 0; i < values.length; i++) {
			if (!values[i].equals("")) builder.append("'").append(values[i]).append("', ");
			if (i < values.length - 1) builder.append("0ah, ");
		}
		builder.append("0");
		constList.add(builder.toString());
		return name;
	}

	private String ascertainType(String specifier) {
		switch (specifier) {
			case "[char]":
				return "byte";
			case "[short]":
				return "word";
			case "[int]":
				return "dword";
			case "[long]":
				return "qword";
			case "[float]":
				return "real4";
			case "[double]":
				return "real8";
			default:
				System.out.println("Unrecognized specifier: " + specifier);
				return null;
		}
	}

	private void assiQuat(CQuat cQuat) {
		if (ActiveTable.get(cQuat.getRes()).getLast() <= index) return;
		String L = getreg(cQuat);
		String y_pos = util.getPos(cQuat.getArg1());
		if (!L.equals(y_pos)) {
			MOV(L, y_pos, false);
		}
		util.putVar(cQuat.getRes(), L);
	}

	private void basicQuat(CQuat cQuat) {
		String L = getreg(cQuat);
		String y_pos = util.getPos(cQuat.getArg1());
		if (!L.equals(y_pos)) {
			MOV(L, y_pos, false);
		}
		String z_pos = util.getPos(cQuat.getArg2());
		OP(cQuat.getOp(), L, z_pos);
		util.putVar(cQuat.getRes(), L);
	}

	private String getreg(CQuat cQuat) {
		String x_pos = util.getPos(cQuat.getRes());
		if (x_pos != null) return x_pos;
		String y_pos = util.getPos(cQuat.getArg1());
		if (y_pos != null && isInReg(y_pos) != -1 && ActiveTable.get(cQuat.getArg1()).getLast() <= index) return y_pos;
		String new_pos = util.getNewReg();
		if (new_pos != null) return new_pos;
		if (ActiveTable.get(cQuat.getRes()).getLast() > index) {
			String reg = regs[index % 6];
			MOV(util.getMemPos(util.getId(reg)), reg, true);
			return reg;
		} else return "tempData" + tempData++;
	}

	private void releaseReg(String reg) {
		if (SymbolTable.get(reg) == null) return;
		util.releaseVar(SymbolTable.get(reg), reg);
		SymbolTable.replace(reg, null);
	}

	private void MOV(String pos1, String pos2, boolean overwrite) {
		String id = util.getId(pos2);
		if (overwrite) {
			if (id == null) System.out.println("Unknown position");
			util.putVar(id, pos1);
		}
		if (isMem(pos1) && isMem(pos2)) {
			String reg = util.getNewReg();
			if (reg == null) {
				codeList.add("\tpush eax");
				codeList.add("\tmov eax, " + pos2);
				codeList.add("\tmov " + pos1 + ", eax");
				codeList.add("\tpop eax");
			} else {
				util.putVar(id, reg);
				codeList.add("\tmov " + reg + ", " + pos2);
				codeList.add("\tmov " + pos1 + ", " + reg);
			}
		} else codeList.add("\tmov " + pos1 + ", " + pos2);
	}

	private void OP(String op, String arg1, String arg2) {
		util.releaseRegs();
		if (isMem(arg1) && isMem(arg2)) {
			String reg = util.getNewReg(false, arg1);
			codeList.add("\tmov " + reg + ", " + arg2);
			arg2 = reg;
		}
		switch (op) {
			case "+" -> codeList.add("\tadd " + arg1 + ", " + arg2);
			case "-" -> codeList.add("\tsub " + arg1 + ", " + arg2);
			case "==", "!=", "<", ">", "<=", ">=" -> {
				codeList.add("\tcmp " + arg1 + ", " + arg2);
				String opre = switch (op) {
					case "==" -> "sete";
					case "!=" -> "setne";
					case "<" -> "setl";
					case ">" -> "setg";
					case "<=" -> "setle";
					case ">=" -> "setge";
					default -> "sete";
				};
				String regl = switch (arg1) {
					case "eax" -> "al";
					case "ebx" -> "bl";
					case "ecx" -> "cl";
					case "edx" -> "dl";
					default -> "none";
				};
				if (regl.equals("none") && SymbolTable.get("eax") != null) {
					codeList.add("\tpush eax");
					codeList.add("\t" + opre + " al");
					codeList.add("\tmovzx eax, al");
					codeList.add("\tmov " + arg1 + ", eax");
					codeList.add("\tpop eax");

				} else {
					codeList.add("\t" + opre + " " + regl);
					codeList.add("\tmovzx " + arg1 + ", " + regl);
				}
			}
			case "&&" -> codeList.add("\tand " + arg1 + ", " + arg2);
			case "||" -> codeList.add("\tor " + arg1 + ", " + arg2);
			case "*" -> codeList.add("\timul " + arg1 + ", " + arg2);
			case "/" -> {
				if (isConst(arg2)) {
					String reg = util.getNewReg(false, arg1, "eax", "edx");
					codeList.add("\tmov " + reg + ", " + arg2);
					arg2 = reg;
				}
				if (!arg1.equals("eax")) {
					codeList.add("\tpush eax");
					codeList.add("\tpush edx");
					codeList.add("\tmov eax, " + arg1);
					codeList.add("\tcdq");
					codeList.add("\tidiv " + arg2);
					codeList.add("\tmov " + arg1 + ", eax");
					codeList.add("\tpop edx");
					codeList.add("\tpop eax");
				} else {
					codeList.add("\tpush edx");
					codeList.add("\tidiv " + arg2);
					codeList.add("\tpop edx");
				}
			}
			case "%" -> {
				if (isConst(arg2)) {
					String reg = util.getNewReg(false, arg1, "eax", "edx");
					codeList.add("\tmov " + reg + ", " + arg2);
					arg2 = reg;
				}
				if (arg1.equals("eax")) {
					codeList.add("\tpush edx");
					codeList.add("\tcdq");
					codeList.add("\tidiv " + arg2);
					codeList.add("\tmov eax, edx");
					codeList.add("\tpop edx");
				} else if (arg1.equals("edx")) {
					codeList.add("\tpush eax");
					codeList.add("\tmov eax, edx");
					codeList.add("\tcdq");
					codeList.add("\tidiv " + arg2);
					codeList.add("\tpop eax");
				} else {
					codeList.add("\tpush eax");
					codeList.add("\tpush edx");
					codeList.add("\tmov eax, " + arg1);
					codeList.add("\tcdq");
					codeList.add("\tidiv " + arg2);
					codeList.add("\tmov " + arg1 + ", edx");
					codeList.add("\tpop edx");
					codeList.add("\tpop eax");
				}
			}
			default -> System.out.println("Unrecognized op");
		}
	}

}
