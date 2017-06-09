package com.nearsoft.apprentice.model;

import com.nearsoft.apprentice.Visitor;

public class PlainText extends DocumentPart {

    public PlainText(String text) {
        super(text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
