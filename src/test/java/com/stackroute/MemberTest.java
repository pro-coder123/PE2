package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void test1()
    {
        Member_Variable m=new Member_Variable("abcd",12,25000);
        assertEquals("Wrong name","abcd",m.getName());
    }
    @Test
    public void test2()
    {
        Member_Variable m=new Member_Variable("abcd",12,25000);
        assertEquals("Wrong age",12,m.getAge());
    }
    @Test
    public void test3()
    {
        Member_Variable m=new Member_Variable("abcd",12,25000);
        assertEquals("Wrong Salary",25000,m.getSalary());
    }
}