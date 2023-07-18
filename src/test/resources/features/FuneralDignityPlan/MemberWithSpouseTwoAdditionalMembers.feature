Feature: Funeral dignity plan


Scenario Outline: Main member adding a spouse amd two people as beneficiaries with 50 percent each.

Given User is on the dignity plan page and they enter email
  And User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
And user clicks save details
Then user should land on the Payer details page


  Examples:   #Member details
    | Title | Names   | Surname | IDnumber      | mobileNumber |  | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 |  | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname |  | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation |  | Beneficiary2Surname |
    | Mr    | Lwandle | Duma    | 8001015178080 | 0832002639   |  | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              |  | Dr          | David       | Dlamina       |           | Male         | Thami             | Mr               | Child                    | 50%                              | Xuma                |  | Thuli             | Mr               | Child                    | 50%                              |  | Xuma                |
