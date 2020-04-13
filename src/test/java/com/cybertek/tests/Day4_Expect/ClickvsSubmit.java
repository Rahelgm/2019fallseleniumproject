package com.cybertek.tests.Day4_Expect;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickvsSubmit {
    public static void main(String[] args) {
        /*
        click()
        submit()

        tast:
        1. go to forgot password web page
      http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        // enter any email
        //locate the email box first
        WebElement emailBox = driver.findElement(By.name("email"));
        //enter email --> sendKeys()
        emailBox.sendKeys("abc@gmail.com");

        //click"retrive password" bttn
        // locate first button

        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        //submit email by clicking the "retrive password"
        submitBttn.submit();
        //verify --> Expected result vs Actual result
        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
            System.out.println("test is pass");
        }else {
            System.out.println("test is failed");
        }
        driver.close();


    }
}
