package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {


    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//select[@id='userSelect']")
    WebElement searchCustomerText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement logInButton;

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void searchCustomer(String fName, String lName){

        selectByVisibleTextFromDropDown(searchCustomerText,fName.trim()+" "+lName.trim());
        log.info("Search customer name : "+searchCustomerText.toString());
    }

    public void clickOnLoginButton(){

        clickOnElement(logInButton);
        log.info("Click on Log in button : "+logInButton.toString());
    }

}
