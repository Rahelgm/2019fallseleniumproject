package com.cybertek.tests.Day10_WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;


public class OrderOfTests {

    String title;

    @Test(priority = 0)
    public void login(){
        System.out.println("opening the browser");
        System.out.println("capturing title");
        title = "cbt";
        // i will make this test fail. Assert.fail() -->is a ready method that makes test fail
        //Assert.fail();

    }
    @Test(priority = 1, dependsOnMethods = "login")
    public void assertTitle(){
        System.out.println("verifing the title");
        Assert.assertEquals(title,"cbt");

    }
    @Test(priority = 55)
    public void verifyOtherThings(){
        System.out.println("verify sth else");

    }
}
