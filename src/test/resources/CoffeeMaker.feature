@WIP
Feature: Coffee Maker

  Scenario: Buying a Coffee
    Given a set menu
    When I just want to buy a coffee
    But I have no hard money
    Then I should be able to use the bank card
