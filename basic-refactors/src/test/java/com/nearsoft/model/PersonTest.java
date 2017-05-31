package com.nearsoft.model;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;


public class PersonTest {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testPrintData() {

        LOGGER.info("first name: " + "John");
        LOGGER.info("middle name: " +"George");
        LOGGER.info("last name: " +"Smith");
        LOGGER.info("age: " + 18);


    }
}