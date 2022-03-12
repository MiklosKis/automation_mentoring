Feature: Group radio buttons test

  Scenario Outline: Selecting "Sex" and "Age Group" radio buttons
    Given I open the https://demo.seleniumeasy.com/basic-radiobutton-demo.html page
    When Click on <sex> sex radio button
    And Click on <ageGroup> age group radio button
    And Click on the "Get values" button
    Then Verify that message shows the selected <sex> and <ageGroup> option values

  Examples:
    |sex            |ageGroup         |
    |Male           |0 - 5            |
    |Female         |5 - 15           |
    |Male           |15 - 50          |