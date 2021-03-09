@wip
Feature: Search a shop


  Scenario Outline: User is able to find the desire shop
    Given User is on the Shop search results page
    When  User enter a "<location>"
    And   User click the find a shop button
    Then  User is able to see a shop in the desired location

    Examples:
      | location  |
      | London    |
      | Leeds     |
      | Cambridge |


  Scenario Outline: User is not able to find the desired shop
    Given User is on the Shop search results page
    When  User enter a "<location>"
    And   User click the find a shop button
    Then  User is not able to see a shop in the desired location

    Examples:
      | location |
      | Rome     |
      | Chicago  |
      | Paris    |