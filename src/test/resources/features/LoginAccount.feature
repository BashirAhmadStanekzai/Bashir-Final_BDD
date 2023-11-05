Feature: logging in to the tek insurance app and validating customer service portal

@US-5
Scenario: log in with valid csr username and password and validate customer portal
  When user clicks on the login button
  Then user enters username as "supervisor"
  Then user enters password as "tek_supervisor"
  Then user click sign in button
  And customer service portal should be displayed

@US-6
Scenario: logging in with wrong credentials and validating error message
  When user clicks on the login button
  Then user enters username as "wrong username"
  Then user enters password as "wrong password"
  Then user click sign in button
  And error message should be displayed




