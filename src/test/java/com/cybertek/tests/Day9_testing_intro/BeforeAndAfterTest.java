package com.cybertek.tests.Day9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.*;

public class BeforeAndAfterTest {
    @BeforeClass
    public void beforClass(){
        System.out.println("BEFOR CLASS");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("\tAFTER CLASS");
    }

    @BeforeMethod
    public void beforMethod() {
        System.out.println("\tBEFORE METHOD");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("\tAFTER METHOD");
    }
    @Test
    public void test1() {
        System.out.println("this is test one");
        Assert.assertEquals(true, false);
    }
    @Test
    public void test2() {
        System.out.println("this is test two");

    }

}
