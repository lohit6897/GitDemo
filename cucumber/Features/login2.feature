Feature: login test

  Scenario: login test
    Given given chrome browser to launch
    When user enters username and password
    And click on login
    Then user see the dashboard
