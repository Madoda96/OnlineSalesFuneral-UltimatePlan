
Feature: H.E.L.P Product
##Test contains 3 runs with different ages for confirming rates
  Scenario Outline: Capture the member only plan with the minimum cover amount for main life assured for H.E.L.P product
    Given User has selected ultimate dignity plan  for H.E.L.P and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    Then user should be able to see all available amounts
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number for H.E.L.P with correct cover '<coverAmount>'.


    Examples:
      | Title | Names      | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation | Beneficiary2Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount         |
      | Mr    | Poppie     | Ndlovus | 8004059093082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Child                    | 50%                              | Xuma                | Mr                | Mr               | Child                    | 50%                              | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R727.00 per month   |
      | Mr    | Shamba     | Peters  | 9604056214083 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Child                    | 50%                              | Xuma                | Mr                | Mr               | Child                    | 50%                              | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R553.00 per month   |
      | Mr    | Vuyolwethu | Nkosi   | 7004058305082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Child                    | 50%                              | Xuma                | Mr                | Mr               | Child                    | 50%                              | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R1,006.00 per month |


  Scenario Outline:  Capture a member with spouse policy with age of spouse less than main member.

    Given User has selected ultimate dignity plan  for H.E.L.P and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    Then user should be able to see all available amounts
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number for H.E.L.P with correct cover '<coverAmount>'.

    Examples:
      | Title | Names   | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Bakkies | Matthew | 9204058208082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R366.00 per month |


  Scenario Outline:  Capture a member with spouse policy with age of spouse greater than main member.

    Given User has selected ultimate dignity plan  for H.E.L.P and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    Then user should be able to see all available amounts
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse over maximum age '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number for H.E.L.P with correct cover '<coverAmount>'.

    Examples:
      | Title | Names | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Chidl3Names | Child3Surname | Child3Gende | Child3IsStudent | Child3Dob | coverAmount       |
      | Mr    | Texas | Rangers | 9304057966084 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | No              |           | Mlandeli    | Zulu          | Male        | No              |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         | Sizwe       | Mazibuko      | Male        | Yes             |           | R866.00 per month |

  @Test
  Scenario Outline: Capture a member and family plan  with a spouse and three children for a H.E.L.P product
    Given User has selected ultimate dignity plan  for H.E.L.P and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User should be able to proceed to with application if they are above eighteen.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    Then user should be able to see all available amounts
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And User adds the first child '<Chidl1Names>','<Child1Surname>','<Child1Gende>','<Child1IsStudent>','<Child1Dob>' that is above eighteen years old
    And User User adds the second child '<Chidl2Names>','<Child2Surname>','<Child2Gende>','<Child2IsStudent>','<Child2Dob>' that above eighteen years old
    And User User adds the third child '<Chidl3Names>','<Child3Surname>','<Child3Gende>','<Child3IsStudent>','<Child3Dob>' that above eighteen years old
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number for H.E.L.P with correct cover '<coverAmount>'.


    Examples:
      | Title | Names   | Surname  | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Chidl3Names | Child3Surname | Child3Gende | Child3IsStudent | Child3Dob | coverAmount       |
      | Mr    | Oscar L | Harrison | 8901305988082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | Yes             |           | Mlandeli    | Zulu          | Male        | Yes             |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         | Sizwe       | Mazibuko      | Male        | Yes             |           | R639.00 per month |



  Scenario Outline: Capture a member plan with VS Rider for H.E.L.P

    Given User has selected ultimate dignity plan  for H.E.L.P and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    Then user should be able to see all available amounts
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a VS rewards
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User clicks continue to payer details page
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    And user confirms captured policy information with VS rewards.
    Then user should get a generated policy number for H.E.L.P with correct cover '<coverAmount>'.


    Examples:
      | Title | Names   | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Charlie | Moody   | 9701086422080 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R610.00 per month |

