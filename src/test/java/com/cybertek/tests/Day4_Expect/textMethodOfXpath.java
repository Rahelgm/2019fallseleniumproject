package com.cybertek.tests.Day4_Expect;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) {
        /* go to http://practice.cybertekschool.com/context_menu
        verify Context Menu is on the page
         */
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebElement text = driver.findElement(By.xpath("//h3[@text()='Context Menu']"));

        String expectedText = "Context Menu";
        String actualText = text.getText();

        if (expectedText.equals(actualText)) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }




    }
}
