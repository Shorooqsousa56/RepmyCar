
Feature: notification
  @tag1
  Scenario: order notification
   When customer have order
   Then notification send to customer via emial to confirm order
   
   Scenario: install notification for customer
   When customer make installation req
   Then notification send to customer via emial to confirm install req
   
   
    Scenario: install notification for installer
   When customer make installation req
   Then notification send to installer via emial to confirm install req
   