package com.cybertek.tests.Day4_Expect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute2 {
    public static void main(String[] args) {
        /*
        go to http://practice.cybertekschool.com/forgot_password"
        locate: Example 1: Element on page that is hidden and become visible after trigger
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement example1 = driver.findElement(By.linkText("Element on page that is hidden and become visible after trigger\n"));
        System.out.println(example1.getAttribute("href"));


    }
}
