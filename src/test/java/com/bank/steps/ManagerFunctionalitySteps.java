package com.bank.steps;

import com.bank.pages.AddCustomerPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.HomePage;
import com.bank.pages.OpenAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManagerFunctionalitySteps {

    @Given("^Manager clicks on Bank Manager Login Tab$")
    public void managerClicksOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLogInTab();
    }

    @When("^Manager clicks on 'Add Customer' Tab$")
    public void managerClicksOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^Manager enters \"([^\"]*)\" first name of customer$")
    public void managerEntersFirstNameOfCustomer(String firstName)  {
        new AddCustomerPage().addCustomerFirstName(firstName);
    }

    @And("^Manager enters \"([^\"]*)\" last name of customer$")
    public void managerEntersLastNameOfCustomer(String lastName)  {
        new AddCustomerPage().addCustomerLastName(lastName);
    }

    @And("^Manager enters \"([^\"]*)\" postcode of customer$")
    public void managerEntersPostcodeOfCustomer(String postcode)  {
        new AddCustomerPage().addCustomerPostCode(postcode);
    }

    @And("^Manager clicks on 'Add Customer' button$")
    public void managerClicksOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^Manager has added customer successfully$")
    public void managerHasAddedCustomerSuccessfully() {
        new AddCustomerPage().verifyPopUpMessage();
        new AddCustomerPage().clickOnOkButtonOnPopUp();
    }

    @When("^Manager clicks on 'Open Account' Tab$")
    public void managerClicksOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }



    @And("^Manager select currency \"([^\"]*)\"$")
    public void managerSelectCurrency(String currency)  {
        new OpenAccountPage().selectCurrency(currency);

    }

    @And("^Manager clicks on 'process' button$")
    public void managerClicksOnProcessButton() throws InterruptedException {
        new OpenAccountPage().clickOnProcessButton();

    }

    @Then("^Manager has opened customer account successfully$")
    public void managerHasOpenedCustomerAccountSuccessfully() {
        new OpenAccountPage().verifyAccountCreatedSuccessfullyText();
        new OpenAccountPage().clickOnOkButtonPopUp();
    }

    @And("^Manager select customer name \"([^\"]*)\" \"([^\"]*)\"$")
    public void managerSelectCustomerName(String firstName, String lastName) {
        new OpenAccountPage().searchCustomer(firstName,lastName);
    }
}
