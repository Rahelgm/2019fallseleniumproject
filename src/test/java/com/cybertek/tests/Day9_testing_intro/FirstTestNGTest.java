package com.cybertek.tests.Day9_testing_intro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {
    @Test
    public void tests1(){
        System.out.println("test one");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("test two");
    }
    @Test
    public void test3(){
        System.out.println("test three");
    }


}
