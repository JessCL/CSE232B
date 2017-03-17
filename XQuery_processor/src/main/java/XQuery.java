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
            String XQueryFilename = "input/JoinTest1";
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
            LinkedList<Node> finalResult;
            if (results.size() == 1) {
                System.out.println(results.get(0).getChildNodes().getLength());
                finalResult = results;
            }
            else{
                System.out.println(results.size());
                finalResult = makeElem(visitor.outputDoc, "result", results);
            }
            writeToFile(visitor.outputDoc, finalResult, "output/JoinTest1.xml");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static LinkedList evalRewrited(String rewrited) {
        try {
            ANTLRInputStream input = new ANTLRInputStream(rewrited);
            XQueryLexer lexer = new XQueryLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            XQueryParser parser = new XQueryParser(tokens);
            parser.removeErrorListeners();
            ParseTree tree = parser.xq();

            //for Visitor
            CustomizedXQueryVisitor visitor = new CustomizedXQueryVisitor();
            visitor.needRewrite = false;
            LinkedList<Node> results = visitor.visit(tree);
            return results;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
        return null;

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
    private static LinkedList<Node> makeElem(Document doc, String tag, LinkedList<Node> list){
        Node result = doc.createElement(tag);
        for (Node node : list) {
            if (node != null) {
                Node newNode = doc.importNode(node, true);
                result.appendChild(newNode);
            }
        }
        LinkedList<Node> results = new LinkedList<>();
        results.add(result);
        return results;
    }

}
