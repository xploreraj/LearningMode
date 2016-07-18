package com.javacodegeeks.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void test() {
        String str1 = "junit";
        String str2 = "junit";
        String str3 = "test";
        String str4 = "test";
        String str5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,3};

        assertEquals("assertEquals",str1,str2);

        assertSame(str3,str4);

        assertNotSame(str2,str4);

        assertNotNull(str1);

        assertNull(str5);

        assertTrue(var1==var2);

        assertArrayEquals(numbers1, numbers2);
    }
}
