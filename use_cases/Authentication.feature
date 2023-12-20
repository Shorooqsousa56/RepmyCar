

Feature: Authentication

    Scenario: log out
  Given I am in system
  When I enter log out
  Then log out succeeded
  

  
  Scenario: valid log in 
    Given I am not in system
    When I enter correct email and password
    Then log in succed
   
  Scenario: invalid log in
  Given I am not in system
  When I enter wrong email and password
  Then log in fail
  
  
    
  
  

  
  #email pwd username  Bday  phone#  
   
  Scenario: sign up with reserved email
  Given I do not have an account
  When I enter all my information with resereved email
  Then sign up failed
  
  
  Scenario: signup with missing field
  Given I do not have an account
  When I enter my information , but ther is missing field
  Then sign up failed
  
  
  Scenario: sign up with special char in username
  Given I do not have an account
  When I enter my inf but there is special char in username
  Then sign up failed
  
  
  
  Scenario: valid sign up 
  Given I do not have an account
  When I enter all my information correctly
  Then sign up succed  
    
   
    
    
    
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  # Then I verify the <status> in step

  # Examples: 
  #   | name  | value | status  |
  #    | name1 |     5 | success |
  #   | name2 |     7 | Fail    |
