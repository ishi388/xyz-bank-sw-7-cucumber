Feature: Customer withdrawl money functionality
  Customer should be able to withdraw money as required

  @Sanity @Regression
  Scenario: Customer can withdraw money successfully
    Given   Customer clicks on 'Customer Login' Tab
    When    Customer search for name "Harry"" Potter"
    And     Customer clicks on 'Login' button
    And     Customer clicks on 'Deposit' Tab
    And     Customer enter amount "100"
    And     Customer clicks on 'Deposit' button
    And     Customer clicks on 'Withdraw' Tab
    And     Customer enter withdrawl amount "50"
    And     Customer clicks on 'Withdraw' button
    Then    Customer has successfully withdrawn requirement amount
