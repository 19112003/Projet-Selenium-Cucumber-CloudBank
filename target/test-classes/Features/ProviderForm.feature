Feature: feature to test the provider form functionalities

  #@login
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on validate button

    Examples: 
      | username | password |
      | sa       | Sa@123   |

  #@createProvider
  Scenario: Validate creation provider is working
    Given cloudbank is open
    And user goes to the creation provider form
    When user fill the form
    And validate the informations
    Then user returns to the empty form

  #@modifyProvider
  Scenario: Validate modify provider is working
    Given user goes to the page of modifications
    When user searches for the provider to modify
    And modify the informations
    And save the informations
    Then user returns to the empty form

  #@duplicateProvider
  Scenario: Validate duplicate provider is working
    Given  user goes to the page of duplications
    When user searches for the provider to duplicate
    And validate the informations
    Then user returns to the empty form

  #@viewProvider
  Scenario: Validate view provider is working
    Given  user goes to the page of interrogations
    When user searches for the provider to view
    And view the informations of the provider
    Then user can do something else

  #@deleteProvider
  Scenario: Validate delete provider is working
    Given  user goes to the page of deletion
    When user searches for the provider to delete
    And validate the deletion of the provider
    Then user returns to the empty form
