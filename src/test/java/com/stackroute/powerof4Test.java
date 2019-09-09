package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class powerof4Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check1() {
        powerof4 p = new powerof4();
        assertTrue("Failed",p.check(256));
    }
    @Test
    public void check2() {
        powerof4 p = new powerof4();
        assertFalse("Failed",p.check(254));
    }
    @Test
    public void check3() {
        powerof4 p = new powerof4();
        assertFalse("Failed",p.check(1));
    }
}