import java.util.*;
/**
 * Created by onion on 2/1/17.
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
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CustomizedVisitor extends XPathBaseVisitor<LinkedList> {
    LinkedList<Node> currentNodes = new LinkedList<Node>();
    boolean hasAttribute = false;

    @Override
    public LinkedList<Node> visitDoc(XPathParser.DocContext ctx) {

        String fileName = ctx.FILENAME().getText();
        LinkedList<Node> curt = new LinkedList<Node>();
        LinkedList<Node> result = new LinkedList<Node>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(new File(fileName));
            //Element
            Element root = doc.getDocumentElement();
            root.normalize();
            //NodeList children = root.getChildNodes();
            //System.out.println("Root element :"
            //+ doc.getDocumentElement().getNodeName());

            //System.out.println(root.getChildNodes().item(2).getNodeValue());

            curt.add(root);
            currentNodes = curt;
            result = curt;
            NodeList childList = currentNodes.pollLast().getChildNodes();
            System.out.println(childList.getLength());
            /*
            for (int i = 0; i < childList.getLength(); i++) // 循环处理对象
            {
                System.out.print(i);
                Node son = childList.item(i);
                System.out.print(son.getNodeType());
                if (son.getNodeType() == Node.ELEMENT_NODE){
                    String name = son.getNodeName();
                    //String value = son.getFirstChild().getNodeValue();
                    //System.out.println(name+" : "+value);
                    System.out.print(name);
                }
                else{
                    System.out.print(son.getTextContent());
                    System.out.print(son.getNodeValue());

                }
                System.out.println();

            }


            //currentElement = rootElement;
            //ReadXml reader = new ReadXml();
            //reader.getPath(fileName);
            //reader.getFamilyMemebers();
            */
        } catch (Exception e) {
            System.out.println("exception:" + e.getMessage());
        }
        return result;
    }

    @Override public LinkedList<Node> visitDoubleAP(XPathParser.DoubleAPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitSingleAP(XPathParser.SingleAPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitAnyRP(XPathParser.AnyRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitBraceRP(XPathParser.BraceRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitDoubleSlashRP(XPathParser.DoubleSlashRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitTextRP(XPathParser.TextRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitAttRP(XPathParser.AttRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitParentRP(XPathParser.ParentRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitSelfRP(XPathParser.SelfRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitFilterRP(XPathParser.FilterRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitCommaRP(XPathParser.CommaRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitTagRP(XPathParser.TagRPContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitSingleSlashRp(XPathParser.SingleSlashRpContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitEqFilter(XPathParser.EqFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitRpFiter(XPathParser.RpFiterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitNotFilter(XPathParser.NotFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitAndFilter(XPathParser.AndFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitIsFilter(XPathParser.IsFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitBraceFilter(XPathParser.BraceFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitOrFilter(XPathParser.OrFilterContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitTagName(XPathParser.TagNameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public LinkedList<Node> visitAttName(XPathParser.AttNameContext ctx) { return visitChildren(ctx); }
}