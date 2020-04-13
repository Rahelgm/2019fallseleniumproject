package office_hours2;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class waitPractice extends TestBase {

    @Test
    public  void testWait(){
        driver.get("http://qa3.vytrack.com");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        WebDriverWait WebDriverWait = new WebDriverWait(driver,10);
        WebDriverWait.until(ExpectedConditions.titleIs("Loging"));
        WebElement user = driver.findElement(By.id("prependedInput"));
        WebElement password = driver.findElement(By.id("prependedInput2"));
        WebElement submit = driver.findElement(By.id("_submit"));

        user.sendKeys("salesmanager110");
        password.sendKeys("UserUser123");
        submit.click();
        WebElement account = driver.findElement(By.xpath("//span[.=‘Accounts’]/following-sibling::span/following-sibling::a"));
        //WebDriverWait.until(ExpectedConditions.amountToBeClickable(account));

    }


    }
