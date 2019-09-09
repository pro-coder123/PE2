package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void longFactorial() {
        Factorial f = new Factorial();
        assertEquals("Wrong",2432902008176640000L,f.longFactorial(20));
    }

    @Test
    public void factorial() {
        Factorial f = new Factorial();
        assertEquals("Wrong",479001600,f.factorial(12));
    }

}