Feature: Home page validation

Scenario: To verify the title of the home page

Given Initialize the browser 
And Navigate to the url
And verify that user is in homepage
Then verify the title 
And Close the browser


Scenario: To validate the main menu in home page

Given Initialize the browser 
And Navigate to the url
And verify that user is in homepage
Then Compare the main menu
And Close the browser