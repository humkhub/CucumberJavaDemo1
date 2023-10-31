package pages;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;

import java.util.Base64;

public class DashBoardPage extends BasePage {

    public void click_on_the_dropdown(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
    }

    public void click_on_the_logout(){
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    }

}
