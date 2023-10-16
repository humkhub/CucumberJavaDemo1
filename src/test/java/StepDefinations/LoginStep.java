package StepDefinations;


import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    LoginPage lp;
    public LoginStep (){
        lp = new LoginPage();
    }



    @Given("^I am on the Login page$")
    public void i_am_on_the_Login_page() throws Throwable {
        lp.openChromeBrowser();
    }
    @When("^I enter valid username and password$")
    public void i_enter_valid_username_and_password() throws Throwable {
        lp.enter_valid_username_and_password();
    }
    @When("^I click the Login button$")
    public void i_click_the_Login_buatton() throws Throwable {
        lp.click_the_Login_buatton();
    }
    @Then("^I should be redirected to the user dashboard$")
    public void i_should_be_redirected_to_the_user_dashboard() throws Throwable {
    lp.Verify_dashboard();
    }}

