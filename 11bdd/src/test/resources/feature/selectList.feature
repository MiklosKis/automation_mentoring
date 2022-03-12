Feature: Select list test

  Scenario Outline: Selecting a day from the dropdown list
    Given I open the <url> page
    When Select <day> from the dropdown
    And Verify that the <day> is selected
    Then Verify that the message shows the <day> item

  Examples:
    |url      |day      |
    |https://demo.seleniumeasy.com/basic-select-dropdown-demo.html         |Tuesday         |
    |https://demo.seleniumeasy.com/basic-select-dropdown-demo.html         |Wednesday       |