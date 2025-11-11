Feature: Study Data Table in BDD
Scenario: Test gmail Login
Given I am on Login page
Then I provide details and click on Login button
|UserName|Password|
|test123|4567|
|test456|9878|
Then I should navigate to inbox
