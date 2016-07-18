package com.javacodegeeks.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    Calculate calculation = new Calculate();
    int sum = calculation.sum(5, 7);
    int testSum = 12;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testSum() throws Exception {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);
    }
}