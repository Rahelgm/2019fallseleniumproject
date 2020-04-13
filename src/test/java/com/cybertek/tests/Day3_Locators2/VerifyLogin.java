package com.cybertek.tests.Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")) .sendKeys("SupersecretPassword");

        driver.findElement(By.id("Wooden-spoon")).click();

        //
        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));
        //Verify the welcome message
        //expectd vs actual

        String expecteMessage = "Welcome to the secure Area. When you are done click";

        //String vs WebElement
        //gettext() --> convert webElement to String
        String  actualWelcomeMessage = welcomeMessage.getText();

        if (expecteMessage.equalsIgnoreCase(actualWelcomeMessage)) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }


    }
}
