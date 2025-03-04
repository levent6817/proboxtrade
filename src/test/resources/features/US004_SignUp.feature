@SignUp
Feature: Sign Up

  Scenario: User can sign up with valid information

    Given User goes to home page
    Then click sign-up button
    When enter email
    And enter name and surname
    And enter password
    And enter confirm password
    Then click confirm button
    And the user must be on the dashboard
