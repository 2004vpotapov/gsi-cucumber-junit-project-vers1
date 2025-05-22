package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UiTaxTaxContactAndWorksitePage {
    public UiTaxTaxContactAndWorksitePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="txtFirstName")
    public WebElement firstName;

    @FindBy(id="txtLastName")
    public WebElement lastName;

    @FindBy(id="txtTitle")
    public WebElement jobTitle;

    @FindBy(id="txtSec")
    public WebElement ssn;

    @FindBy(id="txtPhoneAreaCode")
    public WebElement phoneFirstBox;

    @FindBy(id="txtPhonePrefix")
    public WebElement phoneSecondBox;

    @FindBy(id="txtPhoneSuffix")
    public WebElement phoneThirdBox;

    @FindBy(id="txtEmail")
    public WebElement emailAddress;

    @FindBy(id="txtEmailConfirm")
    public WebElement confirmEmailAddress;

    @FindBy(id="ctl00_Main_content_btnSaveContinue")
    public WebElement saveAndContinueBtn;


    /*

    @FindBy(id="")
    public WebElement ;

     */
}
