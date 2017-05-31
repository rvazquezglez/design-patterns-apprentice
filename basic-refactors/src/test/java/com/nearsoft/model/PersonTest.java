package com.nearsoft.model;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;


public class PersonTest {

    @Test
    public void testPrintData() {
        System.out.println("first name: " + "John");
        System.out.println("middle name: " +"George");
        System.out.println("last name: " +"Smith");
        System.out.println("age: " + 18);
    }
}