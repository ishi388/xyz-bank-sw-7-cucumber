package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchText;

    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyText;

    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processButton;

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    AddCustomerPage addCustomerPage = new AddCustomerPage();


    public void searchCustomer(String fName, String lName) {

        selectByVisibleTextFromDropDown(searchText, fName.trim() + " " + lName.trim());
        log.info("Search customer name to open account : " + searchText.toString());
    }

    public void selectCurrency(String currency) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        selectByVisibleTextFromDropDown(currencyText, currency);
        log.info("Select currency : " + currencyText.toString());
    }

    public void clickOnProcessButton() throws InterruptedException {
       Thread.sleep(10);
        clickOnElement(processButton);
        //log.info("Clicking on process button : " + processButton.toString());
    }

    public void verifyAccountCreatedSuccessfullyText() {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expected = "Account created successfully with account Number :1016";
        String actual = getTextFromElement();
        Assert.assertTrue(actual.contains(expected));
        log.info("Verifying new account created message : "+actual.toString());
    }

    public void clickOnOkButtonPopUp() {
        acceptAlert();
        log.info("Accepting new account created successfully alert");
    }
}
