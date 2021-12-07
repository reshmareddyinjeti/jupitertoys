@SmokeTest
@Testcase1
Feature: populate mandatory fields and Validate errors are gone
  As a jupiter toys user
  I want to Populate mandatory fields
  So that I can validate errors are gone

  Scenario:jupiter toys User on contact page
    Given User is on Homepage
    When user go to contact page and click on submit button
    Then Validate errors
    And Populate mandatory fields
    Then Validate errors are gone

