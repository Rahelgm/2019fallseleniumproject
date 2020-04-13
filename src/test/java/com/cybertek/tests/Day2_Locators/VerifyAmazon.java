package com.cybertek.tests.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAmazon {
    /*Task:
        1. Go to amazon  https://www.amazon.com/
        2. Then Go to Ebay   https://www.ebay.com/
        3. Enter a search term
        4. Click on search button
        5. Verify title contains search term
        */
        public static void main(String[] args) {
            //Locator --> ID, name, classname,
            /*
            If class
             */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.name("_nkw"));
        searchBox.sendKeys("shoes" + Keys.ENTER);

        //driver.findElement(By.name("Search for anything ")).sendKeys("shoes");

        String expectedPartialTitle = "shoes";
        String actualPartialTitle = driver.getTitle();

        if (expectedPartialTitle.equals(actualPartialTitle)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail ");
        }
        driver.close();
    }
}
