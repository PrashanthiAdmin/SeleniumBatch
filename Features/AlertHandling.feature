#Author: your.email@your.domain.com
Feature: Alert handling page feature

@alert @smoke
Scenario: As a user, I should be able to accept the alert

When I am on alerts screen
And I click on first click me button
Then I should be able to accept the alert




@alert @smoke
Scenario: As a user, I should be able to dismiss the alert


And I click on third click me button
Then I should be able to dismiss the alert



@alert
Scenario: As a user, I should be able to enter the text into the alert


And I click on fourth click me button
Then I should be able to send the text into the alert "username@gmail.com"


@alert
Scenario Outline: As a user, I should be able to enter the text into the alert


And I click on fourth click me button
Then I should be able to send the text into the alert "<Username>"

Examples:

|Username|
|username@gmail.com|
|prashanthi@gmail.com|
|usha@gmail.com|
|shirisha@gmail.com|


