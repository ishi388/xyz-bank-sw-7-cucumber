package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Bank Manager Login']" )
    WebElement bankManagerLogInTab;


    @CacheLookup
    @FindBy (xpath ="//button[normalize-space()='Customer Login']")
    WebElement customerLoginTab;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public void clickOnBankManagerLogInTab(){

        clickOnElement(bankManagerLogInTab);
        log.info("Clicking on bank manager log in tab : "+bankManagerLogInTab.toString());
    }


    public void clickOnCustomerLoginTab(){

        clickOnElement(customerLoginTab);
        log.info("Clicking on customer log in tab : "+customerLoginTab.toString());
    }

}
