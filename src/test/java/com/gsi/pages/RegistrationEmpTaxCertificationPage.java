package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpTaxCertificationPage {
    public RegistrationEmpTaxCertificationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="ctl00_Main_content_chkTaxAcknowledgement")
    public WebElement thisIsToCertify;

    @FindBy(id="ctl00_Main_content_ucGSISignature_ddlSigner")
    public WebElement personForSignIn;

    @FindBy(id="ctl00_Main_content_ucGSISignature_cnvSignature")
    public WebElement signInField;

    @FindBy(id="ctl00_Main_content_btnSave")
    public WebElement saveBtn;



}
