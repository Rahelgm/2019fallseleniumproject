package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    /*
    1. go to VyTrack login page
    2. write username data: storemanager52
    3. write password       UserUser123
    4. click login
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        WebElement loginBttn = driver.findElement(By.id("_submit"));
        loginBttn.click();
        //login button can be found and clicked diractly

        /*
        Verify that you are in the home page
         */
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();

        String expectedURL = "https://app.vytrack.com";
        String actualURL = driver.getCurrentUrl();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail ");
            System.out.println(" I expected " + expectedTitle);
            System.out.println(" The actual URL is "+ actualTitle);

        }
        driver.close();
    }
}
