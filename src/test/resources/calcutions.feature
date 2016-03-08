@WIP
Feature: Calculation of numbers

  Scenario: The sum of list
    Given a list of numbers
    |2|
    |3|
    |4|
    When I summarize them
    Then I should get 9
