package com.gsi.pages;

import com.github.javafaker.Code;
import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpTaxGeneralInformationPage {
    public RegistrationEmpTaxGeneralInformationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_radPhysicalAddress_0")
    public WebElement physicalLocationNE;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_ucPhysicalAddress_txtAddress1")
    public WebElement address;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_ucPhysicalAddress_txtZip")
    public WebElement zipCode;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_radIndependentContractors_1")
    public WebElement independentContractors;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtDescribeBusinessActivity")
    public WebElement describeDetailBusinessActivity;
              //ctl00_Main_content_ucTaxGeneralInformation_txtDescribeBusinessActivity
    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtMainProducts")
    public WebElement provideGoods;
              //ctl00_Main_content_ucTaxGeneralInformation_txtMainProducts

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtCommonJobTitleList")
    public WebElement commonJobTitles;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtContactName")
    public WebElement name;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtContactPhone1")
    public WebElement phoneNumberFirstBox;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtContactPhone2")
    public WebElement phoneNumberSecondBox;

    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_txtContactPhone3")
    public WebElement phoneNumberFThirdBox;


    @FindBy(id="ctl00_Main_content_ucTaxGeneralInformation_radPrimaryPurposeOtherLocations_1")
    public WebElement primaryPurpose;

    @FindBy(id="ctl00_Main_content_btnNext")
    public WebElement nextBtn;




}
