public class CQuat {
	private final String op;
	private final String arg1;
	private final String arg2;
	private String res;

	public CQuat(String op, String arg1, String arg2, String res) {
		this.op = op;
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.res = res;
	}

	public String getOp() {
		if (op == null) return "";
		return op;
	}

	public String getArg1() {
		if (arg1 == null) return "";
		return arg1;
	}

	public String getArg2() {
		if (arg2 == null) return "";
		return arg2;
	}

	public String getRes() {
		if (res == null) return "";
		return res;
	}

	public void setRes(String s) {
		res = s;
	}
}
