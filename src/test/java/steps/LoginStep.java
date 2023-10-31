package steps;


import cucumber.api.java.en.*;
import pages.DashBoardPage;
import pages.LoginPage;

public class LoginStep {
    LoginPage lp;

    public LoginStep (){
        lp = new LoginPage();
    }



    @Given("^I am on the Login page$")
    public void i_am_on_the_Login_page() throws Throwable {
        lp.openChromeBrowser();
        System.out.println("Browser Open Successfully");
    }
    @When("^I enter valid username and password$")
    public void i_enter_valid_username_and_password() throws Throwable {
        lp.enter_valid_username_and_password();
        System.out.println("Enter valid credential successfully");
    }
    @When("^I click the Login button$")
    public void i_click_the_Login_buatton() throws Throwable {
        lp.click_the_Login_buatton();
        System.out.println("Close browser successfully");

    }
    @Then("^I should be redirected to the user dashboard$")
    public void i_should_be_redirected_to_the_user_dashboard() throws Throwable {
    lp.Verify_dashboard();
        System.out.println("Verify Dashboard test successfulyy");
        lp.CloseBrowser();
        System.out.println("Browser close successfully");
    }
}

