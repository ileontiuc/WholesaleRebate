Feature: Apply prescribed rebates to orders



Scenario: Chinesse client has specific rebate

Given the client is Chinesse
When a chair is orderd
Then VAT rebate applies


Scenario: Multiple rebate types on same order

Given the client is the mom
When a chair is orderd
When there is a clearance
Then Friends&Family and Clearance rebate applies
