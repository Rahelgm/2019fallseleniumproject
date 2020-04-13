package com.cybertek.tests.Day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
    public static void main(String[] args) {
        /*
        go to login page http://practice.cybertekschool.com/login
        2. enter invalid username
        3. enter invalid password
        4. Verify
         */
        Faker faker = new Faker();
        String userName = faker.name().fullName();
        String password = faker.app().author();


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage();

        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.id("Password")).sendKeys(password);



    }
}
