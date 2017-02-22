import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.OutputKeys;
import org.w3c.dom.Document;
import java.io.*;
import java.util.LinkedList;

/**
 * Created by onion on 16/3/20.
 */
public class XQuery {

    public static void main(String[] args) throws IOException {
        try{
            String XQueryFilename = "input/XQuery4.txt";
            InputStream is = new FileInputStream(XQueryFilename);
            ANTLRInputStream input = new ANTLRInputStream(is);

            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();

            //for Visitor
            CustomizedXQueryVisitor visitor = new CustomizedXQueryVisitor();
            LinkedList<Node> results = visitor.visit(tree);
            System.out.println(results.get(0).getChildNodes().getLength());
            writeToFile(visitor.outputDoc, results, "output/XQuery4.xml");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }


    public static void writeToFile(Document doc, LinkedList<Node> result, String filePath) {
        doc.appendChild(result.get(0));
        try {
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            DOMSource source = new DOMSource(doc);
            StreamResult res = new StreamResult(filePath);
            transformer.transform(source, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
