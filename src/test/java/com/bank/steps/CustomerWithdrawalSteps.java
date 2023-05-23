package com.bank.steps;

import com.bank.pages.AccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CustomerWithdrawalSteps {

    @And("^Customer clicks on 'Withdraw' Tab$")
    public void customerClicksOnWithdrawTab() {
        new AccountPage().clickOnWithdrawlTab();
    }

    @And("^Customer enter withdrawl amount \"([^\"]*)\"$")
    public void customerEnterWithdrawlAmount(String withdrawlAmount) throws InterruptedException {
        Thread.sleep(10);
        new AccountPage().enterWithdrawlAmount("50");
    }

    @And("^Customer clicks on 'Withdraw' button$")
    public void customerClicksOnWithdrawButton() throws InterruptedException {
        Thread.sleep(10);
        new AccountPage().clickOnWithdrawlButton();
    }

    @Then("^Customer has successfully withdrawn requirement amount$")
    public void customerHasSuccessfullyWithdrawnRequirementAmount() throws InterruptedException {
        Thread.sleep(10);
        new AccountPage().verifyTransactionSuccessfulMessage();
    }
}
