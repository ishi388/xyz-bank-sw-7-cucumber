Feature: Manager Functionality Test
  Manager should be able to add customer and open account successfully

  @Regression
  Scenario: Manager should add customer successfully
    Given   Manager clicks on Bank Manager Login Tab
    When    Manager clicks on 'Add Customer' Tab
    And     Manager enters "Harry" first name of customer
    And     Manager enters "Potter" last name of customer
    And     Manager enters "HA90QA" postcode of customer
    And     Manager clicks on 'Add Customer' button
    Then    Manager has added customer successfully

  @Regression
  Scenario: Manager should open customer account successfully
    Given   Manager clicks on Bank Manager Login Tab
    When    Manager clicks on 'Open Account' Tab
    And     Manager select customer name "Harry" " Potter"
    And     Manager select currency "Pound"
    And     Manager clicks on 'process' button
    Then    Manager has opened customer account successfully
