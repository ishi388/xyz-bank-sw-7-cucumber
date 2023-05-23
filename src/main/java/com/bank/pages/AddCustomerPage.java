package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    @CacheLookup
    @FindBy (xpath = "//button[@type='submit']")
    WebElement buttonAddCustomer;

    public AddCustomerPage() {

        PageFactory.initElements(driver, this);
    }

    public void addCustomerFirstName(String fName){

        sendTextToElement(firstName,fName);
        log.info("Add customer's first name : "+firstName.toString());

    }


    public void addCustomerLastName(String lName){


        sendTextToElement(lastName,lName);
        log.info("Add customer's last name : "+lastName.toString());

    }


    public void addCustomerPostCode(String pCode){


        sendTextToElement(postCode,pCode);
        log.info("Add customer's postcode : "+postCode.toString());
    }


    public void clickOnAddCustomerButton() {
        clickOnElement(buttonAddCustomer);
        log.info("Click on add customer button : "+buttonAddCustomer.toString());
    }

    public void verifyPopUpMessage(){

        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals("wrong popup message",expected.substring(0,20),actual.substring(0,20));
        log.info("Verify successful addition message : "+actual.substring(0,20));


    }

    public void clickOnOkButtonOnPopUp(){

        acceptAlert();
        log.info("Accept alert");
    }

}
