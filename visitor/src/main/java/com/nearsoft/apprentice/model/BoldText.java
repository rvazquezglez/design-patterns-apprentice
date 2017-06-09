package com.nearsoft.apprentice.model;

import com.nearsoft.apprentice.Visitor;

public class BoldText extends DocumentPart {

    public BoldText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}