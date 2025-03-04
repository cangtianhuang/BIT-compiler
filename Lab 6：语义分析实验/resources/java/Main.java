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
		CharStream charStream = CharStreams.fromFileName(args[0]);
		lab6Lexer lexer = new lab6Lexer(charStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		lab6Parser parser = new lab6Parser(tokenStream);
		ParseTree tree = parser.translation_unit();
		CVisitor visitor = new CVisitor();
		visitor.visit(tree);
		System.out.println("Done");
	}
}
