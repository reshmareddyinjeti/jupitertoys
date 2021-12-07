package org.jupitertoys.StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;
import org.jupitertoys.driver.DriverFactory;
import org.jupitertoys.pageObject.AddToCartPageObject;

import static org.hamcrest.MatcherAssert.assertThat;

public class AddToCartPageStepDef extends DriverFactory {
    private AddToCartPageObject addToCartPageObject = new AddToCartPageObject();

    @When("^user go to shop page$")
    public void userGoToShopPage() {
        addToCartPageObject.goToShopPage();

    }

    @And("^click on two times on \"([^\"]*)\"$")
    public void clickOnTwoTimesOn(String itemsICart) {
        addToCartPageObject.goToShopPage();

    }

    @And("^click on one time on \"([^\"]*)\"$")
    public void clickOnOneTimeOn(String itemsInCart) {
        addToCartPageObject.cartListItems();

    }

    @Then("^Verify the items are in the cart$")
    public void verifyTheItemsAreInTheCart() {
        String actualItems = addToCartPageObject.cartListItems();
        assertThat("No items in the cart", actualItems, Matchers.anything("Funny Cow"));
    }
}
