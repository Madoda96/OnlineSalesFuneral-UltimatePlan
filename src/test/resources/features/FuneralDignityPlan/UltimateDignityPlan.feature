Feature: Ultimate Dignity Plan


  Scenario Outline: Access Online platform and select OU product to generate a quotation.

    Given User has selected ultimate dignity plan and they enter '<email>'
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
    And user clicks save details
    Then user should land on the Payer details page

    Examples:
      | email                       | Title | Names | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation | Beneficiary2Surname |
      | ClientelTestEmail@gmail.com | Mr    | Frkse | Bothae  | 8412228820089 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Thami             | Mr               | Child                    | 50%                              | Xuma                | Thuli             | Mr               | Child                    | 50%                              | Xuma                |


  Scenario:Click on buy now, and select the product

    Given User is on the introduction page
    Then user should be able to see the OR and OU options.


  Scenario Outline: Capture the member only plan with the minimum cover amount for main life assured


    Given User has selected ultimate dignity plan and they enter '<email>'
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User shouldn't be able to proceed if they are below eighteen.
    Examples:
      | email         | Title | Names    | Surname | IDnumber      | mobileNumber |
      | 996@gmail.com | Mr    | Friklest | Bothass | 0902018078083 | 0832002639   |


  Scenario Outline: Capture the member only plan with the minimum cover amount for main life assured
    Given User has selected ultimate dignity plan and they enter '<email>'
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User should be able to proceed to with application if they are above eighteen.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
    And user clicks save details
    Then user should land on the Payer details page

    Examples:
      | email              | Title | Names | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation | Beneficiary2Surname |
      | teleTest@gmail.com | Mr    | Friks | Botass  | 9104018078083 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Thami             | Mr               | Child                    | 50%                              | Xuma                | Thuli             | Mr               | Child                    | 50%                              | Xuma                |


  @Functional
  Scenario Outline: Capture maximum extended family members with different cover amounts


    Given User has selected ultimate dignity plan and they enter '<email>'
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds first extended member '<ExtendedMemberTitle>','<ExtendedMemeberNames>','<ExtendedMemberSurname>','<ExtendedMemberGender>','<ExtendedMemberDOB>', '<Relation>'.
    And User adds second extended member '<ExtendedMember2Title>','<ExtendedMemeber2Names>','<ExtendedMember2Surname>','<ExtendedMember2Gender>','<ExtendedMember2DOB>', '<Relation2>'.
    And User adds third extended member '<ExtendedMember3Title>','<ExtendedMemeber3Names>','<ExtendedMember3Surname>','<ExtendedMember3Gender>','<ExtendedMember3DOB>', '<Relation3>'.
    And User adds fourth extended member '<ExtendedMember4Title>','<ExtendedMemeber4Names>','<ExtendedMember4Surname>','<ExtendedMember4Gender>','<ExtendedMember4DOB>', '<Relation4>'.
    And User adds fifth extended member '<ExtendedMember5Title>','<ExtendedMemeber5Names>','<ExtendedMember5Surname>','<ExtendedMember5Gender>','<ExtendedMember5DOB>', '<Relation5>'.
    And User adds sixth extended member '<ExtendedMember6Title>','<ExtendedMemeber6Names>','<ExtendedMember6Surname>','<ExtendedMember6Gender>','<ExtendedMember6DOB>', '<Relation6>'.
    And User adds seventh extended member '<ExtendedMember7Title>','<ExtendedMemeber7Names>','<ExtendedMember7Surname>','<ExtendedMember7Gender>','<ExtendedMember7DOB>', '<Relation7>'.
    And User adds eighth extended member '<ExtendedMember8Title>','<ExtendedMemeber8Names>','<ExtendedMember8Surname>','<ExtendedMember8Gender>','<ExtendedMember8DOB>', '<Relation8>'.
    And User add a member estate beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    And user confirms captured policy information.
    Then user should get a generated policy number.



    Examples:
      | email           | Title | Names   | Surname  | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | ExtendedMemberTitle | ExtendedMemeberNames | ExtendedMemberSurname | ExtendedMemberGender | ExtendedMemberDOB | Relation | ExtendedMember2Title | ExtendedMemeber2Names | ExtendedMember2Surname | ExtendedMember2Gender | ExtendedMember2DOB | Relation2 | ExtendedMember3Title | ExtendedMemeber3Names | ExtendedMemberSurname | ExtendedMember3Gender | ExtendedMember3DOB | Relation3 | ExtendedMember4Title | ExtendedMemeber4Names | ExtendedMember4Surname | ExtendedMember4Gender | ExtendedMember4DOB | Relation4 | ExtendedMember5Title | ExtendedMemeber5Names | ExtendedMember5Surname | ExtendedMember5Gender | ExtendedMember5DOB | Relation5 | ExtendedMember6Title | ExtendedMemeber6Names | ExtendedMember6Surname | ExtendedMember6Gender | ExtendedMember6DOB | Relation6 | ExtendedMember7Title | ExtendedMemeber7Names | ExtendedMember7Surname | ExtendedMember7Gender | ExtendedMember7DOB | Relation7 | ExtendedMember8Title | ExtendedMemeber8Names | ExtendedMember8Surname | ExtendedMember8Gender | ExtendedMember8DOB | Relation8 | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck |
      | Clien@gmail.com | Mr    | Frikkse | Bothasse | 9404018078083 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr                  | David                | Dlamina               | Male                 |                   | Brother  | Mr                   | Adam                  | Thygesen               | Male                  |                    | Brother   | Mr                   | Nicolai               | Olsen                 | Male                  |                    | Aunt      | Mr                   | Peter                 | Middleton              | Male                  |                    | Cousin    | Mr                   | John                  | Smith                  | Male                  |                    | Cousin    | Mr                   | Brian                 | Habana                 | Male                  |                    | Sister    | Mr                   | Damian                | De klerk               | Male                  |                    | Brother   | Dr                   | Chelsin               | Kobe                   | Male                  |                    | Brother   | Mr                | Mandla           | Zulu                | Member Estate            |                                  | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        |
