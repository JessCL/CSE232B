/**
 * Created by onion on 1/30/17.
 */
public class XPathBuilder extends XPathBaseListener {
    String fileName;
    @Override
    public void enterFileName(XPathParser.FileNameContext ctx) {
        fileName = ctx.getText();

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
}
