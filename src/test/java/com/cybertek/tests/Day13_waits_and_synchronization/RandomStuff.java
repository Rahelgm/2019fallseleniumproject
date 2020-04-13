package com.cybertek.tests.Day13_waits_and_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RandomStuff {
    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void test(){
        //wait until title change
        wait.until(ExpectedConditions.titleContains("Steam")) ;
        //verify the title
        Assert.assertTrue(driver.getTitle().contains("Steam"));
        //wait until title changes and get the bookean verify
        Assert.assertTrue(wait.until(ExpectedConditions.titleContains("Steam")));

        //Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id"))));

    }

}
