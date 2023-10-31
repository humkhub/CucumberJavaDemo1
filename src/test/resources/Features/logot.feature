Feature: Orange HRM Logout Functionality

  Scenario: User logs out of the Orange HRM system
    Given I am logged into my Orange HRM account
    When I click the Logout link
    Then I should be redirected to the login page
