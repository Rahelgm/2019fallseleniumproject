package com.cybertek.tests.Day4_Expect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        WebElement submitBttn = driver.findElement(By.name("submit"));
        submitBttn.submit();

        String expectedText = "Your e-mail's has been sent";
        WebElement message = driver.findElement(By.name("confirmation_messge"));
        String ActualText = message.getText();

        if (expectedText.equals(ActualText)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }
        driver.close();


    }
}
