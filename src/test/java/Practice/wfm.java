package Practice;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wfm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));

        String actualText = btn1.getAttribute("value");

        String expectedText = "I'm Feeling Lucky";
        if (actualText.equals(expectedText)) {
            System.out.println("passed");
        }else{
            System.out.println("failed");
            System.out.println("expected is =" + expectedText);
            System.out.println("actual is = " + actualText);
        }
        Thread.sleep(5000);
        driver.close();
    }
    }

