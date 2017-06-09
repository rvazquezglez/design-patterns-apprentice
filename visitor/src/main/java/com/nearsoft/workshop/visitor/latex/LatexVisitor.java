package com.nearsoft.workshop.visitor.latex;

import com.nearsoft.workshop.Visitor;
import com.nearsoft.workshop.model.BoldText;
import com.nearsoft.workshop.model.Hiperlink;
import com.nearsoft.workshop.model.PlainText;

public class LatexVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "\\textbf{" + docPart.getText() + "}";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "\\href={" + docPart.getUrl() + "}{" + docPart.getText() + "}";
    }

    @Override
    public String getOutput() {
        return output;
    }
}
