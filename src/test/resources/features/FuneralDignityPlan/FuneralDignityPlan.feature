Feature: Funeral dignity plan

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


    Examples:
      | email                   | Title | Names  | Surname | IDnumber      | mobileNumber |  | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 |  | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname |  | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation |  | Beneficiary2Surname |
      | mwelaseNzima1@gmail.com | Mr    | Mandla | Dumas   | 9101017798080 | 0832002639   |  | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              |  | Dr          | David       | Dlamina       |           | Male         | Thami             | Mr               | Child                    | 50%                              | Xuma                |  | Thuli             | Mr               | Child                    | 50%                              |  | Xuma                |


  @NegativeTest
  Scenario Outline: Main member adding two children that are above 18 but are not students to a policy.
    Given User is on the dignity plan page and they enter '<email>'
    And User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds the first child '<Chidl1Names>','<Child1Surname>','<Child1Gende>','<Child1IsStudent>','<Child1Dob>' that is above eighteen years old
    And User User adds the second child '<Chidl2Names>','<Child2Surname>','<Child2Gende>','<Child2IsStudent>','<Child2Dob>' that above eighteen years old
    And user enters Beneficiary details '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'.
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'.
    And user confirms captured policy information.
    Then policy number shouldn't be generated due to age of children

    Examples:
      | email                | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck |
      | MwelaseNI1@gmail.com | Mr    | Sphiwe | Dumaa   | 9101015006080 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | No              |           | Mlandeli    | Zulu          | Male        | No              |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        |


  @PositiveTest
  Scenario Outline: Main member adding two children that are above 18 and  are students to a policy.
    Given User is on the dignity plan page and they enter '<email>'
    And User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds the first child '<Chidl1Names>','<Child1Surname>','<Child1Gende>','<Child1IsStudent>','<Child1Dob>' that is above eighteen years old
    And User User adds the second child '<Chidl2Names>','<Child2Surname>','<Child2Gende>','<Child2IsStudent>','<Child2Dob>' that above eighteen years old
    And user enters Beneficiary details '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'.
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'.
    And user confirms captured policy information.
    Then policy number should be generated with children added

    Examples:
      | email                  | Title | Names    | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck |
      | MwelaseNzia1@gmail.com | Mr    | Simphiwe | Dumas   | 9101018896081 | 0832002539   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | Yes             |           | Mlandeli    | Zulu          | Male        | Yes             |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        |
