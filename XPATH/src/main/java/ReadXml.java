import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
/**
 * Created by shirleyxie on 1/28/17.
 */

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

//import jdk.internal.org.xml.sax.EntityResolver;
//import jdk.internal.org.xml.sax.InputSource;
//import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.*;

import javax.xml.soap.Node.*;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
public class ReadXml {
    static Node rootNode;
    public static void getRootNode(String fileName){
        try{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fileName));
        Element rootElement = document.getDocumentElement();
        rootNode = (Node) rootElement;
        rootNode.normalize();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
