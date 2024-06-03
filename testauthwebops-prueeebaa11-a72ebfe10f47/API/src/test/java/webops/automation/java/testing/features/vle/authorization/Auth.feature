@zzzz
Feature: authorization checks for assignments

  Scenario: admin can get authorized in webops
    Given the user is authenticated as a adminVpn
    Then the user can create a new case


