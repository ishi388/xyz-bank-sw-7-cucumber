package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;

    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddCustomerTab(){

        clickOnElement(addCustomerTab);
        log.info("Click on add customer tab : "+addCustomerTab.toString());
    }

    public void clickOnOpenAccountTab(){

       clickOnElement(openAccountTab);
        log.info("Click on open account tab : "+openAccountTab.toString());
    }
}
