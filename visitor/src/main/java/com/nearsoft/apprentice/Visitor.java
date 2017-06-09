package com.nearsoft.apprentice;

import com.nearsoft.apprentice.model.BoldText;
import com.nearsoft.apprentice.model.Hiperlink;
import com.nearsoft.apprentice.model.PlainText;

public interface Visitor {

    void visit(PlainText docPart);

    void visit(BoldText docPart);

    void visit(Hiperlink docPart);

    String getOutput();
}
