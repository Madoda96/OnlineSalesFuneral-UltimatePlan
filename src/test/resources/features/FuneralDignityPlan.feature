Feature: Funeral dignity plan

 @PositiveTest
  Scenario: User completing funeral dignity plan application with two additional member
    Given User is on the dignity plan page
    When User completes the required  Member details .
    And User adds two additional members, a spouse and child to the policy
    And User adds two beneficiaries for the policy by allocating percentage
    And User completes the Payer details by completing required information
    And user confirms the captured information on policy confirmation page
    And user accepts the terms and condition
    Then user should be able to see the policy number, correct monthly premium


  @NegativeTest
  Scenario: User completing funeral dignity plan application with  additional member
    Given User is on the dignity plan page
    When User completes the required  Member details .
    And User adds two additional members, a spouse and child to the policy
    And User adds two beneficiaries for the policy by allocating percentage
    Then User shouldn't be able to proceed with application if allocated percentage is less than 100 percent.

  @ValidationTest
  Scenario: User completing funeral dignity plan application with  additional members
    Given User is on the dignity plan page
    When User completes the required  Member details .
    And User adds two additional members, a spouse and child to the policy
    And user selects member estate as as a relationship to the beneficiary.
    Then the percentage allocation should default to 100 percent.

