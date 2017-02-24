import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import java.util.LinkedList;

/**
 * Created by onion on 2/18/17.
 */


public class CustomizedXQueryVisitor extends XQueryBaseVisitor<LinkedList>{
    private HashMap<String, LinkedList<Node>> contextMap = new HashMap<>();
    private Stack<HashMap<String, LinkedList<Node>>> contextStack = new Stack<>();
    Document outputDoc = null;
    private Document doc = null;

    public CustomizedXQueryVisitor(){
        try {
            DocumentBuilderFactory docBF = DocumentBuilderFactory.newInstance();
            DocumentBuilder docB = docBF.newDocumentBuilder();
            outputDoc = docB.newDocument();
            doc = docB.newDocument();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

    }

    @Override public LinkedList<Node> visitFLWR(XQueryParser.FLWRContext ctx) {
        LinkedList<Node> results = new LinkedList<>();
        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
        contextStack.push(contextMapOld);


        FLWRHelper(0, results, ctx);

        contextMap = contextStack.pop();
        return results;
    }


    private void FLWRHelper(int k, LinkedList<Node> results, XQueryParser.FLWRContext ctx){
        int numFor;
        numFor = ctx.forClause().var().size();
        if (k == numFor){
            if (ctx.letClause() != null) visit(ctx.letClause());
            if (ctx.whereClause() != null)
               if (visit(ctx.whereClause()).size() == 0) return;
            LinkedList<Node> result = visit(ctx.returnClause());
            results.addAll(result);
        }
        else{
            String key = ctx.forClause().var(k).getText();
            LinkedList<Node> valueList = visit(ctx.forClause().xq(k));

            for (Node node: valueList){
                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
                contextStack.push(contextMapOld);

                LinkedList<Node> value = new LinkedList<>(); value.add(node);
                contextMap.put(key, value);
                if (k+1 <= numFor)
                    FLWRHelper(k+1, results, ctx);
                contextMap = contextStack.pop();
            }
        }
    }
    @Override public LinkedList<Node> visitTagXQ(XQueryParser.TagXQContext ctx) {

        String tagName = ctx.startTag().tagName().getText();
        LinkedList<Node> nodeList = visit(ctx.xq());
        Node node = makeElem(tagName, nodeList);
        LinkedList<Node> result = new  LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitApXQ(XQueryParser.ApXQContext ctx) {
        String ap = ctx.getText();
        LinkedList<Node> results = XPath.evalAp(ap);
        return results;
    }

    @Override public LinkedList<Node> visitLetXQ(XQueryParser.LetXQContext ctx) {
        HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
        contextStack.push(contextMapOld);
        LinkedList<Node> result = visitChildren(ctx);
        contextMap = contextStack.pop();
        return result;

    }

    @Override public LinkedList<Node> visitCommaXQ(XQueryParser.CommaXQContext ctx) {
        LinkedList<Node> result = visit(ctx.xq(0));
        result.addAll(visit(ctx.xq(1)));
        return result;
    }

    @Override public LinkedList<Node> visitVarXQ(XQueryParser.VarXQContext ctx) {
        return contextMap.get(ctx.getText());
    }

    @Override public LinkedList<Node> visitScXQ(XQueryParser.ScXQContext ctx) {
        String str = ctx.StringConstant().getText();
        int len = str.length();
        str = str.substring(1,len-1);
        Node node = makeText(str);
        LinkedList<Node> result = new LinkedList<>();
        result.add(node);
        return result;
    }

    @Override public LinkedList<Node> visitBraceXQ(XQueryParser.BraceXQContext ctx) {
        return visit(ctx.xq());
    }

    @Override public LinkedList<Node> visitSingleSlashXQ(XQueryParser.SingleSlashXQContext ctx) {
        LinkedList<Node> currentNodes = new LinkedList<>();
        copyOf(visit(ctx.xq()), currentNodes);
        LinkedList<Node> results = XPath.evalRp(currentNodes, ctx.rp().getText());
        return results;
    }

    @Override public LinkedList<Node> visitDoubleSlashXQ(XQueryParser.DoubleSlashXQContext ctx) {
        LinkedList<Node> currentNodes = new LinkedList<>();
        copyOf(visit(ctx.xq()), currentNodes);
        LinkedList<Node> descendants = getDescendants(currentNodes);
        currentNodes.addAll(descendants);
        LinkedList<Node> results = XPath.evalRp(currentNodes, ctx.rp().getText());
        return results;
    }

    private void copyOf(LinkedList<Node> l1, LinkedList<Node> l2){
        for (Node node : l1)
            l2.add(node);
    }
    /*
    private  LinkedList<Node> forClauseHelper(int k, XQueryParser.ForClauseContext ctx){
        String key = ctx.var(k).getText();
        LinkedList<Node> valueList = visit(ctx.xq(k));

        for (Node node: valueList){

            HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
            contextStack.push(contextMapOld);

            LinkedList<Node> value = new LinkedList<>(); value.add(node);
            contextMap.put(key, value);
            if (k+1 < ctx.var().size())
                forClauseHelper(k+1, ctx);


            contextMap = contextStack.pop();
        }

    }*/

    @Override public LinkedList<Node> visitForClause(XQueryParser.ForClauseContext ctx) {
        //forClauseHelper(0, ctx);
        return null;
    }

    @Override public LinkedList<Node> visitLetClause(XQueryParser.LetClauseContext ctx) {
        for (int i = 0; i < ctx.var().size(); i++) {
            String key = ctx.var(i).getText();
            LinkedList<Node> value = visit(ctx.xq(i));
            contextMap.put(key, value);
        }
        return null;
    }

    @Override public LinkedList<Node> visitWhereClause(XQueryParser.WhereClauseContext ctx) {
        return visit(ctx.cond());
    }

    @Override public LinkedList<Node> visitReturnClause(XQueryParser.ReturnClauseContext ctx) {
        return visit(ctx.xq());
    }

    @Override public LinkedList<Node> visitBraceCond(XQueryParser.BraceCondContext ctx) {
        return visit(ctx.cond());
    }



    private boolean satisfyCondHelper(int k, XQueryParser.SatisfyCondContext ctx){

        int numFor = ctx.var().size();
        if (k == numFor){
            if (visit(ctx.cond()).size() == 1)
                return true;
        }
        else{
            String key = ctx.var(k).getText();
            LinkedList<Node> valueList = visit(ctx.xq(k));

            for (Node node: valueList){
                HashMap<String, LinkedList<Node>> contextMapOld = new HashMap<>(contextMap);
                contextStack.push(contextMapOld);

                LinkedList<Node> value = new LinkedList<>(); value.add(node);
                contextMap.put(key, value);
                if (k+1 <= numFor)
                    if (satisfyCondHelper(k+1, ctx)) {
                    contextMap = contextStack.pop();
                    return true;
                }
                contextMap = contextStack.pop();
            }
        }
        return false;
    }


    @Override public LinkedList<Node> visitSatisfyCond(XQueryParser.SatisfyCondContext ctx) {
        LinkedList<Node> result = new LinkedList<>();
        if (satisfyCondHelper(0, ctx)){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitEmptyCond(XQueryParser.EmptyCondContext ctx) {
        LinkedList<Node> xqResult = visit(ctx.xq());
        LinkedList<Node> result = new LinkedList<>();
        if (xqResult.isEmpty()){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitOrCond(XQueryParser.OrCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.cond(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.cond(1)));
        LinkedList<Node> result = new LinkedList<>();
        if (left.size() > 0 || right.size() > 0){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitAndCond(XQueryParser.AndCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.cond(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.cond(1)));
        LinkedList<Node> result = new LinkedList<>();
        if (left.size() > 0 && right.size() > 0){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitIsCond(XQueryParser.IsCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.xq(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.xq(1)));
        LinkedList<Node> result = new LinkedList<>();
        for (Node l: left)
            for (Node r: right)
                if (l.isSameNode(r)){
                    Node True = doc.createTextNode("true");
                    result.add(True);
                    return result;
                }
        return result;
    }


    @Override public LinkedList<Node> visitEqCond(XQueryParser.EqCondContext ctx) {
        LinkedList<Node> left = new LinkedList<>(visit(ctx.xq(0)));
        LinkedList<Node> right = new LinkedList<>(visit(ctx.xq(1)));
        LinkedList<Node> result = new LinkedList<>();
        for (Node l: left)
            for (Node r: right)
                if (l.isEqualNode(r)){
                    Node True = doc.createTextNode("true");
                    result.add(True);
                    return result;
                }
        return result;
    }

    @Override public LinkedList<Node> visitNotCond(XQueryParser.NotCondContext ctx) {
        LinkedList<Node> oppResult = new LinkedList<>(visit(ctx.cond()));
        LinkedList<Node> result = new LinkedList<>();
        if (oppResult.isEmpty()){
            Node True = doc.createTextNode("true");
            result.add(True);
        }
        return result;
    }

    @Override public LinkedList<Node> visitStartTag(XQueryParser.StartTagContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitEndTag(XQueryParser.EndTagContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitVar(XQueryParser.VarContext ctx) {
        return visitChildren(ctx);
    }

    private Node makeText(String s){
        Node result = doc.createTextNode(s);
        return result;
    }
    private Node makeElem(String tag, LinkedList<Node> list){
        Node result = outputDoc.createElement(tag);
        for (Node node : list) {
            if (node != null) {
                Node newNode = outputDoc.importNode(node, true);
                result.appendChild(newNode);
            }
        }
        return result;
    }
    //from XPath

    @Override public LinkedList<Node> visitDoubleAP(XQueryParser.DoubleAPContext ctx) {return visitChildren(ctx);}

    @Override public LinkedList<Node> visitSingleAP(XQueryParser.SingleAPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitDoc(XQueryParser.DocContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitBraceRP(XQueryParser.BraceRPContext ctx) { return visitChildren(ctx);}

    @Override public LinkedList<Node> visitDoubleSlashRP(XQueryParser.DoubleSlashRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitTextRP(XQueryParser.TextRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitAttRP(XQueryParser.AttRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitParentRP(XQueryParser.ParentRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitSelfRP(XQueryParser.SelfRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitFilterRP(XQueryParser.FilterRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitCommaRP(XQueryParser.CommaRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitChildrenRP(XQueryParser.ChildrenRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitTagRP(XQueryParser.TagRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitSingleSlashRP(XQueryParser.SingleSlashRPContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitEqFilter(XQueryParser.EqFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitNotFilter(XQueryParser.NotFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitAndFilter(XQueryParser.AndFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitIsFilter(XQueryParser.IsFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitRpFilter(XQueryParser.RpFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitBraceFilter(XQueryParser.BraceFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitOrFilter(XQueryParser.OrFilterContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitTagName(XQueryParser.TagNameContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitAttName(XQueryParser.AttNameContext ctx) { return visitChildren(ctx); }

    @Override public LinkedList<Node> visitFilename(XQueryParser.FilenameContext ctx) { return visitChildren(ctx); }


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

    public LinkedList<Node> getDescendants(LinkedList<Node> list) {
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
