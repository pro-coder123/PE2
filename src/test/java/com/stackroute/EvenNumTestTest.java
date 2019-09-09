package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEven() {
        EvenNumTest e = new EvenNumTest();
        assertTrue("Wrong",e.isEven(4));
    }
    @Test
    public void isEven1() {
        EvenNumTest e = new EvenNumTest();
        assertTrue("Wrong",e.isEven(6));
    }
    @Test
    public void isEven2() {
        EvenNumTest e = new EvenNumTest();
        assertFalse("Wrong",e.isEven(1));
    }
}