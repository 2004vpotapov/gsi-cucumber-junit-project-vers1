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
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

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

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {

        Driver.getDriver().get("https://uat-app-vos31000000.geosolinc.com");
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
        username = faker.name().username();
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
        registrationEmpDefaultPage.legalCompanyNameInputBox.sendKeys(faker.company().name());
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
        registrationEmpDefaultPage.phoneFirstInputBox.sendKeys("123");
        registrationEmpDefaultPage.phoneSecondInputBox.sendKeys("123");
        registrationEmpDefaultPage.phoneThirdInputBox.sendKeys("1234");
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

}
