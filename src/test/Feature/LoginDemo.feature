 Feature: Test Login functionality

   @LoginTest
  Scenario Outline: Check login is successful with valid credentials

    Given user opens the browser
    And user navigates to the login page of the site
    When enters "<username>" and "<password>"
    And user clicks on login
    Then user navigates to the home page

    Examples:
      | username | password |
      | John Doe | 12345    |
      | Jack     | password@123 |
