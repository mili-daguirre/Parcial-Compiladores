import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "test.calc"; // Cambia si usas otro archivo
        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);

        CalcScriptLexer lexer = new CalcScriptLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcScriptParser parser = new CalcScriptParser(tokens);

        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
