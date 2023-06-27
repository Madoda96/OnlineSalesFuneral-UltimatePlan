
Feature: Payer Details Page
  Scenario: Capture information on Payer Details, Bank Details, Debit Check and Authorization
    Given User complete Member detail, Additional details and Beneficiary details
    And User should be able to capture Payer Banking Details
    And User should be able to confirm Debit check
    And User should be able to Authorise the debit check
    Then User should be able to click Continue button, and Navigate to navigate to Confirmations page