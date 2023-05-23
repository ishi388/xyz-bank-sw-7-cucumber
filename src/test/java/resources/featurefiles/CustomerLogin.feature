Feature: Customer Login in functionality Test
  Customer should be able to Login to and Logout from account successfully

  @Sanity @Regression
  Scenario: Customer can login successfully with valid credentials
    Given   Customer clicks on 'Customer Login' Tab
    When    Customer search for name "Harry"" Potter"
    And     Customer clicks on 'Login' button
    Then    Customer "Harry" " Potter" can log in successfully with valid credentials

  @Sanity @Regression
  Scenario: Customer can logout successfully
    Given   Customer clicks on 'Customer Login' Tab
    When    Customer search for name "Harry"" Potter"
    And     Customer clicks on 'Login' button
    And     Customer "Harry" " Potter" can log in successfully with valid credentials
    And     Customer can locate 'logout' Tab
    And     Customer clicks on 'logout' Tab
    Then    Customer has logged out successfully
