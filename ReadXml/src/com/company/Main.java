package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

//import jdk.internal.org.xml.sax.EntityResolver;
//import jdk.internal.org.xml.sax.InputSource;
//import jdk.internal.org.xml.sax.SAXException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) {
       // System.setProperty("user.dir");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            /*builder.setEntityResolver(new EntityResolver() {
                @Override
                public InputSource resolveEntity(String publicId, String systemId)
                        throws SAXException, IOException {
                    if (systemId.contains("play.dtd")) {
                        return new InputSource(new FileReader("play.dtd"));
                    } else {
                        return null;
                    }
                }
            });*/
            Document document = builder.parse(new File("j_caesar.xml"));
            Element rootElement = document.getDocumentElement();

            NodeList list = rootElement.getElementsByTagName("TITLE");
            Element element = (Element) list.item(0);
            System.out.println(element.getChildNodes().item(0).getNodeValue());
            System.out.println("Main function works well");
        } catch (Exception e) {
            System.out.println("exception:" + e.getMessage());
        }
    }
}
