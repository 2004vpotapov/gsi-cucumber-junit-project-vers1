package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpTaxRegistrationPage {
    public RegistrationEmpTaxRegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="ctl00_Main_content_ucTaxCompanyID_rblHaveEAN_1")
    public WebElement doYouHaveEANRadioBtn;

    @FindBy(id="ctl00_Main_content_ucTaxCompanyID_rblHaveFEIDQuestion_1")
    public WebElement doYouHaveFEINRadioBtn;

    @FindBy(xpath = "//select[@id='ddlReasonNoFEID']")
    public WebElement reasonDropDown;

    @FindBy(id="ctl00_Main_content_btnNext")
    public WebElement continueBtn;


}
