package com.nearsoft.apprentice.model;

import com.nearsoft.apprentice.Visitor;

public abstract class DocumentPart {
    private String text;

    public DocumentPart(String text) {
        this.text = text;
    }

    public abstract void accept(Visitor visitor);


    public String getText() {
        return text;
    }
}
