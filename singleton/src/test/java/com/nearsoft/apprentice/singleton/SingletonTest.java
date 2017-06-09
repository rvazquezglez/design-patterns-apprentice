package com.nearsoft.apprentice.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

public class SingletonTest {

    @Test
    public void testGetInstance() {

        Singleton singleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        assertThat(secondSingleton, sameInstance(singleton));

    }
}