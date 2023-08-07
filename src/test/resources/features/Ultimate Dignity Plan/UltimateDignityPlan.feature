Feature: Ultimate Dignity Plan


  Scenario Outline: Access Online platform and select OU product to generate a quotation.

    Given User is on the online sales home page
    When user clicks the get quote button.
    And enters '<FullName>' , '<ContactNum>' ,'<emailaddress>', '<DateOfDOB>' , '<MonthOfDOB>' , '<YearOfDOB>'.
    And user chooses a plan '<ChoosePlan>' and cover type '<CoverType>'.
    And user chooses the cover amount and adds two additional members '<CoverAmount>', '<ExtendedMember>'
    And user selects age of '<additionalmember1>' and '<additionalMember2>'.
    And user clicks the submit button.
    Then user should be able to see a quotation.


    Examples:
      | FullName | ContactNum | emailaddress              | DateOfDOB | MonthOfDOB | YearOfDOB | ChoosePlan                    | CoverType | CoverAmount | ExtendedMember | additionalmember1 | additionalMember2 |
      | Mlandeli | 0832002639 | ClienteleTest1@test.co.za | 25        | 05         | 1992      | Ultimate Funeral Dignity Plan | Family    | R60 000     | Yes            | 19 years old      | 33 years old      |


  Scenario:Click on buy now, and select the product

    Given User is on the introduction page
    Then user should be able to see the OR and OU options.


  Scenario Outline: Capture the member only plan with the minimum cover amount for main life assured


    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User shouldn't be able to proceed if they are below eighteen.
    Examples:
      | Title | Names | Surname  | IDnumber      | mobileNumber |
      | Mr    | Aya   | Sabasaba | 1001302906083 | 0832002639   |


  Scenario Outline: Capture the member only plan with the minimum cover amount for main life assured
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User should be able to proceed to with application if they are above eighteen.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
  ##  And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User adds second beneficiary '<Beneficiary2Title>', '<Beneficiary2Name>', '<Beneficiary2Surname>','<Beneficiary2Relationship>', '<Beneficiary2PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | Beneficiary2Title | Beneficiary2Name | Beneficiary2Relationship | Beneficiary2PercantageAllocation | Beneficiary2Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Poppie | Ndlovus | 8901306321085 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Child                    | 50%                              | Xuma                | Mr                | Mr               | Child                    | 50%                              | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R322.00 per month |


  Scenario Outline: Capture maximum extended family members with different cover amounts # add validation for slider extended members and for main life assured--- for everything
    Given User has selected ultimate dignity plan and they enter email
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
    #Then user confirms captured policy information and get a policy number.
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | ExtendedMemberTitle | ExtendedMemeberNames | ExtendedMemberSurname | ExtendedMemberGender | ExtendedMemberDOB | Relation | ExtendedMember2Title | ExtendedMemeber2Names | ExtendedMember2Surname | ExtendedMember2Gender | ExtendedMember2DOB | Relation2 | ExtendedMember3Title | ExtendedMemeber3Names | ExtendedMember3Surname | ExtendedMember3Gender | ExtendedMember3DOB | Relation3 | ExtendedMember4Title | ExtendedMemeber4Names | ExtendedMember4Surname | ExtendedMember4Gender | ExtendedMember4DOB | Relation4 | ExtendedMember5Title | ExtendedMemeber5Names | ExtendedMember5Surname | ExtendedMember5Gender | ExtendedMember5DOB | Relation5 | ExtendedMember6Title | ExtendedMemeber6Names | ExtendedMember6Surname | ExtendedMember6Gender | ExtendedMember6DOB | Relation6 | ExtendedMember7Title | ExtendedMemeber7Names | ExtendedMember7Surname | ExtendedMember7Gender | ExtendedMember7DOB | Relation7 | ExtendedMember8Title | ExtendedMemeber8Names | ExtendedMember8Surname | ExtendedMember8Gender | ExtendedMember8DOB | Relation8 | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount         |
      | Mr    | Mary J | Solley  | 9101309208087 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr                  | David                | Dlamina               | Male                 |                   | Brother  | Mr                   | Adam                  | Thygesen               | Male                  |                    | Brother   | Mr                   | Nicolai               | Olsen                  | Male                  |                    | Aunt      | Mr                   | Peter                 | Middleton              | Male                  |                    | Cousin    | Mr                   | John                  | Smith                  | Male                  |                    | Cousin    | Mr                   | Brian                 | Habana                 | Male                  |                    | Sister    | Mr                   | Damian                | De klerk               | Male                  |                    | Brother   | Dr                   | Chelsin               | Kobe                   | Male                  |                    | Brother   | Mr                | Mandla           | Zulu                | Member Estate            | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R2,690.00 per month |


  Scenario Outline: Capture an extended family member with the age band to show the minimum cover amount
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds first extended member '<ExtendedMemberTitle>','<ExtendedMemeberNames>','<ExtendedMemberSurname>','<ExtendedMemberGender>','<ExtendedMemberDOB>', '<Relation>'.
    Then User should see minimum cover of ten thousand for a new premium
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User clicks continue to payer details page
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names   | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | ExtendedMemberTitle | ExtendedMemeberNames | ExtendedMemberSurname | ExtendedMemberGender | ExtendedMemberDOB | Relation | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Kenneth | Kunena  | 8801307101082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr                  | David                | Dlamina               | Male                 |                   | Brother  | Mr                | Thami            | Xuma                | Member Estate            | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R322.00 per month |


  Scenario Outline: Capture an extended family member with the age band above 51 to show the minimum cover amount

    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds an extended member above 51 but less than 81 '<ExtendedMemberTitle>','<ExtendedMemeberNames>','<ExtendedMemberSurname>','<ExtendedMemberGender>','<ExtendedMemberDOB>', '<Relation>'.
    Then User should see minimum cover of five thousand for a new premium
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User clicks continue to payer details page
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names     | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | ExtendedMemberTitle | ExtendedMemeberNames | ExtendedMemberSurname | ExtendedMemberGender | ExtendedMemberDOB | Relation | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Desiree R | Wood    | 8801309732082 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Mr                  | Brian                | Habana                | Male                 |                   | Sister   | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R631.00 per month |


  Scenario Outline: Capture a member plan with VC Rider

    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a VC rewards and clicks the continue button
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User clicks continue to payer details page
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    And user confirms captured policy information with VC rewards.
    Then user should get a generated policy number with correct cover '<coverAmount>'.


    Examples:
      | Title | Names   | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount |
      | Mr    | Michals | Mudaa   | 9301309277088 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thamie           | Xulus               | Member Estate            | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        |  R362.00 per month |


  Scenario Outline: Capture a member plan with VS Rider

    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a VS rewards
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And User clicks continue to payer details page
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    And user confirms captured policy information with VS rewards.
    Then user should get a generated policy number with correct cover '<coverAmount>'.


    Examples:
      | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Mark R | Hall    | 8901307400086 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R401.00 per month |


  Scenario Outline:  Access Online platform and select OR product to generate a quotation

    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then user should see all available amounts on the slider.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Bakies | Boths   | 9201308022081 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R366.00 per month |


  Scenario Outline: Capture a maximum cover member only OU plan
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User should be able to proceed to with application if they are above eighteen and see maximum cover.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.
    Examples:
      | Title | Names  | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Beneficiary1Title | Beneficiary1Name | Beneficiary1Relationship | Beneficiary1PercantageAllocation | Beneficiary1Surname | bankName                  | accountType     | accountNumber | debitDate | Debicheck | coverAmount       |
      | Mr    | Pollen | Davie   | 8901306192080 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Dr          | David       | Dlamina       |           | Male         | Mr                | Thami            | Member Estate            | 100%                             | Xuma                | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | R373.00 per month |


  Scenario Outline: Capture a member and family plan (FR03) with a spouse and children
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    Then User should be able to proceed to with application if they are above eighteen.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And User adds the first child '<Chidl1Names>','<Child1Surname>','<Child1Gende>','<Child1IsStudent>','<Child1Dob>' that is above eighteen years old
    And User User adds the second child '<Chidl2Names>','<Child2Surname>','<Child2Gende>','<Child2IsStudent>','<Child2Dob>' that above eighteen years old
    And User User adds the third child '<Chidl3Names>','<Child3Surname>','<Child3Gende>','<Child3IsStudent>','<Child3Dob>' that above eighteen years old
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.


    Examples:
      | Title | Names   | Surname  | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Chidl3Names | Child3Surname | Child3Gende | Child3IsStudent | Child3Dob | coverAmount       |
      | Mr    | Oscar L | Harrison | 8901306317083 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | Yes             |           | Mlandeli    | Zulu          | Male        | Yes             |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         | Sizwe       | Mazibuko      | Male        | Yes             |           | R373.00 per month |



  Scenario Outline: Try to Capture spouse over the maximum age allowed on the policy
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse over maximum age '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Chidl3Names | Child3Surname | Child3Gende | Child3IsStudent | Child3Dob | coverAmount |
      | Mr    | Texas | Rangers | 9301305900089 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | No              |           | Mlandeli    | Zulu          | Male        | No              |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         | Sizwe       | Mazibuko      | Male        | Yes             |           |  R866.00 per month           |




  Scenario Outline: Beneficiary must equal 100%
    Given User is on the dignity plan page and they enter email
    And User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.

    Examples:
      | Title | Names   | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB   | spouseGender | coverAmount |
      | Mr    | Lwandle | Dumma   | 9301306505085 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | No              |           | Mlandeli    | Zulu          | Male        | No              |           | Mr                | Mandla           | Zulu                | Member Estate            | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       | 1952,Sep,05 | Male         |  R341.00 per month           |



  Scenario Outline: Payer details can be the main life assured or another individual
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And User adds a spouse '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with correct cover '<coverAmount>'.


    Examples:
      | Title | Names | Surname  | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | coverAmount |
      | Mr    | lihle | Dumakude | 9301306948087 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | Mr                | Mandla           | Zulu                | Member Estate            | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         |  R365.00 per month           |


  @NegativeTest
  Scenario Outline: Capture a Funeral Dignity Dignity for a person who has an active Ultimate Dignity plan

    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    Then Message that confirm multiple policy should displayed


    Examples:
      | Title | Names | Surname  | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 |
      | Mr    | lihle | Dumakude | 9301302749083 | 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              |



  @StaffMemberTest
  Scenario Outline:Capture a Funeral Dignity/Ultimate Dignity for a staff member.
    Given User has selected ultimate dignity plan and they enter email
    When User completes the required  Member details information and they are a clientele employee '<Title>', '<Names>', '<Surname>', '<IDnumber>', '<mobileNumber>'.
    And User enters '<PostalAddress>', '<PostalCode>', '<MonthlyIncome>','<Occupation>', '<education>'.
    And User completes '<FicaDeclaration1>' and '<FicaDeclaration2>' and clicks the continue button.
    And users confirms whether they have perks discount or not.
    And User adds a spouse over maximum age '<spouseTitle>','<spouseNames>','<spouseSurname>','<spouseGender>','<spouseDOB>'.
    And user clicks continue to beneficiary page
    And User adds first beneficiary '<Beneficiary1Title>', '<Beneficiary1Name>', '<Beneficiary1Surname>','<Beneficiary1Relationship>', '<Beneficiary1PercantageAllocation>'
    And user clicks save details
    And user enters payer details '<bankName>','<accountType>','<accountNumber>','<debitDate>','<Debicheck>'
    Then user should get a generated policy number with discounted premium '<coverAmount>'.

    Examples:
      | Title | Names | Surname | IDnumber      | mobileNumber | PostalAddress | PostalCode | MonthlyIncome     | Occupation          | education                            | FicaDeclaration1 | FicaDeclaration2 | Chidl1Names | Child1Surname | Child1Gende | Child1IsStudent | Child1Dob | Chidl2Names | Child2Surname | Child2Gende | Child2IsStudent | Child2Dob | Beneficiary1Title | Beneficiary1Name | Beneficiary1Surname | Beneficiary1Relationship | Beneficiary1PercantageAllocation | bankName                  | accountType     | accountNumber | debitDate | Debicheck | spouseTitle | spouseNames | spouseSurname | spouseDOB | spouseGender | Chidl3Names | Child3Surname | Child3Gende | Child3IsStudent | Child3Dob | coverAmount |
      | Mr    | KwaneleJ |    Mbedzi      | 9303221070088| 0832002639   | 12345 Test    | 1205       | R15,000 - R18,000 | Skilled agriculture | Post-graduate (Honours, Masters etc) | Yes              | Yes              | David       | Zulu          | Male        | No              |           | Mlandeli    | Zulu          | Male        | No              |           | Mr                | Mandla           | Zulu                | Brother                  | 100%                             | STANDARD BANK OF S.A. LTD | Savings Account | 1234          | 25        | No        | Dr          | David       | Dlamina       |           | Male         | Sizwe       | Mazibuko      | Male        | Yes             |           |  R433.00 per month           |
