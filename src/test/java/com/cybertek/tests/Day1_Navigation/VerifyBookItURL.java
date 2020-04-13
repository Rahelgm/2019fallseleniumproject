package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookItURL {

    public static void main(String[] args) {
        //String expectedPartialURL =

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String expectedURL = "https://cybertek-reservation-qa.herokuapp.com/sign-in";
        String actualURL = driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("I expected "+expectedURL);
            System.out.println("The actual URL is: "+actualURL);
        }
    }
}










