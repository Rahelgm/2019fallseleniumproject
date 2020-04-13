package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class selfPractice {
    public static void main(String[] args) throws Exception  {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://google.com");
        WebElement btn1 = driver.findElement(By.id("gbqfbb"));
        String actualText = btn1.getAttribute("value");
        String expectedText = "I'm Feeling Lucky";
        btn1.click();
        if (actualText.equals(expectedText)) {
            System.out.println("passed");
        }else {
            System.out.println("Failed");
            System.out.println("expectied text: " + expectedText);
            System.out.println("Actual text: " + actualText);
        }
        Thread.sleep(5000);
    }

}