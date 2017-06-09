package com.nearsoft.apprentice.visitor;

import com.nearsoft.apprentice.Visitor;
import com.nearsoft.apprentice.model.BoldText;
import com.nearsoft.apprentice.model.Document;
import com.nearsoft.apprentice.model.Hiperlink;
import com.nearsoft.apprentice.model.PlainText;
import com.nearsoft.apprentice.visitor.html.HtmlVisitor;
import com.nearsoft.apprentice.visitor.latex.LatexVisitor;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VisitorTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(VisitorTest.class);


    Document document;

    @Before
    public void setUp() throws Exception {
        document = new Document();
        document.addPart(new BoldText("This text is in bold"));
        document.addPart(new Hiperlink("This goes to google", "http://google.com"));
        document.addPart(new PlainText("plain text"));

    }

    @Test
    public void testHtmlVisitor() throws Exception {
        Visitor visitor = new HtmlVisitor();
        document.accept(visitor);
        LOGGER.info(visitor.getOutput());
    }


    @Test
    public void testLatexVisitor() throws Exception {
        Visitor visitor = new LatexVisitor();
        document.accept(visitor);
        LOGGER.info(visitor.getOutput());
    }
}