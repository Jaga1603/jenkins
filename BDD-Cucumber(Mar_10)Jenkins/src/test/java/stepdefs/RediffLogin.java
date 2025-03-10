package stepdefs;

import io.cucumber.java.en.*;
import pages.RediffPage;

public class RediffLogin {
    RediffPage rediffPage = new RediffPage();

    

    @When("I click on the Sign In button")
    public void i_click_sign_in() {
        rediffPage.clickSignIn();
    }

    @When("I should be on the login page")
    public void i_should_be_on_login_page() {
        // Optional: Add verification
    }

    @Then("I click login")
    public void i_click_login() {
        rediffPage.clickLogin();
        rediffPage.captcha();
    }

    
    @Given("I open the browser and navigate to {string}")
    public void i_open_the_browser_and_navigate_to(String string) {
        // Write code here that turns the phrase above into concrete actions
    	rediffPage.navigateToRediff();
    }

    @Then("I entered {string} and {string}")
    public void i_entered_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    	rediffPage.enterLoginCredentials(string, string2);
    }
}
