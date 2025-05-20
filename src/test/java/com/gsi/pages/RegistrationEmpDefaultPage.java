package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpDefaultPage {
    public RegistrationEmpDefaultPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_Main_content_ucSignIn_txtUserName")
    public WebElement useNameInputBox;

    @FindBy(id="ctl00_Main_content_ucSignIn_ucPassword_txtPwd")
    public WebElement passwordInputBox;

    @FindBy(id="ctl00_Main_content_ucSignIn_ucPassword_txtPwdConfirm")
    public WebElement confirmPasswordInputBox;


    @FindBy(id="ctl00_Main_content_ucSignIn_ddlSecurityQuestion")
    public WebElement securityQuestionDropDown;

     @FindBy(id="ctl00_Main_content_ucSignIn_txtSecResponse")
    public WebElement securityQuestionResponse;

    @FindBy(id="ctl00_Main_content_ucCompanyID_txtCompany")
    public WebElement legalCompanyNameInputBox;

    @FindBy(id="ctl00_Main_content_ucCompanyID_txtDBA")
    public WebElement tradeNameInputBox;

    @FindBy(id="ctl00_Main_content_ucLocation_txtZip")
    public WebElement zipCode;
/*
    @FindBy(id="")
    public WebElement ;

    @FindBy(id="")
    public WebElement ;

 */

}
