Feature: feature to test the creation provider functionality

  @createProvider
  Scenario: Validate creation provider is working
    Given cloudbank is open
    And user goes to the creation provider form
    When user fill the form
    And validate the informations
    Then user can do something else
