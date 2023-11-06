@smoke

Feature: navigating to customer service portal and Validate 4 row of data is present in plans

  Background: long in and sign in button repeats for each scenario
    When user clicks on the login button
    Then user enters username as "supervisor"
    Then user enters password as "tek_supervisor"
    Then user click sign in button


@US-9
Scenario: validating to portal and validating 4 rows
   Then user clicks on plans button
   Then 4 rows should be displayed for the user

@US-10
Scenario:Validating time accuracy in date table
  Then user clicks on plans button
  Then Validate DATE CREATED is November 5, 2023
  And Validate DATE EXPIRE is November 6, 2023





