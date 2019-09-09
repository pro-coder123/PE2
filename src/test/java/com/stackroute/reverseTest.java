package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class reverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void rev1() {
        reverse r = new reverse();
        assertEquals("Failed",r.rev("abcdcba"),true);
    }
    @Test
    public void rev2() {
        reverse r = new reverse();
        assertEquals("Failed",r.rev("abcdcbva"),false);
    }
    @Test
    public void rev3() {
        reverse r = new reverse();
        assertFalse("Is Null",r.rev(""));
    }
}