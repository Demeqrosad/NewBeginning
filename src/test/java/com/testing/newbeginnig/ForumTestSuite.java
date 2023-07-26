package com.testing.newbeginnig;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {
    @BeforeAll
    public static void before(){
        System.out.println("Test Case: begin");
    }
    @AfterAll
    public static void after(){
        System.out.println("Test Case: end");
    }
    @BeforeEach
    public void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterEach
    public void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("theForumUser", result);
    }
    @Test
    public void testCaseRealName(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("John Smith", result);
    }
}

