package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        //locator 1. ID
        //go to cybertek okta login page
        //write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        //write email to the box
        /*1. find text box .

         */

        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("rahermehari@yahoo.com");
        // write your password to the password text box
        Thread.sleep(3000);

        driver.findElement(By.id("okta-signin-password ")).sendKeys();



    }
}
