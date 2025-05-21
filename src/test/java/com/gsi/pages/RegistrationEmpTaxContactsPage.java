package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpTaxContactsPage {
    public RegistrationEmpTaxContactsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_Main_content_ucTaxContacts_grdContactChoices_ctl01_chkAllPrimary")
    public WebElement  usePrimaryCheckBox;


    @FindBy(id="ctl00_Main_content_btnContinueCheckBox")
    public  WebElement continueButton ;

}
