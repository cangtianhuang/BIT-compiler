package lab3;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length < 2) {
			System.out.println("Please input two arguments: INFILE_NAME(*.c) OUTFILE_NAME");
			return;
		}
		String infile = args[0];
		String outfile = args[1];
		if (!infile.endsWith(".c")) {
			System.out.println("Incorrect input file:" + infile);
			return;
		}
		Reader reader = new FileReader(infile);
		FileWriter writer = new FileWriter(outfile);

		Lab3Scanner scanner = new Lab3Scanner(reader);
		scanner.yybegin(Lab3Scanner.YYINITIAL);
		int num = 0;
		while (!scanner.yyatEOF()) {
			MySymbol symbol = scanner.yylex();
			String strToken = "";

			strToken += "[@" + num + "," + symbol.yycolumn + ":" + (symbol.yycolumn + scanner.yylength() - 1);
			strToken += "='" + symbol.value + "',<" + symbol.getType() + ">," + (symbol.yyline + 1) + ":" + symbol.yycolumn + "]\n";
			System.out.print(strToken);
			writer.write(strToken);
			num++;
		}
		reader.close();
		writer.close();
	}
}
