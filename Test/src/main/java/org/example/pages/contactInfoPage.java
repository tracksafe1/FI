package org.example.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactInfoPage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public contactInfoPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath="//input[@id='contactEmail']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath="//input[@id='contactFirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath="//input[@id='contactLastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath="//input[@id='contactPhonenumber']")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath="//input[@id='contactCompany']")
    WebElement companyName;
    @CacheLookup
    @FindBy(xpath="//select[@id='contactCountry']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath="//select[@id='contactIndustry']")
    WebElement industry;
    @CacheLookup
    @FindBy(xpath="//div[@class='form__group']/button")
    WebElement submit;
    public void enterEmail(String BusinessEmailAddress){
        log.info("Enter BusinessEmailAddress" + BusinessEmailAddress.toString());
        sendTextToElement(email,BusinessEmailAddress);
    }
    public void enterFirstName(String FirstName ){
        log.info("Enter FirstName" + FirstName.toString());
      sendTextToElement(firstName,FirstName);
    }
    public void enterLastName(String LastName ){
        sendTextToElement(lastName,LastName);
        log.info("Enter LastName" );
    }
    public void enterPhoneNumber(String PhoneNumber ){
        sendTextToElement(phoneNumber,PhoneNumber);
        log.info("Enter PhoneNumber" );
    }
    public void enterCompanyName(String CompanyName ){
        sendTextToElement(companyName,CompanyName);
        log.info("Enter CompanyName" );
    }
    public void enterCountry(String Country){
        selectByVisibleTextFromDropDown(country,Country);
        log.info("Select Country" );
    }
    public void enterIndustry(String Industry ){
       selectByVisibleTextFromDropDown(industry,Industry);
        log.info("Select Industry" );
    }
    public void clickOnSubmit(){
        clickOnElement(submit);
        log.info("click submit" );
    }
}
