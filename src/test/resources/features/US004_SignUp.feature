@SignUp
Feature: Sign Up

  Scenario: User can sign up with valid information

    Given User goes to home page
    Then click sign-up button
    When enter name
    And enter email or phone number
    And enter password
    Then click create account
    And the user must be on the dashboard
