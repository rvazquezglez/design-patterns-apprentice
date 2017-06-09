package com.nearsoft.apprentice.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements Subject {
    private static final Logger LOGGER = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void doOperation() {
        LOGGER.info("Opeación desde objeto REAL");
    }
}
