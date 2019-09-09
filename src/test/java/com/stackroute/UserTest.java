package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    public User u;
    @Before
    public void setUp() throws Exception {
         u=new User("abc","bcd",21,500000);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValidAge() {
        assertTrue("Wrong",u.isValidAge());
    }

    @Test
    public void getFullName() {
        assertEquals("Wrong","abc bcd",u.getFullName());
    }
}