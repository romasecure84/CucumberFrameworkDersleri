Feature: Example scenario outline
  Background:
    Given setting driver
  Scenario Outline:
    Given go to login page
    And user types username "<username>"
    And user types password "<password>"
    When click button
    Then assert to success message
    Examples:
      | username | password    |
      | student  | Password123 |


  Scenario: home page loading test
    Given go to home page
    When wait two second
    Then Assert "Hello" message is displayed