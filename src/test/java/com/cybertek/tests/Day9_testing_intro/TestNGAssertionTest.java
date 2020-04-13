package com.cybertek.tests.Day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionTest {
    @Test
    public void test1(){
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual,expected);
        Assert.assertEquals(1, 1);
        Assert.assertEquals(true,true);

        System.out.println("test 1 complete");
    }
    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";

        System.out.println("starting to campare");

        Assert.assertEquals(actual, expected);

        System.out.println("test 2 complete");
    }
    @Test
    public void test3(){
        String expected = "one";
        String actual = "two";
        Assert.assertNotEquals(expected,actual);
        Assert.assertNotEquals(1,2);
    }
    @Test
    public void test4(){
        String expected = "one";
        String actual = "one";

        Assert.assertTrue(expected.equals(actual));
        int e = 100;
        int a = 200;
        Assert.assertTrue(a>e);

    }
    @Test
    public void test5(){
        //verify that url is EQAUL to https://www.google.com/
        String expected = "https://www.google.com/";
        String actual = "https://www.google.com/";

        String expected1 = "java";
        String actual2 = "java - Google search";

        Assert.assertTrue(actual.startsWith(expected));
    }
}
