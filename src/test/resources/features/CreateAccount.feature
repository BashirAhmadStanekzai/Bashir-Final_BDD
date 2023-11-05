Feature: user are able to create account with the given information

@US-3
Scenario: filling form and creating the account
  When i click on create primary account
  When when i fill up the form
  Then i click create account button
  Then i see email address shows as expected

@US-4
Scenario: Creating an account with an existing email address
  When i click on create primary account
  When the user enters an existing email address "basheer.stanekzai12@gmail.com"
  Then i click create account button
  Then the error message should be shown
