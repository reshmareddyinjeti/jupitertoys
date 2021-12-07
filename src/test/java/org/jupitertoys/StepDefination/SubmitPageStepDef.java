package org.jupitertoys.StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.jupitertoys.driver.DriverFactory;
import org.jupitertoys.pageObject.ContactpageObject;
import org.jupitertoys.pageObject.HomePageObject;

import static org.hamcrest.MatcherAssert.assertThat;

public class SubmitPageStepDef extends DriverFactory {
    private HomePageObject homePageObject = new HomePageObject();
    private ContactpageObject contactpageObject = new ContactpageObject();

    @Given("^User is on Homepage and go to contact page$")
    public void userIsOnHomepageAndGoToContactPage() {
        homePageObject.setContactBtn();
    }

    @When("^Populate the mandatory fields$")
    public void populateTheMandatoryFields() {
        contactpageObject.enterFields();
    }

    @And("^click on submit button$")
    public void clickOnSubmitButton() {
        contactpageObject.setSubmitBtn();
    }

    @Then("^Validate successful submission message$")
    public void validateSuccessfulSubmissionMessage() {
        String actual = contactpageObject.setSubmissionMessage();
        assertThat("invalid credentials", actual, Matchers.startsWith("Thanks"));

    }
}
