Feature: validating correct information on profile side drawer.

  Background: long in and sign in button repeats for each scenario
    When user clicks on the login button
    Then user enters username as "supervisor"
    Then user enters password as "tek_supervisor"
    Then user click sign in button

@US-7
Scenario: validating correct information on profile side drawer
   Then click on profile button
   And validate "Active" is correct
   And validate "CSR" is ok
   And Validate "Supervisor" is entered right
   And validate "supervisor" is fine
   And validate "admin" is as expected

@US-8
Scenario: validating that the user is able to logout after log in and the homepage is displayed
  Then click on profile button
  Then user clicks on logout button
  Then user is on homepage


