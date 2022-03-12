Feature: JQuery UI progress bar test

  Scenario: Download from the site
    Given I open the https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html page
    When Click on Start Download button
    Then Verify that the download has completed, displaying Close
    And Complete! is displayed as success message