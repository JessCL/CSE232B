import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by onion on 1/30/17.
 */
public class App {
    public static void main(String[] args) {

        try {
            ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE");
            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.ap();

            //for Visitor
            CustomizedVisitor customizedlVisitor = new CustomizedVisitor();
            customizedlVisitor.visit(tree);

            /*for Listener
            ParseTreeWalker walker = new ParseTreeWalker();
            XPathBuilder builder = new XPathBuilder();
            walker.walk(builder,tree);
            */


        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }


    }
}
