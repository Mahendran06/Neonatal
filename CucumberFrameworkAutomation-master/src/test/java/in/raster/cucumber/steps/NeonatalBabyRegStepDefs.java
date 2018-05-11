package in.raster.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import in.raster.cucumber.pages.NeonatalBabyRegPage;
import in.raster.cucumber.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class NeonatalBabyRegStepDefs {

    private WebDriver driver = DriverFactory.getCurrentDriverInstance();
    private NeonatalBabyRegPage babyReg = new NeonatalBabyRegPage(driver);

    /*Clicking Registration Tab*/
    @And("^click on baby registration tab$")
    public void click_on_baby_registration_tab() {
        babyReg.clickOnBabyRegistrationTab();
    }

    /*Clicking on Baby Registration*/
    @Then("^check that baby registration page is displayed$")
    public void check_that_baby_registration_page_is_displayed()  {
        babyReg.checkBabyRegistrationPageIsDisplayed("Baby Registration");
    }

    /*Clicking on Create new button*/
    @Then("^click on baby registration create new button$")
    public void click_on_baby_registration_create_new_button()  {
        babyReg.clickOnBabyRegCreateNewButton();
    }

    /*Selecting mother for the baby*/
    @Then("^click on select from list drop down in choose mother page$")
    public void click_on_select_from_list_drop_down_in_choose_mother_page()  {
        babyReg.clickOnSelectMother();
    }

    /*Clicking on start button*/
    @Then("^click on start button$")
    public void click_on_start_button()  {
        babyReg.clickOnStartButton();
    }

    /*Check whether create page is displayed*/
    @Then("^check that baby registration create page is displayed$")
    public void check_that_baby_registration_create_page_is_displayed()  {
        babyReg.checkBabyRegPageIsDisplayed("Create");
    }

    /*Enter baby MrNo*/
    @Then("^enter \"([^\"]*)\" in baby mrno text field$")
    public void enterInBabyMrnoTextField(String BMrNoValue)  {
        babyReg.enterBabyMrNo(BMrNoValue);
    }

    /*Enter Baby Name*/
    @And("^check that \"([^\"]*)\" baby name is displayed$")
    public void checkThatBabyNameIsDisplayed(String babyName)  {
        babyReg.checkOrEnterBabyName(babyName);
    }

    /*Select baby Date of Birth*/
    @And("^select baby date of birth$")
    public void selectBabyDateOfBirth()  {
        babyReg.selectBabyDob("2","2018");
    }

    /*Select baby time of birth*/
    @And("^select baby's time of birth \"([^\"]*)\" hrs \"([^\"]*)\"min \"([^\"]*)\" evening$")
    public void selectBabySTimeOfBirthHrsMinEvening(String babyHr, String babyMins, String BabyMorOrEve)  {
        babyReg.selectBabyTimeOfBirth(babyHr, babyMins, BabyMorOrEve);
    }

    /*Select multiple pregnancy yes or no*/
    @And("^select \"([^\"]*)\" in multiple pregnancy drop down menu$")
    public void selectInMultiplePregnancyDropDownMenu(String multiplePregnancy)  {
        babyReg.selectMothersPregnancyType(multiplePregnancy);
    }

    /*Select baby's sex*/
    @And("^select \"([^\"]*)\" from baby's sex drop down menu$")
    public void selectFromBabySSexDropDownMenu(String babySex)  {
        babyReg.selectBabySex(babySex);
    }

    /*Entering Mothers gestation in weeks and days*/
    @And("^enter \"([^\"]*)\" gestation in weeks and \"([^\"]*)\" gestation in days$")
    public void enterGestationInWeeksAndGestationInDays(String gesWeeks, String gesDays)  {
        babyReg.enterGestationWeeksAndDays(gesWeeks, gesDays);
    }

    /*Select the birth status of the baby Inborn or Outborn*/
    @And("^select \"([^\"]*)\" from birth status drop down menu$")
    public void selectFromBirthStatusDropDownMenu(String birthStatus)  {
        babyReg.selectBabyBirthStatus(birthStatus);
    }

    /*Entering birth weight of a baby*/
    @And("^enter \"([^\"]*)\" birth weight of a baby$")
    public void enterBirthWeightOfABaby(String btWeight)  {
        babyReg.enterBirthWeightOfBaby(btWeight);
    }

    /*Check that birth weight is displaying in kilograms*/
    @Then("^check that birth weight \"([^\"]*)\" is displaying in kilogram$")
    public void checkThatBirthWeightIsDisplayingInKilogram(String btWeight)  {
        Integer btKg = Integer.parseInt(btWeight);
        Integer S = btKg/1000;
        String kg = Integer.toString(S);
        babyReg.checkBirthWeigthInKg(kg);
    }

    /*selecting the blood group of the baby*/
    @And("^select \"([^\"]*)\" from baby's blood group drop down menu$")
    public void selectFromBabySBloodGroupDropDownMenu(String bloodGroup)  {
        babyReg.selectBabysBloodGroup(bloodGroup);
    }

    /*Selecting the Consultant name*/
    @And("^select \"([^\"]*)\" from neonatal consultant drop down menu$")
    public void selectFromNeonatalConsultantDropDownMenu(String consultantName)  {
        babyReg.selectNeonatalConsultant(consultantName);
    }

    /*Clicking on add more button if more than one consultant is required*/
    @Then("^click on Add more button if you want to add more consultant$")
    public void clickOnAddMoreButtonIfYouWantToAddMoreConsultant()  {
        babyReg.clickOnAddMoreButton();
    }

    /*Adding the consulting name*/
    @Then("^select \"([^\"]*)\" from neonatal consultant add more drop down menu$")
    public void selectFromNeonatalConsultantAddMoreDropDownMenu(String consultantName)  {
        babyReg.selectNeonatalConsultantName(consultantName);
    }

    /*Selecting the paediatric surgeon name*/
    @Then("^select \"([^\"]*)\" from Paediatric Surgeon drop down menu$")
    public void selectFromPaediatricSurgeonDropDownMenu(String paediatricSurgeon)  {
        babyReg.selectPaediatricSurgeonName(paediatricSurgeon);
    }
}
