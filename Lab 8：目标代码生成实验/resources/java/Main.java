import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("ES00: Please run with file path.");
			return;
		}
		System.out.println("Start parsing...");
		CharStream charStream = CharStreams.fromFileName(args[0]);
		lab7Lexer lexer = new lab7Lexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		lab7Parser parser = new lab7Parser(tokenStream);
		ParseTree tree = parser.translation_unit();
		System.out.println("Parsing complete\nStart interpreting...");
		CInterpreter interpreter = new CInterpreter();
		interpreter.visit(tree);
		interpreter.printCQuats();
		System.out.println("Interpreting complete\nStart compiling");
		/*
		CVisitor visitor = new CVisitor();
		visitor.visit(tree);
		visitor.printCQuats();
		*/
		String path = "result.asm";
		CCompiler compiler = new CCompiler(interpreter, path);
		compiler.run();
		System.out.println("Compiling complete: " + path + "\nDone");
	}
}
