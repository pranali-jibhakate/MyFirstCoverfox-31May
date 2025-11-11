Feature: Study Data Table in BDD
Scenario: Test gmail Login
Given I am on Login page
Then I provide details and click on Login button
|UserName|Password|msg|
|test123|4567|Welcome|
|test456|9878|Thank You|
Then I should navigate to inbox
