Feature: Funeral dignity plan
  Scenario: User completing funeral dignity plan application with two additional member
    Given User is on the dignity plan page
    When User completes the required  Member details .
    And User adds two additional members, a spouse and child to the policy
    And User adds two beneficiaries for the policy by allocating percentage
    And User completes the Payer details by completing required information
    And user confirms the captured information on policy confirmation page
    And user accepts the terms and condition
    Then user should be able to see the policy number, correct monthly premium


