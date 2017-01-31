package com.company;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
/**
 * Created by shirleyxie on 1/28/17.
 */
public class ReadXml {
    static String xmlPath;
    public void getPath(String path) {
        this.xmlPath = path;
    }
    public static void getFamilyMemebers(){
        DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
        dbf.setIgnoringElementContentWhitespace(true);
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(xmlPath); // 使用dom解析xml文件

            NodeList sonlist = doc.getElementsByTagName("PLAY");
            for (int i = 0; i < sonlist.getLength(); i++) // 循环处理对象
            {
                Element son = (Element)sonlist.item(i);;

                for (Node node = son.getFirstChild(); node != null; node = node.getNextSibling()){
                    if (node.getNodeType() == Node.ELEMENT_NODE){
                        String name = node.getNodeName();
                        String value = node.getFirstChild().getNodeValue();
                        System.out.println(name+" : "+value);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
