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
import org.w3c.dom.*;

import javax.xml.soap.Node.*;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class CustomizedVisitor extends XPathBaseVisitor<LinkedList> {
    LinkedList<Node> currentNodes = new LinkedList<Node>();

    @Override
    public LinkedList<Node> visitDoc(XPathParser.DocContext ctx){
        String filename = ctx.filename().getText();
        ReadXml.getRootNode(filename);
        Node rootNode = ReadXml.rootNode;
        currentNodes.add(rootNode);
        return currentNodes;
    }


    @Override public LinkedList<Node> visitDoubleAP(XPathParser.DoubleAPContext ctx) {
        visit(ctx.doc());
        LinkedList<Node> descendents = getDescendents(currentNodes);
        currentNodes.addAll(descendents);
        return visit(ctx.rp());
    }

    @Override public LinkedList<Node> visitSingleAP(XPathParser.SingleAPContext ctx) {
        visit(ctx.doc());
        return visit(ctx.rp());
    }

    @Override public LinkedList<Node> visitChildrenRP(XPathParser.ChildrenRPContext ctx) {
        LinkedList<Node> results = getChildren(currentNodes);
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitBraceRP(XPathParser.BraceRPContext ctx) { return visit(ctx.rp()); }

    @Override public LinkedList<Node> visitSingleSlashRP(XPathParser.SingleSlashRPContext ctx) {
        visit(ctx.rp(0));
        return visit(ctx.rp(1));
    }

    @Override public LinkedList<Node> visitDoubleSlashRP(XPathParser.DoubleSlashRPContext ctx) {
        visit(ctx.rp(0));
        LinkedList<Node> descendents = getDescendents(currentNodes);
        currentNodes.addAll(descendents);
        return visit(ctx.rp(1));
    }

    @Override public LinkedList<Node> visitTextRP(XPathParser.TextRPContext ctx) {
         LinkedList<Node> childrenList = getChildren(currentNodes);
         for (Node child: childrenList)
             if (child.getNodeType() == javax.xml.soap.Node.TEXT_NODE && !child.getTextContent().equals("\n") && !child.getTextContent().equals("\n\n")) {
                    System.out.print(child.getNodeValue());
             }
         return currentNodes;
    }

    @Override public LinkedList<Node> visitAttRP(XPathParser.AttRPContext ctx) {
        LinkedList<Node> results= new LinkedList<Node>();
        String attName = ctx.attName().getText();
        for (Node node : currentNodes)
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element e = (Element) node;
                String attValue = e.getAttribute(attName);
                if (!attValue.equals("")) {
                    results.add(node);
                    System.out.println("Attribute "+attName + " = " + attValue);
                }
            }

        currentNodes = results; //return nodes that has attribute name attName
        return results;
    }

    @Override public LinkedList<Node> visitParentRP(XPathParser.ParentRPContext ctx) {
        currentNodes = getParents(currentNodes);
        LinkedList<Node> results = currentNodes;
        return results;
    }

    @Override public LinkedList<Node> visitSelfRP(XPathParser.SelfRPContext ctx) { return currentNodes; }

    //pass test
    @Override public LinkedList<Node> visitCommaRP(XPathParser.CommaRPContext ctx) {
        LinkedList<Node> results;
        LinkedList<Node> oldCurrent = currentNodes;
        visit(ctx.rp(0));
        LinkedList<Node> resultsLeft = currentNodes;
        currentNodes = oldCurrent;
        visit(ctx.rp(1));
        LinkedList<Node> resultsRight = currentNodes;
        resultsLeft.addAll(resultsRight);
        results = resultsLeft;
        currentNodes = results;
        return results;}

    //pass test
    @Override public LinkedList<Node> visitTagRP(XPathParser.TagRPContext ctx) {
        LinkedList<Node> results = new LinkedList<Node>();

        LinkedList<Node> childrenList = getChildren(currentNodes);
        for (Node child: childrenList)
            if(child.getNodeName().equals(ctx.getText()))
                results.add(child);

        currentNodes = results;
        return results;}


    @Override public LinkedList<Node> visitFilterRP(XPathParser.FilterRPContext ctx) {
        visit(ctx.rp());
        currentNodes = visit(ctx.f());
        return currentNodes;
    }

    @Override public LinkedList<Node> visitRpFilter(XPathParser.RpFilterContext ctx) {
        LinkedList<Node> keepCurrent = currentNodes;
        LinkedList<Node> results = new LinkedList<>();
        for (Node node : keepCurrent){
            LinkedList<Node> newCurrent = new LinkedList<>();
            newCurrent.add(node);
            currentNodes = newCurrent;
            if (visit(ctx.rp()).size() > 0)
                results.add(node);
        }
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitNotFilter(XPathParser.NotFilterContext ctx) {
        //order
        HashSet<Node> leftSet = new HashSet<Node>(currentNodes);
        HashSet<Node> rightSet = new HashSet<Node>(visit(ctx.f()));
        HashSet<Node> difference = new HashSet<Node>();
        difference.addAll(leftSet);
        difference.removeAll(rightSet);

        LinkedList<Node> results = new LinkedList<Node>(difference);
        return results; }

    @Override public LinkedList<Node> visitAndFilter(XPathParser.AndFilterContext ctx) {
        //order
        HashSet<Node> leftSet = new HashSet<Node>(visit(ctx.f(0)));
        HashSet<Node> rightSet = new HashSet<Node>(visit(ctx.f(1)));
        HashSet<Node> intersection = new HashSet<Node>();
        intersection.addAll(leftSet);
        intersection.retainAll(rightSet);

        LinkedList<Node> results = new LinkedList<Node>(intersection);
        return results; }

    @Override public LinkedList<Node> visitOrFilter(XPathParser.OrFilterContext ctx) {
        //currentNode
        //order
        HashSet<Node> leftSet = new HashSet<Node>(visit(ctx.f(0)));
        HashSet<Node> rightSet = new HashSet<Node>(visit(ctx.f(1)));
        HashSet<Node> union = new HashSet<Node>();
        union.addAll(leftSet);
        union.addAll(rightSet);
        LinkedList<Node> results = new LinkedList<Node>(union);
        return results; }

    @Override public LinkedList<Node> visitIsFilter(XPathParser.IsFilterContext ctx) {
        LinkedList<Node> keepCurrent = currentNodes;
        LinkedList<Node> results = new LinkedList<>();

        for (Node node : keepCurrent){
            LinkedList<Node> singleCurrent = new LinkedList<>();
            singleCurrent.add(node);
            currentNodes = singleCurrent;
            LinkedList<Node> leftList = visit(ctx.rp(0));
            currentNodes = singleCurrent;
            LinkedList<Node> rightList = visit(ctx.rp(1));
            //need improve
            for (Node left : leftList)
                for (Node right: rightList)
                    if (left.isSameNode(right) && !results.contains(node))
                        results.add(node);
        }
        currentNodes = results;
        return results;
    }
    @Override public LinkedList<Node> visitEqFilter(XPathParser.EqFilterContext ctx) {
        LinkedList<Node> keepCurrent = currentNodes;
        LinkedList<Node> results = new LinkedList<>();

        for (Node node : keepCurrent){
            LinkedList<Node> singleCurrent = new LinkedList<>();
            singleCurrent.add(node);
            currentNodes = singleCurrent;

            LinkedList<Node> leftList = visit(ctx.rp(0));
            currentNodes = singleCurrent;
            LinkedList<Node> rightList = visit(ctx.rp(1));
            //need improve
            for (Node left : leftList)
                for (Node right: rightList)
                    if (left.isEqualNode(right) && !results.contains(node))
                        results.add(node);
        }
        currentNodes = results;
        return results;
    }

    @Override public LinkedList<Node> visitBraceFilter(XPathParser.BraceFilterContext ctx) { return visit(ctx.f()); }

    @Override public LinkedList<Node> visitTagName(XPathParser.TagNameContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitAttName(XPathParser.AttNameContext ctx) { return visitChildren(ctx); }

    public static LinkedList<Node> getChildren(LinkedList<Node> n){
        /**
         * return the children of the a node (just the next level)
         */
        LinkedList<Node> childrenList = new LinkedList<Node>();
        for(int j = 0; j < n.size(); j++) {
            Node curNode = n.get(j);
            for (int i = 0; i < curNode.getChildNodes().getLength(); i++) {
                childrenList.add(curNode.getChildNodes().item(i));
            }
        }
        //childrenList.normalize();
        return childrenList;
    }

    public LinkedList<Node> getParents(LinkedList<Node> input) {
        LinkedList<Node> res = new LinkedList<Node>();
        for(int i = 0; i < input.size(); i++) {
            Node parentNode = input.get(i).getParentNode();
            if(!res.contains(parentNode)) {
                res.add(parentNode);
            }
        }
        return res;
    }

    public LinkedList<Node> getDescendents(LinkedList<Node> list) {
        LinkedList<Node> desc = new LinkedList<Node>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getChildNodes().getLength() != 0) {
                for(int j = 0; j < list.get(i).getChildNodes().getLength(); j++) {
                    desc.addAll(getAllNodes(list.get(i).getChildNodes().item(j)));
                }
            }
        }
        return desc;
    }

    public LinkedList<Node> getAllNodes(Node n) {
        LinkedList<Node> allNodes = new LinkedList<Node>();
        for(int i = 0; i < n.getChildNodes().getLength(); i++) {
            allNodes.addAll( getAllNodes( n.getChildNodes().item(i) ) );
        }
        allNodes.add(n);
        return allNodes;
    }
}