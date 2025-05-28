package com.gsi.step_definitions;

import com.github.javafaker.Faker;
import com.gsi.pages.*;
import com.gsi.utilities.BrowserUtils;
import com.gsi.utilities.ConfigurationReader;
import com.gsi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.Set;

public class Registration_StepDef {
    Actions actions = new Actions(Driver.getDriver());

    Faker faker = new Faker();
    String username;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    DefaultPage defaultPage = new DefaultPage();

    LoginIntro2Page loginIntro2Page = new LoginIntro2Page();

    RegistrationEmpRegistrationTypePage registrationEmpRegistrationTypePage = new RegistrationEmpRegistrationTypePage();

    RegistrationEmpTaxRegistrationPage registrationEmpTaxRegistrationPage = new RegistrationEmpTaxRegistrationPage();

    RegistrationEmpDefaultPage registrationEmpDefaultPage = new RegistrationEmpDefaultPage();

    String mainWindowHandle;

    RegistrationEmpTaxContactsPage registrationEmpTaxContactsPage = new RegistrationEmpTaxContactsPage();

    RegistrationEmpUnemploymentPage registrationEmpUnemploymentPage = new RegistrationEmpUnemploymentPage();

    UiTaxTaxContactAndWorksitePage uiTaxTaxContactAndWorksitePage = new UiTaxTaxContactAndWorksitePage();

    String emailAddressOwner;

    RegistrationEmpTaxGeneralInformationPage registrationEmpTaxGeneralInformationPage = new RegistrationEmpTaxGeneralInformationPage();

    RegistrationEmpTaxDocumentUploadPage registrationEmpTaxDocumentUploadPage = new RegistrationEmpTaxDocumentUploadPage();

    RegistrationEmpTaxCertificationPage registrationEmpTaxCertificationPage = new RegistrationEmpTaxCertificationPage();

    RegistrationEmpUIRegInstructionsPage registrationEmpUIRegInstructionsPage = new RegistrationEmpUIRegInstructionsPage();

    DashboardsDefaultEmpPage dashboardsDefaultEmpPage = new DashboardsDefaultEmpPage();

    String numberPhoneBox1;
    String numberPhoneBox2;
    String numberPhoneBox3;

    String  numberEMP;

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_uat_ne"));

    }
    //default page=============================================================================
    @When("user click to SignInRegister link")
    public void userClickToSignInRegisterLink() {
        actions.moveToElement(defaultPage.signInRegisterButton).click().perform();
    }

    //LoginIntro2 page==========================================================================
    @And("user click EmployersAndAgentsRegistration button")
    public void userClickEmployersAndAgentsRegistrationButton() {
        actions.moveToElement(loginIntro2Page.EmployersAndAgentsRegistrationButton).click().perform();
    }

    //Registration/Emp/RegistrationType page=====================================================
    @And("use click Close button on a Red banner")
    public void useClickCloseButtonOnARedBanner() {
        registrationEmpRegistrationTypePage.closeBtn.click();
    }

    @And("user click Direct Representative of your Organization checkBox")
    public void userClickDirectRepresentativeOfYourOrganizationCheckBox() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpRegistrationTypePage.directRepresentativeOfYourOrganizationRadioBtn));
       // BrowserUtils.waitFor(5);
        actions.moveToElement(registrationEmpRegistrationTypePage.directRepresentativeOfYourOrganizationRadioBtn).click().perform();

    }

    @And("user click Next button")
    public void userClickNextButton() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpRegistrationTypePage.nextBtn));
        BrowserUtils.waitFor(5);
        actions.moveToElement(registrationEmpRegistrationTypePage.nextBtn).pause(1000).click().perform();

    }
    @And("user click to Unemployment Tax and Benefit Services checkBox")
    public void userClickToUnemploymentTaxAndBenefitServicesCheckBox() {
        registrationEmpRegistrationTypePage.unemploymentTaxAndBenefitCheckBox.click();
    }
    @And("user click to Continue Registration button")
    public void userClickToContinueRegistrationButton() {
        actions.moveToElement(registrationEmpRegistrationTypePage.continueRegistrationBtn).click().perform();
    }

    //Registration/Emp/TaxRegistration page
    @And("user select Do you have a UI EAN radioButton")
    public void userSelectDoYouHaveAUIEANRadioButton() {
        registrationEmpTaxRegistrationPage.doYouHaveEANRadioBtn.click();
    }

    @And("user select Do you have a FEIN")
    public void userSelectDoYouHaveAFEIN() {
        actions.moveToElement( registrationEmpTaxRegistrationPage.doYouHaveFEINRadioBtn).perform();
        registrationEmpTaxRegistrationPage.doYouHaveFEINRadioBtn.click();

    }

    @And("user select Reason from dropDown")
    public void userSelectReasonFromDropDown() {
        actions.sendKeys(Keys.PAGE_DOWN);
       // BrowserUtils.waitFor(5);
        actions.moveToElement(registrationEmpTaxRegistrationPage.reasonDropDown).pause(2000).perform();
        Select select = new Select(registrationEmpTaxRegistrationPage.reasonDropDown);
        select.selectByVisibleText("Applied For");

    }

    @And("user click to Continue button")
    public void userClickToContinueButton() {
        actions.moveToElement(registrationEmpTaxRegistrationPage.continueBtn).click().perform();

    }

    //Registration/Emp/Default===================================================================
    @And("user enter User name")
    public void userEnterUserName() {
        username = "GSIUIVP_" + faker.number().numberBetween(100000,999999);
        registrationEmpDefaultPage.useNameInputBox.sendKeys(username);
    }

    @And("user enter Password")
    public void userEnterPassword() {
        registrationEmpDefaultPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("user enter Confirm Password")
    public void userEnterConfirmPassword() {
        registrationEmpDefaultPage.confirmPasswordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @And("Security Question")
    public void securityQuestion() {
        Select select = new Select(registrationEmpDefaultPage.securityQuestionDropDown);
        select.selectByVisibleText("What is your pet's name?");
    }

    @And("Security Question Response")
    public void securityQuestionResponse() {
        registrationEmpDefaultPage.securityQuestionResponse.sendKeys(faker.name().name());
    }

    @And("user enter Legal Company name")
    public void userEnterLegalCompanyName() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpDefaultPage.legalCompanyNameInputBox));
        //registrationEmpDefaultPage.legalCompanyNameInputBox.sendKeys(faker.company().name());
        registrationEmpDefaultPage.legalCompanyNameInputBox.sendKeys(username);

    }

    @And("user enter Trade Name")
    public void userEnterTradeName() {
        registrationEmpDefaultPage.tradeNameInputBox.sendKeys(faker.company().name());
    }

    @And("user enter ZipCode")
    public void userEnterZipCode() {
        registrationEmpDefaultPage.zipCode.sendKeys(ConfigurationReader.getProperty("zipCode"));
    }

    @And("user click at empty space")
    public void userClickAtEmptySpace() {
        actions.moveByOffset(0, 0).click().perform();
    }

    @And("user enter Street Address One")
    public void userEnterStreetAddressOne() {
        registrationEmpDefaultPage.streetAddressOne.sendKeys(faker.address().streetAddress());
    }

    @When("user enter Mailing Address One")
    public void user_enter_mailing_address_one() {
        registrationEmpDefaultPage.mailingAddressOne.sendKeys(faker.address().streetAddress());

    }
    @When("user enter Mailing ZipPostal")
    public void user_enter_mailing_zip_postal() {
        registrationEmpDefaultPage.mailingZipPostal.sendKeys(ConfigurationReader.getProperty("zipCode"));
    }

    @When("user enter Job Title")
    public void user_enter_job_title() {
        registrationEmpDefaultPage.jobTitle.sendKeys(faker.name().title());

    }
    @When("user enter Fist Name")
    public void user_enter_fist_name() {
        registrationEmpDefaultPage.firstName.sendKeys(faker.name().firstName());
    }
    @When("user enter Last Name")
    public void user_enter_last_name() {
        registrationEmpDefaultPage.lastName.sendKeys(faker.name().lastName());
    }

    @When("user enter Primary Phone")
    public void user_enter_primary_phone() {

        numberPhoneBox1= String.valueOf(faker.number().numberBetween(100,999));
        numberPhoneBox2= String.valueOf(faker.number().numberBetween(100,999));
        numberPhoneBox3= String.valueOf(faker.number().numberBetween(1000,9999));

        registrationEmpDefaultPage.phoneFirstInputBox.sendKeys(numberPhoneBox1);
        registrationEmpDefaultPage.phoneSecondInputBox.sendKeys(numberPhoneBox2);
        registrationEmpDefaultPage.phoneThirdInputBox.sendKeys(numberPhoneBox3);
    }
    @When("user enter Contact Email Address")
    public void user_enter_contact_email_address() {
        registrationEmpDefaultPage.contactEmailAddress.sendKeys(ConfigurationReader.getProperty("contact_Email_Address"));

    }
    @When("user enter Confirm Contact Email Address")
    public void user_enter_confirm_contact_email_address() {
        registrationEmpDefaultPage.confirmContactEmailAddress.sendKeys(ConfigurationReader.getProperty("contact_Email_Address"));
    }

    @When("user select a Method prefer to receive notification")
    public void user_select_a_methode_prefer_to_receive_notification() {
        Select select = new Select(registrationEmpDefaultPage.methodPreferToReceive);
        select.selectByVisibleText("Email (If Available)");

    }

    @And("user click to link Industry Title NAICS")
    public void userClickToLinkIndustryTitleNAICS() {
        BrowserUtils.waitFor(5);
        actions.moveToElement(registrationEmpDefaultPage.searchForIndustryCode).perform();
        BrowserUtils.waitFor(2);
        registrationEmpDefaultPage.searchForIndustryCode.click();
    }

    @And("user switch to drills-industry-inddrill window")
    public void user_Switch_To_Drills_Industry_Inddrill_Window() {
        mainWindowHandle = Driver.getDriver().getWindowHandle();
        System.out.println("mainWindowHandle = " + mainWindowHandle);
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String eachHandle : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachHandle);
            if(Driver.getDriver().getCurrentUrl().contains("inddrill")){
                break;
            }
        }
        String newURL = Driver.getDriver().getCurrentUrl();
        System.out.println("URL drills/industry/inddrill = " + newURL);

    }

    @And("user select link industries by Industry Code")
    public void user_Select_Link_Industries_By_Industry_Code() {
        registrationEmpDefaultPage.industriesByIndustryCodeLink.click();

    }

    @And("user enter industry code into inputBox and click Search button")
    public void userEnterIndustryCodeIntoInputBoxAndClickSearchButton() {
        registrationEmpDefaultPage.industryCodeInputBox.sendKeys(ConfigurationReader.getProperty("industry_title_NAICS"));
        registrationEmpDefaultPage.searchBtn.click();
    }

    @And("user click to link Industry code to confirm")
    public void userClickToLinkIndustryCodeToConfirm() {
        registrationEmpDefaultPage.industryCodeButtonToConfirm.click();
    }

    @And("user click Save and Continue button")
    public void userClickSaveAndContinueButton() {

        Driver.getDriver().switchTo().window(mainWindowHandle);//switch back to main window
        String lastURL = Driver.getDriver().getCurrentUrl();
        System.out.println("URL registration/emp/default = " + lastURL);
        actions.moveToElement(registrationEmpDefaultPage.saveAndContinueBtn).perform();
        registrationEmpDefaultPage.saveAndContinueBtn.click();
    }

    @And("use click to Use Primary CheckBox")
    public void useClickToUsePrimaryCheckBox() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpTaxContactsPage.usePrimaryCheckBox));
        actions.moveToElement(registrationEmpTaxContactsPage.usePrimaryCheckBox).perform();
        wait.until(ExpectedConditions.visibilityOf(registrationEmpTaxContactsPage.usePrimaryCheckBox));
        actions.moveToElement(registrationEmpTaxContactsPage.usePrimaryCheckBox).perform();
        registrationEmpTaxContactsPage.usePrimaryCheckBox.click();
    }

    @And("user click to Continue button for Identify Contacts Page")
    public void userClickToContinueButtonForIdentifyContactsPage() {
        actions.moveToElement(registrationEmpTaxContactsPage.continueButton).perform();
        registrationEmpTaxContactsPage.continueButton.click();
    }

    @And("user select Type of Organization")
    public void userSelectTypeOfOrganization() {
        Select select = new Select(registrationEmpUnemploymentPage.typeOfOrganization);
        select.selectByVisibleText("Individual - Sole Proprietorship");
    }

    @And("user select Type of Employment")
    public void userSelectTypeOfEmployment() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpUnemploymentPage.typeOfEmployment));
        Select select =new Select(registrationEmpUnemploymentPage.typeOfEmployment);
        select.selectByVisibleText("Regular (all regular business)");
    }


    @And("user enter Date first Employed")
    public void userEnterDateFirstEmployed() {
        registrationEmpUnemploymentPage.dateFirstEmployed.sendKeys("01/01/2023");
    }

    @And("user enter Number of Employees at Registration")
    public void userEnterNumberOfEmployeesAtRegistration() {
        numberEMP = String.valueOf(faker.number().numberBetween(3,100));
        registrationEmpUnemploymentPage.numberOfEmployeesAtRegistration.sendKeys(numberEMP);
    }

    @And("user enter Number of Wokers")
    public void userEnterNumberOfWokers() {
        registrationEmpUnemploymentPage.numberOfWokers.sendKeys(numberEMP);
    }

    @And("user enter Date of First Paid")
    public void userEnterDateOfFirstPaid() {
        registrationEmpUnemploymentPage.dateOfFirstPaid.sendKeys("1/15/2023");
    }

    @And("user select checkBox Are you presently reporting")
    public void userSelectCheckBoxAreYouPresentlyReporting() {
        actions.moveToElement(registrationEmpUnemploymentPage.AreYouPresentlyReporting).perform();
        registrationEmpUnemploymentPage.AreYouPresentlyReporting.click();
    }

    @And("user select checkBox Will you be working in NE")
    public void userSelectCheckBoxWillYouBeWorkingInNE() {
        actions.moveToElement(registrationEmpUnemploymentPage.willYouBeWorkingInNE).perform();
        registrationEmpUnemploymentPage.willYouBeWorkingInNE.click();

    }

    @And("user enter Name of Person Responsible")
    public void userEnterNameOfPersonResponsible() {
        actions.moveToElement(registrationEmpUnemploymentPage.nameOfPersonResponsibleFirstInputBox).perform();
        registrationEmpUnemploymentPage.nameOfPersonResponsibleFirstInputBox.sendKeys(faker.name().firstName());
        registrationEmpUnemploymentPage.nameOfPersonResponsibleSecondInputBox.sendKeys(faker.name().lastName());

    }

    @And("user enter Phone Number of Person Responsible")
    public void userEnterPhoneNumberOfPersonResponsible() {
        actions.moveToElement(registrationEmpUnemploymentPage.phoneNumberOfPersonResponsibleFirst).perform();
        registrationEmpUnemploymentPage.phoneNumberOfPersonResponsibleFirst.sendKeys(numberPhoneBox1);
        registrationEmpUnemploymentPage.phoneNumberOfPersonResponsibleSecond.sendKeys(numberPhoneBox2);
        registrationEmpUnemploymentPage.phoneNumberOfPersonResponsibleThird.sendKeys(numberPhoneBox3);
    }

    @And("user select Have you previously had an account")
    public void userSelectHaveYouPreviouslyHadAnAccount() {
        actions.moveToElement(registrationEmpUnemploymentPage.haveYouPreviouslyHadAnAccount).perform();
        registrationEmpUnemploymentPage.haveYouPreviouslyHadAnAccount.click();
    }

    @And("user select Have you reorganized")
    public void userSelectHaveYouReorganized() {
        actions.moveToElement(registrationEmpUnemploymentPage.haveYouReorganized).perform();
        registrationEmpUnemploymentPage.haveYouReorganized.click();
    }

    @And("use select Have you acquired another business")
    public void useSelectHaveYouAcquiredAnotherBusiness() {
        actions.moveToElement(registrationEmpUnemploymentPage.haveYouAcquiredAnotherBsn).perform();
        registrationEmpUnemploymentPage.haveYouAcquiredAnotherBsn.click();
    }

    @And("user select Are you liable under FUTA")
    public void userSelectAreYouLiableUnderFUTA() {
        actions.moveToElement(registrationEmpUnemploymentPage.futa).perform();
        registrationEmpUnemploymentPage.futa.click();
    }

    @And("user select Has your organization employed")
    public void userSelectHasYourOrganizationEmployed() {
        actions.moveToElement(registrationEmpUnemploymentPage.hasYourOrganizationEmployed).perform();
        registrationEmpUnemploymentPage.hasYourOrganizationEmployed.click();
    }

    @And("user select Did you or will you have total wages paid")
    public void userSelectDidYouOrWillYouHaveTotalWagesPaid() {
        actions.moveToElement(registrationEmpUnemploymentPage.didYouOrWillYouHaveTotal).perform();
        registrationEmpUnemploymentPage.didYouOrWillYouHaveTotal.click();
    }

    @And("user select Earliast Quater")
    public void userSelectEarliastQuater() {
        Select select=new Select(registrationEmpUnemploymentPage.earliastQuater);
        select.selectByVisibleText("First Quarter");
    }

    @And("user enter Year")
    public void userEnterYear() {
        actions.moveToElement(registrationEmpUnemploymentPage.enterYear).perform();
        registrationEmpUnemploymentPage.enterYear.sendKeys("2023");
    }

    @And("user click Add Owner link")
    public void userClickAddOwnerLink() {
        actions.moveToElement( registrationEmpUnemploymentPage.addOwnerLink).perform();
        registrationEmpUnemploymentPage.addOwnerLink.click();
    }

    @And("user enter First Name for Owner")
    public void userEnterFirstNameForOwner() {
        uiTaxTaxContactAndWorksitePage.firstName.sendKeys(faker.name().firstName());
    }

    @And("user enter Last Name for Owner")
    public void userEnterLastNameForOwner() {
        wait.until(ExpectedConditions.visibilityOf(uiTaxTaxContactAndWorksitePage.lastName));
        uiTaxTaxContactAndWorksitePage.lastName.sendKeys(faker.name().lastName());
    }

    @And("user enter Job Title for Owner")
    public void userEnterJobTitleForOwner() {
        uiTaxTaxContactAndWorksitePage.jobTitle.sendKeys(faker.job().title());
    }

    @And("user enter SSN for Owner")
    public void userEnterSSNForOwner() {
        actions.moveToElement(uiTaxTaxContactAndWorksitePage.ssn).perform();
        uiTaxTaxContactAndWorksitePage.ssn.sendKeys(faker.idNumber().ssnValid());
    }

    @And("user enter Phone for Owner")
    public void userEnterPhoneForOwner() {
        actions.moveToElement( uiTaxTaxContactAndWorksitePage.phoneFirstBox).perform();
        uiTaxTaxContactAndWorksitePage.phoneFirstBox.sendKeys(numberPhoneBox1);
        uiTaxTaxContactAndWorksitePage.phoneSecondBox.sendKeys(numberPhoneBox2);
        uiTaxTaxContactAndWorksitePage.phoneThirdBox.sendKeys(numberPhoneBox3);
    }

    @And("use enter Email Address for Owner")
    public void useEnterEmailAddressForOwner() {
        actions.moveToElement(uiTaxTaxContactAndWorksitePage.emailAddress);
        emailAddressOwner = faker.internet().emailAddress();
        uiTaxTaxContactAndWorksitePage.emailAddress.sendKeys(emailAddressOwner);
    }

    @And("user enter Confirm Email Address for Owner")
    public void userEnterConfirmEmailAddressForOwner() {
        actions.moveToElement(uiTaxTaxContactAndWorksitePage.confirmEmailAddress);
        uiTaxTaxContactAndWorksitePage.confirmEmailAddress.sendKeys(emailAddressOwner);
    }

    @And("user click Save and Continue button fo Owner")
    public void userClickSaveAndContinueButtonFoOwner() {
        actions.moveToElement(uiTaxTaxContactAndWorksitePage.saveAndContinueBtn).perform();
        wait.until(ExpectedConditions.elementToBeClickable(uiTaxTaxContactAndWorksitePage.saveAndContinueBtn));
        uiTaxTaxContactAndWorksitePage.saveAndContinueBtn.click();
    }

    @And("user click to Next Button")
    public void userClickToNextButton() {
        actions.moveToElement(registrationEmpUnemploymentPage.nextBtn).perform();
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpUnemploymentPage.nextBtn));
        registrationEmpUnemploymentPage.nextBtn.click();
    }


    @And("user select Do you have a physical location in Nebraska YES")
    public void userSelectDoYouHaveAPhysicalLocationInNebraskaYES() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpTaxGeneralInformationPage.physicalLocationNE));
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.physicalLocationNE).perform();
        registrationEmpTaxGeneralInformationPage.physicalLocationNE.click();
    }

    @And("user enter Address")
    public void userEnterAddress() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.address).perform();
        registrationEmpTaxGeneralInformationPage.address.sendKeys(ConfigurationReader.getProperty("address"));
    }

    @And("user enter Zip Code for General Employment Information")
    public void userEnterZipCodeForGeneralEmploymentInformation() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.zipCode).perform();
        registrationEmpTaxGeneralInformationPage.zipCode.sendKeys(ConfigurationReader.getProperty("zipCode"));
    }

    @And("user select Do you have independent contractors in your business")
    public void userSelectDoYouHaveIndependentContractorsInYourBusiness() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.independentContractors).perform();
        registrationEmpTaxGeneralInformationPage.independentContractors.click();
    }

    @And("user enter Describe, in detail, your business activity in NE")
    public void userEnterDescribeInDetailYourBusinessActivityInNE() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpTaxGeneralInformationPage.describeDetailBusinessActivity));
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.describeDetailBusinessActivity).perform();
        registrationEmpTaxGeneralInformationPage.describeDetailBusinessActivity.sendKeys("Test");
    }

    @And("user enter Provide the goods or the services provided")
    public void userEnterProvideTheGoodsOrTheServicesProvided() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpTaxGeneralInformationPage.provideGoods));
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.provideGoods).perform();
        registrationEmpTaxGeneralInformationPage.provideGoods.sendKeys("Test");
    }

    @And("user enter What are the most common job titles")
    public void userEnterWhatAreTheMostCommonJobTitles() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.commonJobTitles).perform();
        registrationEmpTaxGeneralInformationPage.commonJobTitles.sendKeys(faker.job().title());
    }

    @And("user enter Full Name")
    public void userEnterFullName() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.name).perform();
        registrationEmpTaxGeneralInformationPage.name.sendKeys(faker.name().fullName());
    }

    @And("user enter Phone Number who can provide specific information")
    public void userEnterPhoneNumberWhoCanProvideSpecificInformation() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.phoneNumberFirstBox).perform();
        registrationEmpTaxGeneralInformationPage.phoneNumberFirstBox.sendKeys(numberPhoneBox1);
        registrationEmpTaxGeneralInformationPage.phoneNumberSecondBox.sendKeys(numberPhoneBox2);
        registrationEmpTaxGeneralInformationPage.phoneNumberFThirdBox.sendKeys(numberPhoneBox3);
    }

    @And("user select Is the primary purpose of the employee")
    public void userSelectIsThePrimaryPurposeOfTheEmployee() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.primaryPurpose).perform();
        registrationEmpTaxGeneralInformationPage.primaryPurpose.click();
    }

    @And("user click Next Btn for General Employment Information Page")
    public void userClickNextBtnForGeneralEmploymentInformationPage() {
        actions.moveToElement(registrationEmpTaxGeneralInformationPage.nextBtn).perform();
        registrationEmpTaxGeneralInformationPage.nextBtn.click();
    }

    @And("user click Next Button for Unemployment Benefits Services Page")
    public void userClickNextButtonForUnemploymentBenefitsServicesPage() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpTaxDocumentUploadPage.nextBtn));
        actions.moveToElement(registrationEmpTaxDocumentUploadPage.nextBtn).perform();
        registrationEmpTaxDocumentUploadPage.nextBtn.click();
    }


    @And("user select This is to certify that all of the information")
    public void userSelectThisIsToCertifyThatAllOfTheInformation() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpTaxCertificationPage.thisIsToCertify));
        actions.moveToElement(registrationEmpTaxCertificationPage.thisIsToCertify).perform();
        registrationEmpTaxCertificationPage.thisIsToCertify.click();
    }

    @And("user select person for SignIn om dropDown")
    public void userSelectPersonForSignInOmDropDown() {
        Select select = new Select(registrationEmpTaxCertificationPage.personForSignIn);
        select.selectByIndex(1);
    }

    @And("user enter to signIn")
    public void userEnterToSignIn() {
        wait.until(ExpectedConditions.visibilityOf(registrationEmpTaxCertificationPage.signInField));
        actions.moveToElement(registrationEmpTaxCertificationPage.signInField).perform();
        registrationEmpTaxCertificationPage.signInField.click();

    }
    @And("user click to Save Btn for Tax Certification")
    public void userClickToSaveBtnForTaxCertification() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpTaxCertificationPage.saveBtn));
        actions.moveToElement(registrationEmpTaxCertificationPage.saveBtn).perform();
        registrationEmpTaxCertificationPage.saveBtn.click();
    }


    @And("user click Continue button for Registration Complete")
    public void userClickContinueButtonForRegistrationComplete() {
        wait.until(ExpectedConditions.elementToBeClickable(registrationEmpUIRegInstructionsPage.continueBtn));
        actions.moveToElement(registrationEmpUIRegInstructionsPage.continueBtn).perform();
        registrationEmpUIRegInstructionsPage.continueBtn.click();
    }

    @And("user click Close Btn")
    public void userClickCloseBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(dashboardsDefaultEmpPage.closeBtn));
        dashboardsDefaultEmpPage.closeBtn.click();
    }

    @And("user click to View your Profile")
    public void userClickToViewYourProfile() {
        wait.until(ExpectedConditions.elementToBeClickable(dashboardsDefaultEmpPage.viewYourProfile));
        dashboardsDefaultEmpPage.viewYourProfile.click();
    }
}
