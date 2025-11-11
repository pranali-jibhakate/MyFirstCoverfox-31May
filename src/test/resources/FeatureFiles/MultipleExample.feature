Feature: Multiple data test for CoverFox health Insurance

Scenario Outline: Tc01:Validate CoverFox Health Insurance Plan for single person
Given I am on Home Page
When I click on getStarted button
And I click on next button
And I provide age as "<age>" and click on Next button
And I provide pincode as "<pincode>" , mobNum as "<mobNum>" and click on Continue button
Then matching Health Insurance Plan should be displayed as "<results>"
Examples:
|age|pincode|mobNum|results|
|23|876787|6767676767|90|
|34|786545|9867687878|48|
|26|675490|9898989898|76|





