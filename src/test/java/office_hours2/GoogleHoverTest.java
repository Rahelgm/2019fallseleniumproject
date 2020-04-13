package office_hours2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://Google.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

        }

    /*
    go to http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable
    verify that table has dropdown with values Family, Friends, Cowerkers, Business, Contacts

    select option Coworkers
    verify that Cowerkers is now selected
    select options
     */
        @Test
       public void test() {
            Actions actions = new Actions(driver);
            WebElement button =driver.findElement(By.id("gbqfbb"));
            actions.
                    pause(1000).moveToElement(button).pause(1000).
                    build().perform();
            String notUnExpected = "I'am Feeling Lucky";

            String actual = button.getAttribute("value");
            System.out.println("Actual:" +actual);
            Assert.assertNotEquals(actual,"asdfasf");


        }


    }


