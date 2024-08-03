Feature: Login functionality of Leaftaps Application


Background:
Given Launch the browser
And Load the url

Scenario: Login with valid Cedentials
And Enter the username as 'DemoSalesManager'
And Enter the password as 'Crmsfa'
When Click on the Login button
Then Errormessage should be displayed as invalid username


Scenario: Login with Invalid Cedentials
And Enter the username as 'Demosale'
And Enter the password as 'Crmsfs'
When Click on the Login button
But Errormessage should be displayed 
