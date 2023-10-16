package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BagePage {
    WebDriver driver;
    public void openChromeBrowser(){
        System.setProperty(
                "webdriver.chrome.driver",
                "/Users/mdrubel/Documents/workspace-original/CucumberJava/chromedriver");
        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
