package com.nearsoft.apprentice.visitor.html;

import com.nearsoft.apprentice.Visitor;
import com.nearsoft.apprentice.model.BoldText;
import com.nearsoft.apprentice.model.Hiperlink;
import com.nearsoft.apprentice.model.PlainText;

public class HtmlVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "<b>" + docPart.getText() + "</b>";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "<a href=\"" + docPart.getUrl() + "\">" + docPart.getText() + "</b>";
    }

    public String getOutput() {
        return "<html><body>"+output+"</body></html>";
    }
}
