package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpRegistrationTypePage {
    public RegistrationEmpRegistrationTypePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ctl00_btnDismissButton']")
    public WebElement closeBtn;


    @FindBy(id="ctl00_Main_content_rbDirectRep")
    public WebElement directRepresentativeOfYourOrganizationRadioBtn;


    @FindBy(id="ctl00_Main_content_btnNext")
     public WebElement nextBtn;

    @FindBy(id = "ctl00_Main_content_cbxUITaxAndBenefits")
    public WebElement unemploymentTaxAndBenefitCheckBox;

    @FindBy(id="ctl00_Main_content_btnContinue")
    public WebElement continueRegistrationBtn;


}
