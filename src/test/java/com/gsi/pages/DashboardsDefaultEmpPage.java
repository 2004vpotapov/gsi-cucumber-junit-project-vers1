package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardsDefaultEmpPage {
    public DashboardsDefaultEmpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="btnPopupclose")
    public WebElement closeBtn;

    @FindBy(xpath = "//a[.='View your Profile and Contact Information']")
    public WebElement viewYourProfile;
}
