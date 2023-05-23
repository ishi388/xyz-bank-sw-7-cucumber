Feature: Customer deposit functionality
#  customer should be able to deposit money into account successfully

#  @Smoke @Regression
  Scenario: Customer can deposit money into account successfully
    Given   Customer clicks on 'Customer Login' Tab
    When    Customer search for name "Harry"" Potter"
    And     Customer clicks on 'Login' button
    And     Customer clicks on 'Deposit' Tab
    And     Customer enter amount "100"
    And     Customer clicks on 'Deposit' button
    Then    Customer has successfully deposited money into your account