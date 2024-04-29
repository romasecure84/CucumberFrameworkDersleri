Feature: Example scenario outline

  Scenario Outline:
    Given go to login page
    And user types username "<username>"
    And user types password "<password>"
    When click button
    Then assert to success message
    Examples:
      | username | password    |
      | student  | Password123 |
      | roma     | 123456      |
      | python   | 987456321   |