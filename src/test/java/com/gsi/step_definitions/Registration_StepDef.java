package com.gsi.step_definitions;

import com.gsi.pages.DefaultPage;
import com.gsi.pages.LoginIntro2Page;
import com.gsi.pages.RegistrationEmpRegistrationTypePage;
import com.gsi.pages.RegistrationEmpTaxRegistrationPage;
import com.gsi.utilities.BrowserUtils;
import com.gsi.utilities.ConfigurationReader;
import com.gsi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class Registration_StepDef {
    Actions actions = new Actions(Driver.getDriver());
    DefaultPage defaultPage = new DefaultPage();
    LoginIntro2Page loginIntro2Page = new LoginIntro2Page();
    RegistrationEmpRegistrationTypePage registrationEmpRegistrationTypePage = new RegistrationEmpRegistrationTypePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    RegistrationEmpTaxRegistrationPage registrationEmpTaxRegistrationPage = new RegistrationEmpTaxRegistrationPage();

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

    //Registration/Emp/RegistrationType page
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

    //Registration/emp/TaxRegistration page
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
}
