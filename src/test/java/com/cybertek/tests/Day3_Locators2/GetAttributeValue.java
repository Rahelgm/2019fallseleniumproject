package com.cybertek.tests.Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        //i want to get the value of type attribute
        //type = "text" -> getAttrubute("attribute name")/  type is attribute.

        //locate username box
        WebElement username = driver.findElement(By.name("username"));
        String valueOfType = username.getAttribute("type");

        System.out.println("value of type is: " + valueOfType);
        //<button class= "btn-primary" type = "submit" id ="wooden_spoon">

        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));
        // i want to print class attributes value
        System.out.println(loginbttn.getAttribute("class"));


    }
}
