@SmokeTest
@Testcase2
Feature: Validate successful submission message
  As a jupiter toys user
  I want to Populate mandatory fields
  So that I can Validate successful submission message

  Scenario:
    Given User is on Homepage and go to contact page
    When Populate the mandatory fields
    And  click on submit button
    Then Validate successful submission message
