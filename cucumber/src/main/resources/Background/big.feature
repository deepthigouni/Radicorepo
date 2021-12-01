Feature: Google Search 


Background:
Given open Browser
And enter url

@Smoke
Scenario: Google Search Valid
When user give valid input 
Then Field should accept

@FT
Scenario: Google Search Invalid
When user give invalid input
Then Field should not accept