#Author: your.email@your.domain.com
Feature: Home page feature

@smoke
Scenario: As a user, I should be able to login to the application

When I am on login screen
And I enter email id
And I enter password
When I click on login button
Then I should be able to login to the application


Scenario: As a user, I should not be able to login with wrong credentials


When I am on login screen
And I enter wrong email id
And I enter wrong password
When I click on login button
Then I should not be able to login to the application





