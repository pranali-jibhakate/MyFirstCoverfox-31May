Feature: CoverFox Health Insurance Test
Scenario:TC01:Validate Health Insurance for Single person
Given  I am on Home Page
When I click on getStarted button
And I click on next button
And I provide age as "30" and click on Next button
And i provide pincode as "412101" , mobNumber as "7687656565" and click on Continue button
Then matching Health Insurance Plan should be displayed as "48"

Scenario:TC02: Validate coverFox Car Insurance
Given I am on Home Page
When I click on Car Insurance Tab
And I provide Car Number ,click on View Quotes button
And I provide valid details and click on View Quotes button
Then I should get Plan Details

Scenario:TC03: TC03:Validate CoverFox Bike Insurance
Given I am on Home Page
When I click on Bike Insurance button 
And I provide Bike Number , click on View Quotes button
And I provide valid details and click on View Quotes button
Then I should get Plan Details

 




