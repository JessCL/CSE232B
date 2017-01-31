package com.company;

//import com.sun.java.util.jar.pack.Package;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * Created by shirleyxie on 1/28/17.
 */
public class WriteXml {
    static String xmlPath;
    public void getPath(String path) {
        this.xmlPath = path;
    }
    public static void createSon() {
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(false);

        try{

            DocumentBuilder db=dbf.newDocumentBuilder();
            Document xmldoc=db.parse(xmlPath);

            Element root = xmldoc.getDocumentElement();

            //删除指定节点

            Element son =xmldoc.createElement("PGROUP");
            son.setAttribute("PERSONA", "OCTAVIUS CAESAR");

            Element name = xmldoc.createElement("name");
            name.setTextContent("小儿子");
            son.appendChild(name);

            Element age = xmldoc.createElement("name");
            age.setTextContent("0");
            son.appendChild(age);


            root.appendChild(son);
            //保存
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer former = factory.newTransformer();
            former.transform(new DOMSource(xmldoc), new StreamResult(new File(xmlPath)));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
