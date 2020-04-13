package com.cybertek.tests.Day5_More_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.cybertek.utilities.WebDriverFactory;
public class ClassNameExample {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");

        WebElement link = driver.findElement(By.className("nav-link"));
        System.out.println(link.getText());

        // class name does not work if the value of the class attribute has a space
//        WebElement loginBtn = driver.findElement(By.className("btn btn-primary"));
//        loginBtn.click();

    }
}
