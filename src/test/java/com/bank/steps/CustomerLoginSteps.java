package com.bank.steps;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomersPage;
import com.bank.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerLoginSteps {

    @Given("^Customer clicks on 'Customer Login' Tab$")
    public void customerClicksOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @When("^Customer search for name \"([^\"]*)\"\"([^\"]*)\"$")
    public void customerSearchForName(String firstName, String lastName)  {
        new CustomerLoginPage().searchCustomer(firstName, lastName);
    }

    @And("^Customer clicks on 'Login' button$")
    public void customerClicksOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }


    @And("^Customer can locate 'logout' Tab$")
    public void customerCanLocateLogoutTab() {
        new CustomersPage().verifyLogOutButtonDisplayed();
    }

    @And("^Customer clicks on 'logout' Tab$")
    public void customerClicksOnLogoutTab() {
        new CustomersPage().clickOnLogOutButton();
    }

    @Then("^Customer has logged out successfully$")
    public void customerHasLoggedOutSuccessfully() {
        new CustomersPage().verifySuccessfulLogout();
    }

    @Then("^Customer \"([^\"]*)\" \"([^\"]*)\" can log in successfully with valid credentials$")
    public void customerCanLogInSuccessfullyWithValidCredentials(String firstName, String lastName) {
        new CustomersPage().verifyYourNameTextDisplayed(firstName,lastName);
    }
}
