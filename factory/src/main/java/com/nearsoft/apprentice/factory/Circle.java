package com.nearsoft.apprentice.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Circle implements Shape {
    private static final Logger LOGGER = LoggerFactory.getLogger(Circle.class);

    @Override
    public void draw() {
        LOGGER.info("Dibujando círculo");
    }
}
