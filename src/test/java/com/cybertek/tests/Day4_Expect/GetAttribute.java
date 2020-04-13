package com.cybertek.tests.Day4_Expect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args) {
        /*
        go to forgot password page


         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement retreivPasswordBttn = driver.findElement(By.id("form_submit"));
        System.out.println(retreivPasswordBttn.getAttribute("type")); //submit
        System.out.println(retreivPasswordBttn.getAttribute("class")); //radius



    }
}
