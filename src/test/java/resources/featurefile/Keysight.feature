Feature: HomePageMenuTest
  As a user i should navigate to menu page by click.

  Scenario: verify i should able to click on button
    Given I am on home page.
    When I click on Contact Us button.
    Then I am navigated on Contact Keysight Page.

  Scenario Outline: verify i should navigate inside the module page.
    Given I am on home page.
    When I click on top menu "<menu>"
    And I am navigated on menu page.
    Examples:
      | menu        |
      |Products + Services|
      |Solutions|
      |Industries|
      |Insights|
  Scenario: Verify the Display Message
    Given I am on home page.
    Then I will be able to see the Message "Innovation Challenge Final: Watch Live" on the page