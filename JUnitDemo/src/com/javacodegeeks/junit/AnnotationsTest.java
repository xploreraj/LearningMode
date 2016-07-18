package com.javacodegeeks.junit;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass onceExecutedBeforeAll");
    }

    @Before
    public void onceExecutedBeforeEach() {
        testList = new ArrayList();
        System.out.println("@Before onceExecutedBeforeEach");
    }

    @After
    public void onceExecutedAfterEach() {
        testList.clear();
        System.out.println("@After onceExecutedAfterEach");
    }

    @AfterClass
    public static void onceExecutedAfterAll() {
        System.out.println("@AfterClass onceExecutedAfterAll");
    }

    @Test
    public void emptyCollection() {
        assertTrue(testList.isEmpty());
        System.out.println("@Test emptyArrayList");
    }

    @Test
    public void oneItemCollection() {
        testList.add("oneItem");
        assertEquals(1, testList.size());
        System.out.println("@Test oneItemArrayList");
    }

    @Ignore
    public void executeIgnored() {
        System.out.println("@Ignore This execution is ignored");
    }
}
