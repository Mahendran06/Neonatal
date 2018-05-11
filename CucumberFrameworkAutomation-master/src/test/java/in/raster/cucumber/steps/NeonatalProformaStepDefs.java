package in.raster.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import in.raster.cucumber.pages.NeonatalProformaPage;
import in.raster.cucumber.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NeonatalProformaStepDefs {

    private WebDriver driver = DriverFactory.getCurrentDriverInstance();
    private NeonatalProformaPage neonatalProforma = new NeonatalProformaPage(driver);

    /*Clicking on neonatal proforma tab*/
    @And("^click on neonate Basic entry form for all babies tab$")
    public void clickOnNeonateBasicEntryFormForAllBabiesTab() {
        neonatalProforma.clickOnNeonatalProformaTab();
    }

    /*Checking that neonatal proforma page is displaying or not*/
    @Then("^check that neonatal proforma page is displayed$")
    public void checkThatNeonatalProformaPageIsDisplayed() {
        neonatalProforma.checkNeonatalProformaPageIsDisplayed("Neonatal Proforma");
    }

    /*Clicking on create new button*/
    @And("^click on create new button in neonatal proforma page$")
    public void clickOnCreateNewButtonInNeonatalProformaPage() {
        neonatalProforma.clickOnCreateNewButton();
    }

    /*Clicking on select baby drop down menu*/
    @And("^click on select from list drop down menu to select the baby$")
    public void clickOnSelectFromListDropDownMenuToSelectTheBaby() {
        neonatalProforma.clickOnSelectBaby();
    }

    /*Clicking on baby name*/
    @And("^click on \"([^\"]*)\" from the listed select baby drop down$")
    public void clickOnFromTheListedSelectBabyDropDown(String babyName) {
        neonatalProforma.selectTheBaby(babyName);
    }

    /*Clicking on start button to enter the medical history of baby and mother*/
    @Then("^click on start button to enter medical details$")
    public void clickOnStartButtonToEnterMedicalDetails() {
        neonatalProforma.clickOnStartButton();
    }

    /*Check that baby details page is displayed*/
    @Then("^check that baby details tab is displayed$")
    public void checkThatBabyDetailsTabIsDisplayed() {
        neonatalProforma.checkBabyDetailsIsDisplayed("Baby Details");
    }

    /*Checking that system date is displayed*/
    @Then("^check that system date is displayed in date field$")
    public void checkThatSystemDateIsDisplayedInDateField() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); //hh:mm a
        Date date = new Date();
        String dt = dateFormat.format(date);
        neonatalProforma.checkDateIsVaild(dt);
    }

    @Then("^check that \"([^\"]*)\" baby name is displaying in baby name text field$")
    public void checkThatBabyNameIsDisplayingInBabyNameTextField(String nbabyName) {
        neonatalProforma.checkValidBabyNameIsDisplayed(nbabyName);
    }

    @Then("^check that \"([^\"]*)\" dob is displayed in DOB text field$")
    public void checkThatDobIsDisplayedInDOBTextField(String nDob) throws Throwable {
        neonatalProforma.checkBabysDobIsValid(nDob);
    }
}
