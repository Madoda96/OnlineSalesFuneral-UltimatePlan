Feature: Member only With Minimum Age Extended Member

  Scenario: Capture Member Information,Additional Member, Beneficiary,payer details and confirm policy
    Given User complete Member detail
    And  User to complete Additional details
    And  User to complete Beneficiary details
    And  User to complete payer details
    Then Confirm policy Details




