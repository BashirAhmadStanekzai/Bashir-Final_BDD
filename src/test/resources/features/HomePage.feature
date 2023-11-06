@smoke

Feature: validating the functionalities of tek insurance
@US-1
  Scenario: validating header and login create account button
    Then the "Create Primary Account" is displayed
    Then the page title should be "Tek Insurance UI"


  @US-2
  Scenario: User navigates to the Home page and clicks on the "Create Primary Account" Button
    When click on the "Create Primary Account" button
    Then the Form Title is "Create Primary Account Holder"
