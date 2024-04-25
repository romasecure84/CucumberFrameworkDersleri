Feature: Example Scenario
  Scenario: go to website and login test
    Given go to login page
    And type username
    And type password
    When click button
    Then assert to success message