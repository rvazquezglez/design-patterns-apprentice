package com.nearsoft.apprentice.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rectangle implements Shape {
    private Logger LOGGER = LoggerFactory.getLogger(Rectangle.class);

    @Override
    public void draw() {
        LOGGER.info("Dibujando rectángulo.");
    }
}
