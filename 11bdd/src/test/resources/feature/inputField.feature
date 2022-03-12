Feature: Input fields test

  Scenario Outline: Single input field test
    Given I open the https://demo.seleniumeasy.com/basic-first-form-demo.html page
    When Enter <text> into the single input field
    And Click on the "Show Message" button
    Then Verify that the <text> shown is equal to the one I have entered

  Examples:
    |text   |
    |Best test message!           |
    |It is another test message!  |

  Scenario: Two Input Fields - Error Check
    Given I open the https://demo.seleniumeasy.com/basic-first-form-demo.html page
    When Enter 10 to the first input field
    And Enter Duck to the second input field
    And Click on the "Get Total" button
    Then Verify that the string "NaN" is displayed as total value
