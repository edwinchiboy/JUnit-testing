package com.in28minutes.junit;


import org.junit.jupiter.api.*;

class MyBeforeAfterTest {
    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("befoore each");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("befoore all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

}
