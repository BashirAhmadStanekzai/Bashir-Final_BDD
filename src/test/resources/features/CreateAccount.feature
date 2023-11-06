@smoke

Feature: user are able to create account with the given information


@US-3
Scenario: filling form and creating the account
  When i click on create primary account
  When when i fill up the form
  Then i click create account button
  Then i see email address shows as expected

@US-4
Scenario Outline: Creating account with existed Email address and error message
  When Navigating to home page click on Create Primary Account button
  And Type in email address "<email>"
  And Choose the prefix as "<title>"
  And Type in first name "<name>"
  And Type in last name "<lName>"
  And Select gender as "<gender>"
  And Select Marital Status as "<maritalStatus>"
  And Type in Employment Status as "<empStatus>"
  And Select DOB as "<DOB>"
  Then click on Create Account button
  When Verify "Account with email basheer.stanekzai12@gmail.com is exist"
  Examples:
    | email                      | title | name    | lName          | gender | maritalStatus | empStatus | DOB        |
    | basheer.stanekzai12@gmail.com | Mr. | Bashir Ahmad | Stanekzai  | Male | Single    | SDET      | 12/11/1994 |
