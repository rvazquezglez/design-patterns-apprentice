package com.nearsoft.workshop.visitor.html;

import com.nearsoft.workshop.Visitor;
import com.nearsoft.workshop.model.BoldText;
import com.nearsoft.workshop.model.Hiperlink;
import com.nearsoft.workshop.model.PlainText;

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
