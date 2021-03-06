package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*
        1. go to cybertek practice website
        http://practice.cybertekschool.com
        2. verify the URL
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedURL = "http://practice.cybertekschool.com/";
        String actualURL = driver.getCurrentUrl();


        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("I expected " + expectedURL);
            System.out.println("The Actual title is " +actualURL);
        }
    }
}
