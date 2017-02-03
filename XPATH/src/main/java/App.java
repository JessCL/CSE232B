import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import java.util.*;
/**
 * Created by onion on 1/30/17.
 */
public class App {
    public static void main(String[] args) {
        try {
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//(ACT,PERSONAE)/TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/PERSONAE//PERSONA");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../*/.././TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[not(./TITLE)==(./TITLE)]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[(./TITLE)==(./TITLE)]/*");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/*/*/..");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./LINE]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")//ACT[./TITLE]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/ACT/SCENE");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"j_caesar.xml\")/(ACT,PERSONAE)");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actor[@id]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/actors");

            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor = ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor eq ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor == ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")//actors[./actor is ./actor]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*[not singer]");
            //ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*");
            ANTLRInputStream input = new ANTLRInputStream("doc(\"text1.xml\")/*[singer]");

            XPathLexer lexer = new XPathLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XPathParser parser = new XPathParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.ap();

            //for Visitor
            CustomizedVisitor customizedlVisitor = new CustomizedVisitor();
            LinkedList<Node> results = customizedlVisitor.visit(tree);



            WriteXml writer = new WriteXml();
            writer.getPath("result.xml");
            writer.setNodesToWrite(results);// c is the resulting linkedlist
            writer.createSon();



        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }


    }
}
