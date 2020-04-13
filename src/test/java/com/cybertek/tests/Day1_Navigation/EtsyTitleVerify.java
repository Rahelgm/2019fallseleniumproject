package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to etsy --> data URL : https://www.etsy.com/
        driver.get("http://www.etsy.com/");
        //veryfy title
        //expected vs actual

        String expectedTitle = "Etsy - shop for handmand, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("The test is Pass");
        }else {
            System.out.println("The test is failed");
            System.out.println(expectedTitle + "vs" + actualTitle);
        }
        driver.close();
    }
}
