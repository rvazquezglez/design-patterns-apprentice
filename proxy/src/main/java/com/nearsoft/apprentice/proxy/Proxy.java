package com.nearsoft.apprentice.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Proxy implements Subject {
    private static final Logger LOGGER = LoggerFactory.getLogger(Proxy.class);
    private Subject inner;

    public Proxy(Subject inner) {
        this.inner = inner;
    }


    @Override
    public void doOperation() {
        LOGGER.info("Operación desde proxy, antes de llamar a objeto real.");
        this.inner.doOperation();
        LOGGER.info("Operación desde proxy, después de llamar a objeto real.");
    }
}
