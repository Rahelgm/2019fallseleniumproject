package com.cybertek.tests.Day7_Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class amazonTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://amazon.com");
        WebElement searchInput = driver.findElement(By.xpath("html/body/div/header/div/div/div/div/form/input"));
        searchInput.sendKeys("selenium cookbook edition" + Keys.ENTER);

        Thread.sleep(3000);
        WebElement result = driver.findElement(By.xpath("//span[.='Seleniuem Testing Tools Cookbook -Second Edition"));
        System.out.println(result.getText());

        driver.close();


    }
}
