#Feature: Addtional Member Page
#  Scenario Add Spouse and Child.
#  Given: User on Additional Member Page
#    When User should be able to Add Spouse
#    When User should be able to Add Child
#    When User should be able to Add

  Feature: Main member with age next of 82
    Scenario: At  age 81
      Given : Main with Age above restrictions
      When : User captures age above restriction
      Then : User should get error message.
