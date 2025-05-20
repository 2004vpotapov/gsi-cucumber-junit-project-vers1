package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpDefaultPage {
    public RegistrationEmpDefaultPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_Main_content_ucSignIn_txtUserName")
    public WebElement useNameInputBox;

    @FindBy(id = "ctl00_Main_content_ucSignIn_ucPassword_txtPwd")
    public WebElement passwordInputBox;

    @FindBy(id = "ctl00_Main_content_ucSignIn_ucPassword_txtPwdConfirm")
    public WebElement confirmPasswordInputBox;


    @FindBy(id = "ctl00_Main_content_ucSignIn_ddlSecurityQuestion")
    public WebElement securityQuestionDropDown;

    @FindBy(id = "ctl00_Main_content_ucSignIn_txtSecResponse")
    public WebElement securityQuestionResponse;

    @FindBy(id = "ctl00_Main_content_ucCompanyID_txtCompany")
    public WebElement legalCompanyNameInputBox;

    @FindBy(id = "ctl00_Main_content_ucCompanyID_txtDBA")
    public WebElement tradeNameInputBox;

    @FindBy(id = "ctl00_Main_content_ucLocation_txtZip")
    public WebElement zipCode;

    @FindBy(id = "ctl00_Main_content_ucLocation_txtAddress1")
    public WebElement streetAddressOne;


    @FindBy(id = "ctl00_Main_content_ucMailing_txtMailAddress1")
    public WebElement mailingAddressOne;

    @FindBy(id = "ctl00_Main_content_ucMailing_txtMailZip")
    public WebElement mailingZipPostal;


    @FindBy(id = "ctl00_Main_content_ucContact_txtTitle")
    public WebElement jobTitle;


    @FindBy(id = "ctl00_Main_content_ucContact_txtFirstName")
    public WebElement firstName;


    @FindBy(id = "ctl00_Main_content_ucContact_txtLastName")
    public WebElement lastName;


    @FindBy(id = "ctl00_Main_content_ucContact_txtPrimePhone1")
    public WebElement phoneFirstInputBox;

    @FindBy(id = "ctl00_Main_content_ucContact_txtPrimePhone2")
    public WebElement phoneSecondInputBox;

    @FindBy(id = "ctl00_Main_content_ucContact_txtPrimePhone3")
    public WebElement phoneThirdInputBox;


    @FindBy(id = "ctl00_Main_content_ucContact_txtEmail")
    public WebElement contactEmailAddress;

    @FindBy(id = "ctl00_Main_content_ucContact_txtConfirmEmail")
    public WebElement confirmContactEmailAddress;


    @FindBy(id="ctl00_Main_content_ucContact_ddlPreferNotification")
    public WebElement methodPreferToReceive;


/*
    @FindBy(id="")
    public WebElement ;

 */

}
