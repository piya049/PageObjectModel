Feature: Login page automation of demo app

Scenario Outline: check login is successful with valid creds
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on login Button
Then User is navigated to Home Page 
And Close the browser

Examples:
|	username			|	password		|
|	standard_user	|	secret_pass	|