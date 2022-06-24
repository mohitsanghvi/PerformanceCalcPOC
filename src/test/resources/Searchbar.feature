Feature: Verify Amazon Search Bar

  Scenario: New user is able to search Product
    Given User is on Home page
    When User searches for "Macbook Pro"
    Then Options matching to the searched product should be displayed to User