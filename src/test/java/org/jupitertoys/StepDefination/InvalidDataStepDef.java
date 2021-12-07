package org.jupitertoys.StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.jupitertoys.pageObject.ContactpageObject;
import org.jupitertoys.pageObject.HomePageObject;

import static org.hamcrest.MatcherAssert.assertThat;

public class InvalidDataStepDef {
    private HomePageObject homePageObject = new HomePageObject();
    private ContactpageObject contactpageObject = new ContactpageObject();

    @Given("^From the home page go to contact page$")
    public void fromTheHomePageGoToContactPage() {
        homePageObject.setContactBtn();
    }

    @When("^Populate mandatory fields with invalid data$")
    public void populateMandatoryFieldsWithInvalidData() {
        contactpageObject.enterInvalidData();
        contactpageObject.setSubmitBtn();

    }

    @Then("^Validate errors after entering invalid details$")
    public void validateErrorsAfterEnteringInvalidDetails() {
        String actual = contactpageObject.setSubmissionMessage();
        assertThat("sorry user not a valid credentials", actual, Matchers.startsWith("Thanks ##$$%%^^@@@@,"));
    }
}
