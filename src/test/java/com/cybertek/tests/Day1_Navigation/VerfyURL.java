package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfyURL {
    public static void main(String[] args) {
        /*
        1. go to Etsy http://
        2.
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();

        //for verify title --> getTitle()
        //for verify URL -->

        String expectedURL = "https://www.etsy.com/";

        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail ");
            System.out.println(" I expected " + expectedURL);
            System.out.println(" The actual URL is "+ actualURL);

        }
        driver.close();
    }
}
