Feature: feature to test the management account form functionalities

  #@login
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on validate button

    Examples: 
      | username | password |
      | sa       | Sa@123   |

  #@createManagementAccount
  Scenario: Validate creation of management account is working
    Given cloudbank is open
    And user goes to the create management account form
    When user fill the management account form
    And validate the account informations
    Then user exits the form
