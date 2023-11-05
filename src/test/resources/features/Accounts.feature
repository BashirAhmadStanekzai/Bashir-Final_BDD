Feature: Accounts - Customer Service Portal and Account Data Validation

  Background:
    When user clicks on the login button
    Then user enters username as "supervisor"
    Then user enters password as "tek_supervisor"
    Then user click sign in button
    And the user navigate to the "Accounts" Link

  @US-10
  Scenario: Login and Navigate to Accounts
    Then the user should validate the 5 rows of data in default

  @US-11
  Scenario Outline: Changing the show per page Record
    When the user changes the Show Per Page Record to "<Show Per Page Records>"
    Then the table records per page should be <Expected Table Records>
    Examples:
      | Show Per Page Records | Expected Table Records |
      | Show 10               | 10                     |
      | Show 25               | 25                     |
      | Show 50               | 50                     |