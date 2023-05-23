package com.bank.steps;

import com.bank.pages.AccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CustomerDepositStep {

    @And("^Customer clicks on 'Deposit' Tab$")
    public void customerClicksOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @And("^Customer enter amount \"([^\"]*)\"$")
    public void customerEnterAmount(String amount) {
        new AccountPage().enterAmount("100");
    }

    @And("^Customer clicks on 'Deposit' button$")
    public void customerClicksOnDepositButton() {
        new AccountPage().clickOnDepositButton();
    }

    @Then("^Customer has successfully deposited money into your account$")
    public void customerHasSuccessfullyDepositedMoneyIntoYourAccount() {
        new AccountPage().verifyDepositSuccessFullMessage();
    }
}
