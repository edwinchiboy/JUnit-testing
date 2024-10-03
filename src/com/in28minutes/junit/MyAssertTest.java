package com.in28minutes.junit;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "Devops");

    @Test
    public void tests() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("AtWS");

        assertTrue("failed", test);
        assertFalse("failed", test2);
        assertEquals(3,todos.size());
        //assertNull, assertNotNull,
        assertArrayEquals(new int [] {1,2,3}, new int [] {1,4});

    }
}
