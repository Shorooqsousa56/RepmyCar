
Feature: Admin

  Scenario: adding product
  When admin try to add product
  Then the product is added

 
  Scenario: editing product
  When admin try to edit product
  Then the product is edited

  Scenario: deleting product
  When admin try to delete product
  Then the product is deleted

  