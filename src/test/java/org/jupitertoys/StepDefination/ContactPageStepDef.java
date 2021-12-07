package org.jupitertoys.StepDefination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.jupitertoys.driver.DriverFactory;
import org.jupitertoys.pageObject.AddToCartPageObject;
import org.jupitertoys.pageObject.ContactpageObject;
import org.jupitertoys.pageObject.HomePageObject;

import static org.hamcrest.MatcherAssert.assertThat;

public class ContactPageStepDef extends DriverFactory {
    private HomePageObject homePageObject = new HomePageObject();
    private ContactpageObject contactpageObject = new ContactpageObject();


    @Given("^User is on Homepage$")
    public void userIsOnHomepage() {
        homePageObject.setContactBtn();
    }

    @When("^user go to contact page and click on submit button$")
    public void userGoToContactPageAndClickOnSubmitButton() {
        contactpageObject.setSubmitBtn();
    }


    @Then("^Validate errors$")
    public void validateErrors() {
        String actual = contactpageObject.verificationError();
        assertThat("Not valid error message", actual, Matchers.anything("We welcome your feedback - but we won't get it unless you complete the form correctly"));
    }

    @And("^Populate mandatory fields$")
    public void populateMandatoryFields() {
        homePageObject.setContactBtn();
        contactpageObject.enterFields();
        contactpageObject.setSubmitBtn();
    }

    @Then("^Validate errors are gone$")
    public void validateErrorsAreGone() {
        String actual = contactpageObject.setSubmissionMessage();
        assertThat("sorry user not valid a credentials", actual, Matchers.comparesEqualTo("Thanks sandeep, we appreciate your feedback."));

    }

}
