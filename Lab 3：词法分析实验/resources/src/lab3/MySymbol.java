package lab3;

public class MySymbol {
	final int type, yyline, yycolumn;
	final String value;

	MySymbol(int type, int yyline, int yycolumn, String value) {
		this.type = type;
		this.yyline = yyline;
		this.yycolumn = yycolumn;
		this.value = value;
	}

	public String getType(){
		switch (type){
			case 1001:return "KeyWord";
			case 1002:return "Identifier";
			case 1003:return "Integer";
			case 1004:return "Float";
			case 1005:return "ConstString";
			case 1006:return "String";
			case 1007:return "Operator";
			case 1008:return "EOF";
			default:return "";
		}
	}

	public static int KeyWord = 1001, Identifier = 1002, Integer = 1003, Float = 1004;
	public static int ConstString = 1005, String = 1006, Operator = 1007, EOF = 1008;
}
