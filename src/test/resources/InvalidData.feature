@SmokeTest
@Testcase3
Feature: Validate errors after entering invalid details
  As a jupiter toys user
  user wants enter invalid data
  So that user can not able to login

  Scenario:Validate errors after entering invalid details
    Given From the home page go to contact page
    When Populate mandatory fields with invalid data
    Then Validate errors after entering invalid details
