package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student s;
    @Before

    public void setUp() throws Exception {
        s=new Student(new int[]{86,65,98,77});
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void avg() {
        assertEquals("Wrong average",81.5,s.avg(),0.00000);

    }

    @Test
    public void min() {
        assertEquals("Wrong minimum",65,s.min());
    }

    @Test
    public void max() {
        assertEquals("Wrong maximum",98,s.max());
    }
}