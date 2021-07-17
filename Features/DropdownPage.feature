#Author: your.email@your.domain.com
Feature: Dropdown page feature

@dropdown
Scenario: As a user, I should be able to select any value from dropdown

When I am on register screen
Then I select a value from the country dropdown

@dropdown
Scenario: As a user, I should be able to see all the values from dropdown


Then I should see all the values in country dropdown

@dropdown
Scenario: As a user, I should be able to see Bermuda as the value in country drodown


Then I should see bermuda value in the country






