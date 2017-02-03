//import com.sun.java.util.jar.pack.Package;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.LinkedList;

/**
 * Created by shirleyxie on 1/28/17.
 */
public class WriteXml {
    static String xmlPath;
    static String tagname;
    static String ctx;
    static LinkedList<Node> list;
    public void getPath(String path) {
        this.xmlPath = path;
    }
    public void setTagname(String tagname) { this.tagname = tagname; }
    public void setCtx(String ctx) { this.ctx = ctx; }
    public void setNodesToWrite(LinkedList<Node> list) { this.list = list; }
    public static void createSon() {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);

        try{
            XmlImpl dd=new XmlImpl();
            String str=xmlPath;
            dd.init();
            dd.createXml(str);    //创建xml

            DocumentBuilder db= dbf.newDocumentBuilder();
            //Document xmldoc = db.newDocument();
            //Document xmldoc= db.parse(xmlPath);
            Document xmldoc= db.parse(str);
            //Document importDoc = db.parse(originalxml);
            Element root = xmldoc.getDocumentElement();

            for(int i = 0; i < list.size(); i++) {
                Node cur = list.get(i);
                tagname = cur.getNodeName();
                if(tagname == "#text") {
                    Node newChild = xmldoc.createTextNode(cur.getTextContent());
                    root.appendChild(newChild);
                }else {
                    Node newChild = cur.cloneNode(true);
                    root.appendChild(xmldoc.importNode(cur, true));
                }

            }

            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer former = factory.newTransformer();
            former.transform(new DOMSource(xmldoc), new StreamResult(new File(str)));

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}