package com.nearsoft.workshop;

import com.nearsoft.workshop.model.BoldText;
import com.nearsoft.workshop.model.Hiperlink;
import com.nearsoft.workshop.model.PlainText;

public interface Visitor {

    void visit(PlainText docPart);

    void visit(BoldText docPart);

    void visit(Hiperlink docPart);

    String getOutput();
}
