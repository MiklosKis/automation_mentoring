Feature: Multiple checkbox test

  Scenario: Selecting all checkboxes
    Given I open the https://demo.seleniumeasy.com/basic-checkbox-demo.html page
    When Click on all 4 checkboxes in the multiple checkbox form
    Then Verify that all 4 checkboxes are checked
    And Verify that button text is changed to "Uncheck All"
    When Click on Option 1 to uncheck it
    Then Verify that button text is changed to "Check All"
