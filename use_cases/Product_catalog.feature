Feature: Product_Catalog


Scenario: search for Interior product
Given product is not Interior
When i try to search for Interior product if it is Interior or not
Then the product is Interior



Scenario: search for Exterior product
Given product is not Exterior
When i try to search for Exterior product if it is Exterior or not
Then the product is Exterior



Scenario: search for Electronics product
Given product is not Electronics
When i try to search for Electronics product if it is Electronics or not
Then the product is Electronics



Scenario: search for available product
Given product is not available
When i try to search for available product if it is available or not
Then the product is available



Scenario: search if the product is exist in our market(valid)
Given the product is not exist
When I try to search for exist product
Then the product is exist



