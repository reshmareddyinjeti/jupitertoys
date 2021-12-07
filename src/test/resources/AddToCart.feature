@SmokeTest
@Testcase4
Feature: Verify the items are in the cart
  As a jupiter toys user
  user wants to add a items to cart
  So that user can bye a toys

  Scenario:Verify the items are in the cart
    Given User is on Homepage
    When user go to shop page
    And click on two times on "Funny Cow"
    And click on one time on "Fluffy Bunny"
    Then  Verify the items are in the cart
