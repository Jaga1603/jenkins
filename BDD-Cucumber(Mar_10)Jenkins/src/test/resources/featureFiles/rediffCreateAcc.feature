Feature: User Registration

  Scenario: Create a new account
    Given I open the browser and navigate to "https://www.rediff.com/"
    When I click on the Create Account button
    Then I should be redirected to the Create Account page
    When I enter the following details:
      | Full Name | Rediffmail ID | Password | Retype Password | Alternate Email | Mobile No. | Day | Month | Year | Gender | Country | City |
      | Jagadeesh  | jaga1820     | P@ssw0rd | P@ssw0rd        | john.alt@gmail.com | 9876543210 | 10  | MAY   | 1990 | Male   | India   | Mumbai |
    And I click on the Submit button
    #Then I should see a confirmation message
