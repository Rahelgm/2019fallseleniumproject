package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleNavigate {
    public static void main(String[] args) throws InterruptedException {
        //To setup chrome driver
        WebDriverManager.chromedriver().setup();
        //to create an object of chromeDriver class
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2 = "http://facebook.com";

        //will open browser with URL
        //open google.com
        driver.get(url);
        //will put on hold current run on 3 seconds
        Thread.sleep(3000);

        //navigate to the facebook.com
        driver.navigate().to(url2);
        //wait for 3seconds
        Thread.sleep(3000);

        //navigate back to the previous URL(google.com)
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        driver.close();

    }
}
