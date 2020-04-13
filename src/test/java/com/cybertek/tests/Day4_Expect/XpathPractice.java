package com.cybertek.tests.Day4_Expect;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args) {
        //go to practice login page
        //locate username box with absolute xpath
        //locate username box with relative xpath
        WebDriverFactory.getDriver("chrome");
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/login");

        WebElement userNameBox = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input"));
        userNameBox.sendKeys("tom");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("tom//");

    }
}
