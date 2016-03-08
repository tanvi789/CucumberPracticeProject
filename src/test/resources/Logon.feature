@WIP
Feature: Logon System

  Scenario: Logon to the system
    Given I have following users:
      | username | password |
      | test1    | ptest1   |
    When I submit the credentials
    Then I should be able to logon