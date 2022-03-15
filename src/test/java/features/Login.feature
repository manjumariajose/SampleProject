Feature: Log in to the application

Scenario Outline: Validate the log in with different types of credentials
Given Initialize the application browser 
And Navigate to the login url
And Click on the login link in home page
When Enter <username> and <password>
Then Close browser

Examples:
|username        |password|
|abc@gmail.com   |1234   | 
|test99@gmail.co |123456   |