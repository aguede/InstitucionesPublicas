Feature: Selenium POC
	this feature verifies the functionality of a selenium POC.
	Scenario: Check that rest service returns "HelloWorld"
	Given I launch Chrome browser
	When I open google url
	Then it says google