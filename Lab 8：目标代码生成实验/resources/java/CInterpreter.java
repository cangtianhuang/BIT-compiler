import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class CInterpreter extends lab7BaseVisitor<String> {

	enum Species {
		SIMPLE(0), ARRAY(1), POINTER(2), LABEL(4), STRUCT(8), UNION(16), ENUM(32), CLASS(64), FUNC(128);
		public final int value;

		Species(int value) {
			this.value = value;
		}
	}

	static class eachPointerInfo {
		ArrayList<String> qualifiers;
	}

	static class PointerInfo {
		int pointerNum = 0;
		ArrayList<eachPointerInfo> eachPointerInfos;
	}

	static class eachArrayInfo {
		ArrayList<String> qualifiers;
		String assiExpr;
	}

	static class ArrayInfo {
		int dimeNum = 0;
		ArrayList<eachArrayInfo> eachArrayInfos;
	}

	static class Info {
		String id;
		Token token;
		ArrayList<String> specifiers;
		int species = 0;
		PointerInfo pointerInfo;
		ArrayInfo arrayInfo;
	}

	static class FuncInfo {
		String id;
		Token token;
		ArrayList<String> specifiers;
		int species = 0;
		PointerInfo pointerInfo;
		ArrayInfo arrayInfo;
		Map<String, Info> para = new HashMap<>();
		// 是否已提前声明
		int preDefFlag = 0;
	}

	static class LabelInfo {
		String id;
		int defFlag;
		String label;
		ArrayList<Token> tokens = new ArrayList<>();
	}

	// 函数内存
	public final Map<String, FuncInfo> funcMemory;
	// 全局内存
	public final Map<String, Info> globalMemory;
	// 内存列表
	public final ArrayList<Map<String, Info>> memoryList;
	// 内存栈，实现层次化Scope
	public final Stack<Integer> memoryEnv;
	// 指向该函数信息
	FuncInfo thisFunc;
	// 参数添加标志，true表示应将函数的参数列表添加至局部内存中;预定义标志，true表示处于提前声明阶段
	private boolean paraAddedFlag, preDefFlag;

	// 全局临时变量
	private ArrayList<String> tempStringArray;
	private ArrayList<Info> tempInfoArray;
	private Info tempInfo;

	// CQuats列表，储存所有生成的四元式，即中间代码
	public final ArrayList<CQuat> CQuats;
	// 参数CQuats列表，储存参数生成的四元式，并在函数定义后全部加入CQuats中
	public final ArrayList<CQuat> paraCQuats;
	// 中间代码生成时使用的局部变量编号，从%0开始
	private int NEWTEMP;
	// 中间代码生成时使用的引用编号，用于数组、结构体成员的指代，从&0开始
	private int NEWREF;
	// 中间代码生成时使用的标签序号，从L0开始
	private int NEWLABEL;
	// 跳转表，用于label语句
	public final Map<String, LabelInfo> jumpTable;
	// 跳转环境，保存循环或switch语句块的层次结构
	private final ArrayList<loopSwitchEnv> jumpEnv;

	// 循环与switch选择语句环境，包围循环或switch语句块，用于break与continue判断
	class loopSwitchEnv {
		static int type_loop = 1, type_switch = 2;
		public int type;
		public String begin, end;

		public loopSwitchEnv(int type) {
			this.type = type;
			begin = "L" + NEWLABEL++;
			end = "N" + NEWLABEL++;
		}
	}

	// 是否为左值
	private boolean isLValue;
	// 变量活跃表，用于目标代码生成，判断是否可释放占用的寄存器
	public Map<String, LinkedList<Integer>> ActiveTable;
	// 在此处（CQuats.size()）该变量活跃，将其记录在活跃表中
	private void addActive(String... ids) {
		for (String id : ids) {
			if (id == null || CCompiler.isConst(id)) continue;
			if (ActiveTable.get(id) == null) {
				LinkedList<Integer> list = new LinkedList<>();
				list.add(CQuats.size());
				ActiveTable.put(id, list);
			} else ActiveTable.get(id).add(CQuats.size());
		}
	}

	public CInterpreter() {
		funcMemory = new HashMap<>();
		globalMemory = new HashMap<>();
		memoryList = new ArrayList<>();
		memoryEnv = new Stack<>();
		CQuats = new ArrayList<>();
		paraCQuats = new ArrayList<>();
		NEWTEMP = 0;
		jumpTable = new HashMap<>();
		jumpEnv = new ArrayList<>();
		paraAddedFlag = false;
		isLValue = false;
		preDefFlag = false;
		ActiveTable = new HashMap<>();

	}

	@Override
	public String visitTranslation_unit(lab7Parser.Translation_unitContext ctx) {
		memoryList.add(globalMemory);
		memoryEnv.push(0);
		preDefFlag = true;
		for (lab7Parser.External_declarationContext context : ctx.external_declaration()) {
			if (context.declaration() != null) visit(context.declaration());
		}
		preDefFlag = false;
		super.visitTranslation_unit(ctx);
		memoryEnv.pop();
		return null;
	}

	@Override
	public String visitFunction_definition(lab7Parser.Function_definitionContext ctx) {
		FuncInfo funcInfo = new FuncInfo();
		thisFunc = funcInfo;
		funcInfo.species |= Species.FUNC.value;
		visit(ctx.declaration_specifiers());
		funcInfo.specifiers = tempStringArray;
		visit(ctx.declarator());
		Info info = tempInfo;
		funcInfo.id = info.id;
		funcInfo.token = info.token;
		funcInfo.pointerInfo = info.pointerInfo;
		funcInfo.arrayInfo = info.arrayInfo;
		CQuats.add(new CQuat("funcBegin", funcInfo.specifiers.toString(), null, funcInfo.id));
		if (ctx.parameter_list() != null) {
			visit(ctx.parameter_list());
			for (CQuat cQuat : paraCQuats) {
				addActive(cQuat.getRes());
				CQuats.add(cQuat);
			}
			paraCQuats.clear();
			paraAddedFlag = true;
		}
		if (funcMemory.get(funcInfo.id) != null) {
			if (funcMemory.get(funcInfo.id).preDefFlag != 1)
				System.out.println(funcInfo.token + " ES02: Duplicate function definition: " + funcInfo.id);
			else {
				funcMemory.replace(funcInfo.id, funcInfo);
			}
		} else if (globalMemory.get(funcInfo.id) != null) {
			System.out.println(funcInfo.token + " ES02: Duplicate function definition: " + funcInfo.id);
		} else {
			funcMemory.put(funcInfo.id, funcInfo);
			globalMemory.put(funcInfo.id, info);
		}
		visit(ctx.compound_statement());
		for (String s : jumpTable.keySet()) {
			LabelInfo labelInfo = jumpTable.get(s);
			if (labelInfo.defFlag == 0) {
				for (Token token : labelInfo.tokens)
					System.out.println(token + " ES07: Goto target don't exist: " + token.getText());
			}
		}
		jumpTable.clear();
		CQuats.add(new CQuat("funcEnd", null, null, funcInfo.id));
		return null;
	}

	/**
	 * Generate tempStringArray
	 */
	@Override
	public String visitDeclaration_specifiers(lab7Parser.Declaration_specifiersContext ctx) {
		tempStringArray = new ArrayList<>();
		for (lab7Parser.Declaration_specifierContext specifier : ctx.declaration_specifier()) {
			tempStringArray.add(specifier.getText());
		}
		return null;
	}

	@Override
	public String visitDeclarator(lab7Parser.DeclaratorContext ctx) {
		visit(ctx.direct_declarator());
		if (ctx.pointer() != null) {
			visit(ctx.pointer());
		}
		return null;
	}

	/**
	 * Generate tempInfo
	 */
	@Override
	public String visitDirect_declarator_id(lab7Parser.Direct_declarator_idContext ctx) {
		tempInfo = new Info();
		tempInfo.id = ctx.IDENTIFIER().getText();
		tempInfo.token = ctx.IDENTIFIER().getSymbol();
		return null;
	}

	/**
	 * Generate ArrayInfo
	 */
	@Override
	public String visitDirect_declarator_array(lab7Parser.Direct_declarator_arrayContext ctx) {
		visit(ctx.direct_declarator());
		if (tempInfo.arrayInfo == null) {
			tempInfo.arrayInfo = new ArrayInfo();
			tempInfo.arrayInfo.eachArrayInfos = new ArrayList<>();
			tempInfo.species |= Species.ARRAY.value;
		}
		tempInfo.arrayInfo.dimeNum++;
		eachArrayInfo arrayInfo = new eachArrayInfo();
		arrayInfo.qualifiers = new ArrayList<>();
		for (lab7Parser.Type_qualifierContext context : ctx.type_qualifier()) {
			arrayInfo.qualifiers.add(context.getText());
		}
		if (ctx.assignment_expression() != null) arrayInfo.assiExpr = visit(ctx.assignment_expression());
		tempInfo.arrayInfo.eachArrayInfos.add(arrayInfo);
		return null;
	}

	@Override
	public String visitDirect_declarator_para(lab7Parser.Direct_declarator_paraContext ctx) {
		visit(ctx.direct_declarator());
		tempInfo.species |= Species.FUNC.value;
		FuncInfo funcInfo = new FuncInfo();
		funcInfo.id = tempInfo.id;
		funcInfo.token = tempInfo.token;
		funcInfo.specifiers = tempInfo.specifiers;
		funcInfo.pointerInfo = tempInfo.pointerInfo;
		funcInfo.arrayInfo = tempInfo.arrayInfo;
		funcInfo.preDefFlag = 1;
		thisFunc = funcInfo;
		Info info = tempInfo;
		if (ctx.parameter_list() != null) visit(ctx.parameter_list());
		tempInfo = info;
		return null;
	}

	/**
	 * Generate PointerInfo
	 */
	@Override
	public String visitPointer_tq(lab7Parser.Pointer_tqContext ctx) {
		tempInfo.pointerInfo = new PointerInfo();
		tempInfo.pointerInfo.eachPointerInfos = new ArrayList<>();
		tempInfo.species |= Species.POINTER.value;
		tempInfo.pointerInfo.pointerNum++;
		eachPointerInfo pointerInfo = new eachPointerInfo();
		pointerInfo.qualifiers = new ArrayList<>();
		for (lab7Parser.Type_qualifierContext context : ctx.type_qualifier()) {
			pointerInfo.qualifiers.add(context.getText());
		}
		tempInfo.pointerInfo.eachPointerInfos.add(pointerInfo);
		return null;
	}

	@Override
	public String visitPointer_recu(lab7Parser.Pointer_recuContext ctx) {
		visit(ctx.pointer());
		tempInfo.pointerInfo.pointerNum++;
		eachPointerInfo pointerInfo = new eachPointerInfo();
		pointerInfo.qualifiers = new ArrayList<>();
		for (lab7Parser.Type_qualifierContext context : ctx.type_qualifier()) {
			pointerInfo.qualifiers.add(context.getText());
		}
		tempInfo.pointerInfo.eachPointerInfos.add(pointerInfo);
		return null;
	}

	/**
	 * Generate thisFunc.para
	 */
	@Override
	public String visitParameter_list(lab7Parser.Parameter_listContext ctx) {
		if (thisFunc == null) return null;
		thisFunc.para = new HashMap<>();
		for (lab7Parser.Parameter_declarationContext context : ctx.parameter_declaration()) {
			visit(context);
			thisFunc.para.put(tempInfo.id, tempInfo);
			paraCQuats.add(new CQuat("param", tempInfo.specifiers.toString(), null, tempInfo.id));
		}
		return null;
	}

	/**
	 * Generate tempInfo
	 */
	@Override
	public String visitParameter_declaration(lab7Parser.Parameter_declarationContext ctx) {
		visit(ctx.declarator());
		visit(ctx.declaration_specifiers());
		tempInfo.specifiers = tempStringArray;
		return null;
	}

	@Override
	public String visitDeclaration(lab7Parser.DeclarationContext ctx) {
		if (ctx.init_declarator_list() == null) return null;
		if (!preDefFlag) {
			visit(ctx.init_declarator_list());
			return null;
		}
		visit(ctx.init_declarator_list());
		visit(ctx.declaration_specifiers());
		for (Info info : tempInfoArray) {
			info.specifiers = tempStringArray;
			if (memoryList.get(memoryEnv.peek()).get(info.id) != null) {
				System.out.println(info.token + " ES02: Duplicate definition: " + info.id);
			} else {
				if ((info.species & Species.FUNC.value) != 0) {
					if (funcMemory.get(thisFunc.id) != null || globalMemory.get(thisFunc.id) != null) {
						System.out.println(thisFunc.token + " ES02: Duplicate function definition: " + thisFunc.id);
					} else {
						funcMemory.put(thisFunc.id, thisFunc);
						globalMemory.put(info.id, info);
						CQuats.add(new CQuat("funcDef", info.specifiers.toString(), null, info.id));
						CQuats.addAll(paraCQuats);
						paraCQuats.clear();
					}
				} else {
					memoryList.get(memoryEnv.peek()).put(info.id, info);
					addActive(info.id);
					if (info.pointerInfo != null) {
						StringBuilder builder = new StringBuilder();
						for (eachPointerInfo pointerInfo : info.pointerInfo.eachPointerInfos) {
							builder.append("*");
							for (String s : pointerInfo.qualifiers) {
								builder.append(s).append(" ");
							}
						}
						CQuats.add(new CQuat("pointer", info.specifiers.toString(), builder.toString(), info.id));
					}
					if (info.arrayInfo != null) {
						StringBuilder builder = new StringBuilder();
						for (eachArrayInfo arrayInfo : info.arrayInfo.eachArrayInfos) {
							builder.append("[");
							for (String s : arrayInfo.qualifiers) {
								builder.append(s).append(" ");
							}
							builder.append(arrayInfo.assiExpr).append("]");
						}
						CQuats.add(new CQuat("array", info.specifiers.toString(), builder.toString(), info.id));
					} else CQuats.add(new CQuat("var", info.specifiers.toString(), null, info.id));
				}
			}
		}
		return null;
	}

	/**
	 * Generate tempInfoArray
	 */
	@Override
	public String visitInit_declarator_list(lab7Parser.Init_declarator_listContext ctx) {
		if (!preDefFlag) return super.visitInit_declarator_list(ctx);
		tempInfoArray = new ArrayList<>();
		for (lab7Parser.Init_declaratorContext context : ctx.init_declarator()) {
			visit(context);
			tempInfoArray.add(tempInfo);
		}
		return null;
	}

	@Override
	public String visitInit_declarator_decl(lab7Parser.Init_declarator_declContext ctx) {
		if (!preDefFlag) return null;
		return super.visitInit_declarator_decl(ctx);
	}

	@Override
	public String visitInit_declarator_decl_init(lab7Parser.Init_declarator_decl_initContext ctx) {
		visit(ctx.declarator());
		if (!preDefFlag) {
			String expr = visit(ctx.initializer());
			if (expr.startsWith("%")) {
				CQuat cQuat = CQuats.get(CQuats.size() - 1);
				if (cQuat.getRes().equals(expr)) {
					cQuat.setRes(tempInfo.id);
					ActiveTable.remove("%" + NEWTEMP);
					NEWTEMP--;
				}
			} else {
				addActive(expr, tempInfo.id);
				CQuats.add(new CQuat("=", expr, null, tempInfo.id));
			}
		}
		return null;
	}

	@Override
	public String visitInitializer_initL(lab7Parser.Initializer_initLContext ctx) {
		return '{' + visit(ctx.initializer_list()) + '}';
	}

	@Override
	public String visitInitializer_list(lab7Parser.Initializer_listContext ctx) {
		StringBuilder builder = new StringBuilder();
		for (lab7Parser.InitializerContext context : ctx.initializer()) {
			if (builder.length() != 0) builder.append(",");
			builder.append(visit(context));
		}
		return builder.toString();
	}

	@Override
	public String visitCompound_statement(lab7Parser.Compound_statementContext ctx) {
		Map<String, Info> localMemory = new HashMap<>();
		if (paraAddedFlag) {
			localMemory.putAll(thisFunc.para);
			paraAddedFlag = false;
		}
		memoryList.add(localMemory);
		memoryEnv.push(memoryList.size() - 1);
		preDefFlag = true;
		for (lab7Parser.Block_itemContext context : ctx.block_item()) {
			if (context.declaration() != null) visit(context.declaration());
		}
		preDefFlag = false;
		super.visitCompound_statement(ctx);
		memoryEnv.pop();
		return null;
	}

	@Override
	public String visitLabel_id(lab7Parser.Label_idContext ctx) {
		Token token = ctx.IDENTIFIER().getSymbol();
		if (jumpTable.get(token.getText()) != null) {
			LabelInfo labelInfo = jumpTable.get(token.getText());
			if (labelInfo.defFlag == 1)
				System.out.println(token + " ES02: Duplicate definition: " + token.getText());
			else {
				labelInfo.defFlag = 1;
				labelInfo.label = "L" + NEWLABEL++;
				labelInfo.tokens.clear();
				labelInfo.tokens.add(token);
				CQuats.add(new CQuat("label", null, null, labelInfo.label));
			}
		} else {
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.id = token.getText();
			labelInfo.defFlag = 1;
			labelInfo.tokens.add(token);
			jumpTable.put(labelInfo.id, labelInfo);
		}
		visit(ctx.statement());
		return null;
	}

	@Override
	public String visitLabel_case(lab7Parser.Label_caseContext ctx) {
		int k = jumpEnv.size() - 1;
		for (; k >= 0; k--) {
			if (jumpEnv.get(k).type == loopSwitchEnv.type_switch) break;
		}
		if (k < 0)
			System.out.println(ctx.CASE().getSymbol() + " ES03: 'case' is not in switch statement");
		else {
			String expr = visit(ctx.conditional_expression());
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.id = expr;
			labelInfo.defFlag = 1;
			labelInfo.label = "L" + NEWLABEL++;
			addActive(expr);
			jumpTable.put("case:" + expr, labelInfo);
			CQuats.add(new CQuat("label", null, null, labelInfo.label));
			visit(ctx.statement());
		}
		return null;
	}

	@Override
	public String visitLabel_def(lab7Parser.Label_defContext ctx) {
		int k = jumpEnv.size() - 1;
		for (; k >= 0; k--) {
			if (jumpEnv.get(k).type == loopSwitchEnv.type_switch) break;
		}
		if (k < 0)
			System.out.println(ctx.DEFAULT().getSymbol() + " ES03: 'default' is not in switch statement");
		else {
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.id = null;
			labelInfo.defFlag = 1;
			labelInfo.label = "L" + NEWLABEL++;
			jumpTable.put("def:", labelInfo);
			CQuats.add(new CQuat("label", null, null, labelInfo.label));
			visit(ctx.statement());
		}
		return null;
	}

	@Override
	public String visitSelect_if(lab7Parser.Select_ifContext ctx) {
		String cond = visit(ctx.expression());
		addActive(cond);
		CQuats.add(new CQuat(".if", cond, null, null));
		visit(ctx.statement());
		CQuats.add(new CQuat(".endif", null, null, null));
		return null;
	}

	@Override
	public String visitSelect_ifelse(lab7Parser.Select_ifelseContext ctx) {
		String cond = visit(ctx.expression());
		addActive(cond);
		CQuats.add(new CQuat(".if", cond, null, null));
		visit(ctx.statement(0));
		CQuats.add(new CQuat(".else", null, null, null));
		visit(ctx.statement(1));
		CQuats.add(new CQuat(".endif", null, null, null));
		return null;
	}

	@Override
	public String visitSelect_switch(lab7Parser.Select_switchContext ctx) {
		loopSwitchEnv env = new loopSwitchEnv(loopSwitchEnv.type_switch);
		String cond = visit(ctx.expression());
		jumpEnv.add(env);
		String test = "L" + NEWLABEL++;
		CQuats.add(new CQuat("jmp", null, null, test));
		visit(ctx.statement());
		CQuats.add(new CQuat("jmp", null, null, env.end));
		CQuats.add(new CQuat("label", null, null, test));
		for (String s : jumpTable.keySet()) {
			if (s.startsWith("case:")) {
				LabelInfo labelInfo = jumpTable.get(s);
				addActive(cond, labelInfo.id);
				CQuats.add(new CQuat("je", cond, labelInfo.id, labelInfo.label));
				jumpTable.remove(s);
			} else if (s.startsWith("def:")) {
				LabelInfo labelInfo = jumpTable.get(s);
				CQuats.add(new CQuat("jmp", null, null, labelInfo.label));
				jumpTable.remove(s);
			}
		}
		CQuats.add(new CQuat("label", null, null, env.end));
		jumpEnv.remove(jumpEnv.size() - 1);
		return null;
	}

	@Override
	public String visitLoop_while(lab7Parser.Loop_whileContext ctx) {
		loopSwitchEnv env = new loopSwitchEnv(loopSwitchEnv.type_loop);
		jumpEnv.add(env);
		CQuats.add(new CQuat("label", null, null, env.begin));
		String cond = visit(ctx.expression());
		addActive(cond);
		CQuats.add(new CQuat("jz", cond, null, env.end));
		visit(ctx.statement());
		CQuats.add(new CQuat("jmp", null, null, env.begin));
		CQuats.add(new CQuat("label", null, null, env.end));
		jumpEnv.remove(jumpEnv.size() - 1);
		return null;
	}

	@Override
	public String visitLoop_dowhile(lab7Parser.Loop_dowhileContext ctx) {
		loopSwitchEnv env = new loopSwitchEnv(loopSwitchEnv.type_loop);
		jumpEnv.add(env);
		CQuats.add(new CQuat("label", null, null, env.begin));
		visit(ctx.statement());
		String cond = visit(ctx.expression());
		addActive(cond);
		CQuats.add(new CQuat("jnz", cond, null, env.begin));
		CQuats.add(new CQuat("label", null, null, env.end));
		jumpEnv.remove(jumpEnv.size() - 1);
		return null;
	}

	@Override
	public String visitLoop_for(lab7Parser.Loop_forContext ctx) {
		int[] flag = new int[3];
		switch (ctx.expression().size()) {
			case 1 -> {
				if (ctx.getChild(2) instanceof lab7Parser.ExpressionContext) {
					flag[0] = 1;
				} else if (ctx.getChild(3) instanceof lab7Parser.ExpressionContext) {
					flag[1] = 1;
				} else flag[2] = 1;
			}
			case 2 -> {
				if (ctx.getChild(2) instanceof TerminalNode) {
					flag[1] = flag[2] = 1;
				} else if (ctx.getChild(4) instanceof TerminalNode) {
					flag[0] = flag[2] = 1;
				} else {
					flag[0] = flag[1] = 1;
				}
			}
			case 3 -> flag[0] = flag[1] = flag[2] = 1;
			default -> {
			}
		}
		if (flag[0] == 1) visit(ctx.expression(0));
		loopSwitchEnv env = new loopSwitchEnv(loopSwitchEnv.type_loop);
		jumpEnv.add(env);
		CQuats.add(new CQuat("label", null, null, env.begin));
		if (flag[1] == 1) {
			String cond;
			if (flag[0] == 1) cond = visit(ctx.expression(1));
			else cond = visit(ctx.expression(0));
			addActive(cond);
			CQuats.add(new CQuat("jz", cond, null, env.end));
		}
		visit(ctx.statement());
		if (flag[2] == 1) {
			if (flag[0] == 1 && flag[1] == 1) visit(ctx.expression(2));
			else if (flag[0] == 1 || flag[1] == 1) visit(ctx.expression(1));
			else visit(ctx.expression(0));
		}
		CQuats.add(new CQuat("jmp", null, null, env.begin));
		CQuats.add(new CQuat("label", null, null, env.end));
		jumpEnv.remove(jumpEnv.size() - 1);
		return null;
	}

	@Override
	public String visitLoop_for_dec(lab7Parser.Loop_for_decContext ctx) {
		Map<String, Info> localMemory = new HashMap<>();
		memoryList.add(localMemory);
		memoryEnv.push(memoryList.size() - 1);
		int[] flag = new int[2];
		if (ctx.expression().size() == 1) {
			if (ctx.getChild(3) instanceof TerminalNode) {
				flag[1] = 1;
			} else flag[0] = 1;
		} else if (ctx.expression().size() == 2) flag[0] = flag[1] = 1;
		preDefFlag = true;
		visitDeclaration(ctx.declaration());
		preDefFlag = false;
		visitDeclaration(ctx.declaration());
		for (Info info : tempInfoArray) {
			localMemory.put(info.id, info);
		}
		loopSwitchEnv env = new loopSwitchEnv(loopSwitchEnv.type_loop);
		jumpEnv.add(env);
		CQuats.add(new CQuat("label", null, null, env.begin));
		if (flag[0] == 1) {
			String cond = visit(ctx.expression(0));
			addActive(cond);
			CQuats.add(new CQuat("jz", cond, null, env.end));
		}
		visit(ctx.statement());
		if (flag[1] == 1) {
			if (flag[0] == 1) visit(ctx.expression(1));
			else visit(ctx.expression(0));
		}
		CQuats.add(new CQuat("jmp", null, null, env.begin));
		CQuats.add(new CQuat("label", null, null, env.end));
		jumpEnv.remove(jumpEnv.size() - 1);
		memoryEnv.pop();
		return null;
	}

	@Override
	public String visitJump_goto(lab7Parser.Jump_gotoContext ctx) {
		Token token = ctx.IDENTIFIER().getSymbol();
		if (jumpTable.get(token.getText()) == null) {
			LabelInfo labelInfo = new LabelInfo();
			labelInfo.id = token.getText();
			labelInfo.defFlag = 0;
			labelInfo.label = token.getText();
			labelInfo.tokens.add(token);
			jumpTable.put(labelInfo.id, labelInfo);
			CQuats.add(new CQuat("jmp", null, null, labelInfo.label));
		} else {
			LabelInfo labelInfo = jumpTable.get(token.getText());
			if (labelInfo.defFlag == 0) {
				labelInfo.tokens.add(token);
			}
			CQuats.add(new CQuat("jmp", null, null, labelInfo.label));
		}
		return null;
	}

	@Override
	public String visitJump_cont(lab7Parser.Jump_contContext ctx) {
		int k = jumpEnv.size() - 1;
		for (; k >= 0; k--) {
			if (jumpEnv.get(k).type == loopSwitchEnv.type_loop) break;
		}
		if (k < 0) System.out.println(ctx.CONTINUE().getSymbol() + " ES03: 'continue' is not in loop statement");
		else CQuats.add(new CQuat("jmp", null, null, jumpEnv.get(k).begin));
		return null;
	}

	@Override
	public String visitJump_break(lab7Parser.Jump_breakContext ctx) {
		if (jumpEnv.isEmpty())
			System.out.println(ctx.BREAK().getSymbol() + " ES03: 'break' is not in loop or switch statement");
		else {
			CQuats.add(new CQuat("jmp", null, null, jumpEnv.get(jumpEnv.size() - 1).end));
		}
		return null;
	}

	@Override
	public String visitJump_ret(lab7Parser.Jump_retContext ctx) {
		String expr = null;
		if (ctx.expression() != null) {
			expr = visit(ctx.expression());
		}
		addActive(expr);
		CQuats.add(new CQuat("ret", expr, null, null));
		return null;
	}

	@Override
	public String visitExpr_recu(lab7Parser.Expr_recuContext ctx) {
		visit(ctx.expression());
		return visit(ctx.assignment_expression());
	}

	@Override
	public String visitAssi_recu(lab7Parser.Assi_recuContext ctx) {
		String expr = visit(ctx.assignment_expression());
		isLValue = true;
		String expr1 = visit(ctx.unary_expression());
		isLValue = false;
		if (ctx.assignment_operator().getText().equals("=")) {
			if (expr.startsWith("%") && !expr1.startsWith("&")) {
				CQuat cQuat = CQuats.get(CQuats.size() - 1);
				if (cQuat.getRes().equals(expr)) {
					cQuat.setRes(expr1);
					ActiveTable.remove("%" + NEWTEMP);
					NEWTEMP--;
					return expr1;
				}
			}
		}
		addActive(expr, expr1);
		CQuats.add(new CQuat(ctx.assignment_operator().getText(), expr, null, expr1));
		return expr1;
	}

	@Override
	public String visitCond_recu(lab7Parser.Cond_recuContext ctx) {
		String expr = visit(ctx.logical_or_expression());
		addActive(expr);
		CQuats.add(new CQuat("jz", expr, null, null));
		int temp = CQuats.size() - 1;
		String expr1 = visit(ctx.expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, res);
		CQuats.add(new CQuat("=", expr1, null, res));
		CQuats.add(new CQuat("j", null, null, null));
		CQuats.get(temp).setRes(String.valueOf(CQuats.size()));
		temp = CQuats.size() - 1;
		String expr2 = visit(ctx.conditional_expression());
		addActive(expr2, res);
		CQuats.add(new CQuat("=", expr2, null, res));
		CQuats.get(temp).setRes(String.valueOf(CQuats.size()));
		return res;
	}

	@Override
	public String visitLog_or_recu(lab7Parser.Log_or_recuContext ctx) {
		String expr1 = visit(ctx.logical_or_expression());
		String expr2 = visit(ctx.logical_and_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.LOR().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitLog_and_recu(lab7Parser.Log_and_recuContext ctx) {
		String expr1 = visit(ctx.logical_and_expression());
		String expr2 = visit(ctx.inclusive_or_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.LAND().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitIn_or_recu(lab7Parser.In_or_recuContext ctx) {
		String expr1 = visit(ctx.inclusive_or_expression());
		String expr2 = visit(ctx.exclusive_or_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.OR().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitEx_or_recu(lab7Parser.Ex_or_recuContext ctx) {
		String expr1 = visit(ctx.exclusive_or_expression());
		String expr2 = visit(ctx.and_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.XOR().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitAnd_recu(lab7Parser.And_recuContext ctx) {
		String expr1 = visit(ctx.and_expression());
		String expr2 = visit(ctx.equality_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.AND().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitEq_recu(lab7Parser.Eq_recuContext ctx) {
		String expr1 = visit(ctx.equality_expression());
		String expr2 = visit(ctx.relational_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.equality_operator().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitRela_recu(lab7Parser.Rela_recuContext ctx) {
		String expr1 = visit(ctx.relational_expression());
		String expr2 = visit(ctx.shift_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.relational_operator().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitShift_recu(lab7Parser.Shift_recuContext ctx) {
		String expr1 = visit(ctx.shift_expression());
		String expr2 = visit(ctx.additive_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.shift_operator().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitAddi_recu(lab7Parser.Addi_recuContext ctx) {
		String expr1 = visit(ctx.additive_expression());
		String expr2 = visit(ctx.multiplicative_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.additive_operator().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitMul_recu(lab7Parser.Mul_recuContext ctx) {
		String expr1 = visit(ctx.multiplicative_expression());
		String expr2 = visit(ctx.cast_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, expr2, res);
		CQuats.add(new CQuat(ctx.multiplicative_operator().getText(), expr1, expr2, res));
		return res;
	}

	@Override
	public String visitCast_recu(lab7Parser.Cast_recuContext ctx) {
		String expr = visit(ctx.cast_expression());
		addActive(expr);
		CQuats.add(new CQuat("cast", ctx.type_name().getText(), null, expr));
		return expr;
	}

	@Override
	public String visitUnary_recu_INC_DEC(lab7Parser.Unary_recu_INC_DECContext ctx) {
		if (isLValue) {
			ParseTree o = ctx.inc_dec_operator().getChild(0);
			if (o instanceof TerminalNode node) {
				System.out.println(node.getSymbol() + " ES09: wrong left value: " + ctx.getText());
			}
			return null;
		}
		String expr = visit(ctx.unary_expression());
		addActive(expr);
		CQuats.add(new CQuat(ctx.inc_dec_operator().getText(), null, null, expr));
		return expr;
	}

	@Override
	public String visitUnary_cast(lab7Parser.Unary_castContext ctx) {
		if (isLValue) {
			ParseTree o = ctx.unary_opeartor().getChild(0);
			if (o instanceof TerminalNode node) {
				System.out.println(node.getSymbol() + " ES09: wrong left value: " + ctx.getText());
			}
			return null;
		}
		String expr = visit(ctx.cast_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr, res);
		CQuats.add(new CQuat(ctx.unary_opeartor().getText(), expr, null, res));
		return res;
	}

	@Override
	public String visitUnary_recu_sizeof(lab7Parser.Unary_recu_sizeofContext ctx) {
		if (isLValue) {
			System.out.println(ctx.SIZEOF().getSymbol() + " ES09: wrong left value: " + ctx.getText());
			return null;
		}
		String expr1 = visit(ctx.unary_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr1, res);
		CQuats.add(new CQuat("sizeof", expr1, null, res));
		return res;
	}

	@Override
	public String visitUnary_sizeof(lab7Parser.Unary_sizeofContext ctx) {
		if (isLValue) {
			System.out.println(ctx.SIZEOF().getSymbol() + " ES09: wrong left value: " + ctx.getText());
			return null;
		}
		String res = "%" + NEWTEMP++;
		addActive(res);
		CQuats.add(new CQuat("sizeof", ctx.type_name().getText(), null, res));
		return res;
	}

	@Override
	public String visitPost_recu_array(lab7Parser.Post_recu_arrayContext ctx) {
		String expr1 = visit(ctx.postfix_expression());
		String expr2 = visit(ctx.expression());
		if (isLValue) {
			String ref = "&" + NEWREF++;
			addActive(expr1, expr2, ref);
			CQuats.add(new CQuat("[]=", expr1, expr2, ref));
			return ref;
		} else {
			String res = "%" + NEWTEMP++;
			addActive(expr1, expr2, res);
			CQuats.add(new CQuat("=[]", expr1, expr2, res));
			return res;
		}
	}

	@Override
	public String visitPost_recu_argu(lab7Parser.Post_recu_arguContext ctx) {
		if (isLValue) {
			System.out.println(ctx.LP().getSymbol() + " ES09: wrong left value: " + ctx.getText());
			return null;
		}
		String expr1 = visit(ctx.postfix_expression());
		if (ctx.argument_expression_list() != null) visit(ctx.argument_expression_list());
		String res = "%" + NEWTEMP++;
		addActive(res);
		CQuats.add(new CQuat("invoke", expr1, null, res));
		return res;
	}

	@Override
	public String visitPost_recu_INC_DEC(lab7Parser.Post_recu_INC_DECContext ctx) {
		/*
		if (isLValue) {
			ParseTree o = ctx.inc_dec_operator().getChild(0);
			if (o instanceof TerminalNode node) {
				System.out.println(node.getSymbol() + " ES09: wrong left value: " + ctx.getText());
			}
			return null;
		}
		*/
		String expr = visit(ctx.postfix_expression());
		String res = "%" + NEWTEMP++;
		addActive(expr, res);
		CQuats.add(new CQuat("=", expr, null, res));
		addActive(expr);
		CQuats.add(new CQuat(ctx.inc_dec_operator().getText(), null, null, expr));
		return res;
	}

	@Override
	public String visitPost_recu_arrow(lab7Parser.Post_recu_arrowContext ctx) {
		String expr = visit(ctx.postfix_expression());
		if (isLValue) {
			String ref = "&" + NEWREF++;
			addActive(expr, ref);
			CQuats.add(new CQuat("->=", expr, ctx.IDENTIFIER().getText(), ref));
			return ref;
		} else {
			String res = "%" + NEWTEMP++;
			addActive(expr, res);
			CQuats.add(new CQuat("=->", expr, ctx.IDENTIFIER().getText(), res));
			return res;
		}
	}

	@Override
	public String visitPost_recu_doc(lab7Parser.Post_recu_docContext ctx) {
		String expr = visit(ctx.postfix_expression());
		if (isLValue) {
			String ref = "&" + NEWREF++;
			addActive(expr, ref);
			CQuats.add(new CQuat(".=", expr, ctx.IDENTIFIER().getText(), ref));
			return ref;
		} else {
			String res = "%" + NEWTEMP++;
			addActive(expr, res);
			CQuats.add(new CQuat("=.", expr, ctx.IDENTIFIER().getText(), res));
			return res;
		}
	}

	@Override
	public String visitArgument_expression_list(lab7Parser.Argument_expression_listContext ctx) {
		ArrayList<String> exprs = new ArrayList<>();
		for (lab7Parser.Assignment_expressionContext context : ctx.assignment_expression()) {
			String expr = visit(context);
			exprs.add(expr);
		}
		for (String expr : exprs) {
			addActive(expr);
			CQuats.add(new CQuat("arg", null, null, expr));
		}
		return null;
	}

	@Override
	public String visitPrim_id(lab7Parser.Prim_idContext ctx) {
		Token token = ctx.IDENTIFIER().getSymbol();
		if (token.getText().equals("printf") || token.getText().equals("scanf")) return token.getText();
		if (isDefined(token.getText()) == -1)
			System.out.println(token + " ES01: Undefined identifier: " + token.getText());
		return token.getText();
	}

	@Override
	public String visitPrim_cons(lab7Parser.Prim_consContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitPrim_str(lab7Parser.Prim_strContext ctx) {
		return ctx.getText();
	}

	@Override
	public String visitPrim_expr(lab7Parser.Prim_exprContext ctx) {
		return visit(ctx.expression());
	}

	private int isDefined(String id) {
		int layer = -1;
		for (Integer integer : memoryEnv) {
			if (memoryList.get(integer).get(id) != null) layer = integer;
		}
		return layer;
	}

	public void printCQuats() {
		int i = 0;
		for (CQuat cQuat : CQuats) {
			System.out.println(i + ". ( " + cQuat.getOp() + " , " + cQuat.getArg1() + " , "
					+ cQuat.getArg2() + " , " + cQuat.getRes() + " ) ");
			i++;
		}
	}
}
