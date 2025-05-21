package com.gsi.pages;

import com.gsi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationEmpUnemploymentPage {
    public RegistrationEmpUnemploymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ctl00_Main_content_ucTaxProfile_ucOrganizationGroup_ddlOrgType")
    public WebElement typeOfOrganization;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_ucOrganizationGroup_ddlCoverage")
    public WebElement typeOfEmployment;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtFirstEmployee_dateInput")
    public WebElement dateFirstEmployed;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtNumberOfEmployees")
    public WebElement numberOfEmployeesAtRegistration;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtNumberOfEmployeesInClientState")
    public WebElement numberOfWokers;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtFirstEmployeeInClientStatePayDate_dateInput")
    public WebElement dateOfFirstPaid;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_rbReportingUIInAnotherState_1")
    public WebElement AreYouPresentlyReporting;


    @FindBy(id="ctl00_Main_content_ucTaxProfile_rbReportingInStateExceedInStateDutyThreshold_1")
    public WebElement willYouBeWorkingInNE;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtPayrollPersonFirstName")
    public WebElement nameOfPersonResponsibleFirstInputBox;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtPayrollPersonLastName")
    public WebElement nameOfPersonResponsibleSecondInputBox;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtPayrollPhone1")
    public WebElement phoneNumberOfPersonResponsibleFirst;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtPayrollPhone2")
    public WebElement phoneNumberOfPersonResponsibleSecond;

    @FindBy(id="ctl00_Main_content_ucTaxProfile_txtPayrollPhone3")
    public WebElement phoneNumberOfPersonResponsibleThird;

    @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_rbPreviousAccount_1")
    public WebElement haveYouPreviouslyHadAnAccount;

    @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_rbReorganizedRestructured_1")
    public WebElement haveYouReorganized;

    @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_rbFUTA_1")
    public WebElement futa;

    @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_rb20Week_1")
    public WebElement hasYourOrganizationEmployed;

    @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_rbWages_0")
    public WebElement didYouOrWillYouHaveTotal;

     @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_ddlQuarter")
    public WebElement earliastQuater;

     @FindBy(id="ctl00_Main_content_ucTaxQuestionnaire_txtYear")
    public WebElement enterYear;

    @FindBy(id="ctl00_Main_content_ucOwners_lnkAddOwner")
    public WebElement addOwnerLink;


}
