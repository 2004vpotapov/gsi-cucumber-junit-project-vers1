package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoldersEmpRegFolderPage {
    public FoldersEmpRegFolderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="ctl00_Main_content_ucCompanyID_lbl_txtCompany")
    public WebElement getLegalCompanyName;
}
