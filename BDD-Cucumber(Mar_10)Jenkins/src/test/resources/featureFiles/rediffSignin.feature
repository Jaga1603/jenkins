Feature: User Login

  Scenario: Login to Rediff
    Given I open the browser and navigate to "https://www.rediff.com/"
    When I click on the Sign In button
   When I should be on the login page
    Then I entered "<username>" and "<password>"
    Then I click login 

 Examples:
    | username | password |
    | nani     | nani@1   |