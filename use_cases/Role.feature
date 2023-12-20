 Feature: Role

Scenario: invalid log in as admin
Given I am not log in
When i enter email: "sara@gmail.com" and password :"1275" inf for admin
Then invalid log in

Scenario: valid log in as admin
Given I am not log in
When i enter email: "s12028923@stu.najah.edu" and password :"123abc" inf for admin
Then valid log in



Scenario: invalid log in as installer
Given I am not log in
When i enter email: "mariam@gmail.com" and password :"12kjm75" inf for installer
Then invalid log in

Scenario: valid log in as installer
Given I am not log in
When i enter email: "shorooqsousa@gmail.com" and password :"123sh" inf for installer
Then valid log in

Scenario: invalid log in as customer
Given I am not log in
When i enter email: "s12028923@stu.najah.com" and password :"123abc" inf for customer
Then invalid log in

Scenario: valid log in as customer
Given I am not log in
When i enter email: "s12029069@stu.najah.edu" and password :"123456" inf for customer
Then valid log in
    
    