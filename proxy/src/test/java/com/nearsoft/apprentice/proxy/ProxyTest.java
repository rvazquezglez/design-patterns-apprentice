package com.nearsoft.apprentice.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void testDoOperation() {

        Proxy proxy = new Proxy(new RealSubject());

        proxy.doOperation();

    }
}