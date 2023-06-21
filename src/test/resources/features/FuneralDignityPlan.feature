Feature: Funeral dignity plan

# @PositiveTest
#  Scenario: User completing funeral dignity plan application with two additional member
#    Given User is on the dignity plan page
#    When User completes the required  Member details .
#    And User adds two additional members, a spouse and child to the policy
#    And User adds two beneficiaries for the policy by allocating percentage
#    And User completes the Payer details by completing required information
#    And user confirms the captured information on policy confirmation page
#    And user accepts the terms and condition
#    Then user should be able to see the policy number, correct monthly premium
#
#
#  @NegativeTest
#  Scenario: User completing funeral dignity plan application with  additional member
#    Given User is on the dignity plan page
#    When User completes the required  Member details .
#    And User adds two additional members, a spouse and child to the policy
#    And User adds two beneficiaries for the policy by allocating percentage
#    Then User shouldn't be able to proceed with application if allocated percentage is less than 100 percent.
#
#  @ValidationTest
#  Scenario: User completing funeral dignity plan application with  additional members
#    Given User is on the dignity plan page
#    When User completes the required  Member details .
#    And User adds two additional members, a spouse and child to the policy
#    And user selects member estate as as a relationship to the beneficiary.
#    Then the percentage allocation should default to 100 percent.




  @RegressionTest
  Scenario Outline: Main member adding a spouse amd two people as beneficiaries with 50 percent each.

      Given User is on the dignity plan page and they enter '<email>'
      And User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
      And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
      And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
      And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
      And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
      And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
      And user clicks save details
      Then user should land on the Payer details page


    Examples:   #Member details
     |email   | Title  | Names| Surname| IDnumber| mobileNumber|  |PostalAddress|PostalCode| MonthlyIncome| Occupation|education| FicaDeclaration1| FicaDeclaration2||spouseTitle|spouseNames|spouseSurname|spouseDOB| spouseGender   |Beneficiary1Title| Beneficiary1Name |Beneficiary1Relationship|Beneficiary1PercantageAllocation|  Beneficiary1Surname|   |Beneficiary2Title| Beneficiary2Name |Beneficiary2Relationship|Beneficiary2PercantageAllocation|| Beneficiary2Surname|
     | BQQP@gmail.com| Mr | Lwandle | Duma|0001016502088 |0125698547||12345 Test |1205   | R15,000 - R18,000| Skilled agriculture| Post-graduate (Honours, Masters etc) |Yes  |Yes||Dr|David |Dlamina |  | Male |Thami |Mr |  Child  | 50% |Xuma| |   Thuli     |  Mr |   Child |50% ||Xuma|


