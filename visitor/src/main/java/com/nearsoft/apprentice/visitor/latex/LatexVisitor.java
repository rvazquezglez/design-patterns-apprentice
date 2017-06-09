package com.nearsoft.apprentice.visitor.latex;

import com.nearsoft.apprentice.model.BoldText;
import com.nearsoft.apprentice.model.Hiperlink;
import com.nearsoft.apprentice.Visitor;
import com.nearsoft.apprentice.model.PlainText;

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
