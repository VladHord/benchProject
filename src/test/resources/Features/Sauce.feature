Feature: Testing purchase in swag labs
  Scenario: Verify that we are able to purchase a backpack in swag labs site
    Given Open login page
    When Enter login and password
    And click on login button
    And Select backpack
    And Click on cart button
    Then Check that we have backpack in the cart