#Author: your.email@your.domain.com
Feature: Alert handling page feature



    Scenario: As a user, I should be able to do the drag and drop action
    
    Then I do the drag and drop for debit side
 

As a user, I should be able to add the regular hours with decimals
As a user, I should see total hours when I add both regular and overtime1 hours
As a user, I should see total hours when I add both regular and overtime1 and overtime2 hours
As a user , I should be able to see the title as Hours
As a user, I should be able to cancel the hour pad
As a user, I should be able to clear the value from hour pad
As a user, I should be able to enter decimal values upto 2 digits
As a user, I should be able to enter negative values
As a user, I should be able to verify total hours after entering negative regular hours
As a user, I should see the selected hours on clicking hour pad again
As a user, I should be able to edit the hours on hour pad


Scenario Outline:As a user, I should be able to add the regular hours with decimals

When I click on regular tab
And I enter hours "<hours>"
And I click on done button
Then I should see the regular hours "<hours>"
Then I should see the total hours "<hours>"
Examples:

|hours|
|1.25|




Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 hours


When I click on overtime1
And I enter hours "<overtime1>"
And I click on done button
Then I should see the overtime1 hours "<overtime1>"
Then I should see the total hours "<regularhours>""<overtime1>"

Examples:

|overtime1|regularhours|
|1.25|2.23|

Scenario Outline: As a user, I should see total hours when I add both regular and overtime1 and overtime2 hours


When I click on overtime2
And I enter hours "<overtime2>"
And I click on done button
Then I should see the overtime2 hours "<overtime1>"
Then I should see the total hours "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|
|1.25|2.23|3.22|


Scenario: As a user , I should be able to see the title as Hours


Then I should see the title as hours in hour pad




Scenario: As a user, I should be able to cancel the hour pad

When I click on cancel button
Then I should see the add worker hours title



Scenario: As a user, I should be able to clear the value from hour pad

When I click on regular
When I clear the regular hours
Then I should see zero regular hours


Scenario Outline: As a user, I should not be able to enter decimal values more than two digits


When I click on regular tab
And I enter hours "<hours>"
Then I should see the regular hours "<hours>"
Then I should see the total hours "<hours>"
Examples:

|hours|
|1.253|


Scenario Outline: As a user, I should be able to enter negative values

When I click on regular tab
And I enter hours "<hours>"
Then I should see the regular hours "<hours>"
Then I should see the total hours in hour pad "<hours>"
Examples:

|hours|
|-5.55|


Scenario Outline: As a user, I should be able to verify total hours after entering negative regular hours

When I click on overtime2
And I enter hours "<overtime2>"
And I click on done button
Then I should see the overtime2 hours "<overtime1>"
Then I should see the total hours as "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|
|-5.55|2.23|3.22|



Scenario Outline: As a user, I should see the selected hours on clicking hour pad again

When I click on overtime2
Then I should see the overtime2 hours "<overtime2>"
Then I should see the total hours "<regularhours>" "<overtime1>" "<overtime2>"

Examples:

|overtime1|regularhours|overtime2|
|-5.55|2.23|3.22|


Scenario Outline: As a user, I should be able to edit the hours on hour pad


When I click on regular tab on hour pad
And I click remove text
And I enter hours "<regularhours>"
Then I should see the regular hours "<regularhours">

Examples:

|regularhours|
|5|


