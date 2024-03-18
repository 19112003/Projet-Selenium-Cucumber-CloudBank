# Author: Maeva KOUOMO
Feature: feature to test login function

  @login
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on validate button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | sa       | Sa@123   |
