Feature: installation

Scenario:  is the time free?
When customer try to reserve a free time
Then the time was free


Scenario:  is the time reserved? 
When customer try to reserve a reserved time
Then the time was a reserved


Scenario: make this time free
When trying to make this time free
Then the time becomes free


Scenario: make this time reserved
When trying to make this time reserved
Then the time becomes reserved


Scenario: invalid input
When user enter invalid input
Then the input is unavailable
