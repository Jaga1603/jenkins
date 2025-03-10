package stepdefs;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.RediffPage;

import java.util.List;
import java.util.Map;

public class CreateRediff {
    RediffPage rediffPage = new RediffPage();

    @When("I click on the Create Account button")
    public void i_click_create_account() {
        rediffPage.clickCreateAccount();
    }
    @Then("I should be redirected to the Create Account page")
    public void i_should_be_redirected_to_the_create_account_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("navigated to create page...");
    }
    @When("I enter the following details:")
    public void i_enter_details(List<Map<String, String>> userDetails) {
        for (Map<String, String> data : userDetails) {
            rediffPage.enterRegistrationDetails(
                data.get("Full Name"),
                data.get("Rediffmail ID"),
                data.get("Password"),
                data.get("Retype Password"),
                data.get("Alternate Email"),
                data.get("Mobile No."),
                data.get("Day"),
                data.get("Month"),
                data.get("Year"),
                data.get("Gender"),
                data.get("Country"),
                data.get("City")
            );
        }
    }

    @And("I click on the Submit button")
    public void i_click_submit() {
        rediffPage.clickSubmit();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_confirmation_message() {
        Assert.assertTrue(rediffPage.isRegistrationSuccessful(), "Registration failed!");
    }
}
