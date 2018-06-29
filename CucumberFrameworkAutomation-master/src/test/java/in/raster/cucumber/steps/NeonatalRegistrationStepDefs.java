package in.raster.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import in.raster.cucumber.pages.NeonatalMotherRegPage;
import in.raster.cucumber.pages.NeonatalRegistrationPage;
import in.raster.cucumber.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;
import in.raster.cucumber.pages.NeonatalBabyRegPage;
import in.raster.cucumber.utilities.PropertyWriter;

public class NeonatalRegistrationStepDefs {

    private WebDriver driver = DriverFactory.getCurrentDriverInstance();
    private NeonatalRegistrationPage neonatalReg = new NeonatalRegistrationPage(driver);

    private NeonatalMotherRegPage neoMother = new NeonatalMotherRegPage(driver);

    private NeonatalBabyRegPage neoBaby = new NeonatalBabyRegPage(driver);



    /*Mother's MrNo*/
    @Then("^enter MrNo$")
    public void enterMrNo() throws Throwable {
        neoMother.enterTheValuesInMrNoFields();
    }

    /*Mother's Title*/
    @Then("^select mother title as \"([^\"]*)\"$")
    public void select_mother_title_as(String title) throws Throwable {
        neoMother.selectTitle(title);
    }

    /*Mother's Initial*/
    @Then("^enter mother initial as \"([^\"]*)\"$")
    public void enter_mother_initial_as(String initial) throws Throwable {
        neoMother.enterMothersInitial(initial);
    }

    /*Mother's First Name*/
    @Then("^enter mother name as \"([^\"]*)\"$")
    public void enter_mother_name_as(String mname) throws Throwable {
        neoMother.enterMothersFirstName(mname);
        neoBaby.setMotherName(mname);
    }

    /*Mother's Last Name*/
    @Then("^enter mother lastname as \"([^\"]*)\"$")
    public void enter_mother_lastname_as(String lname) throws Throwable {
        neoMother.enterMothersLastName(lname);
    }

    /*Selecting Mother's DOB*/
    @And("^select mothers dob as \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectMothersDobAsAnd(String date, String month, String year) throws Throwable {
        neoMother.selectMothersDob(month, year);
    }

    /*Mother's Education Level*/
    @Then("^select mothers education level as \"([^\"]*)\"$")
    public void select_mothers_education_level_as(String meducation) throws Throwable {
        neoMother.selectMothersEducationStatus(meducation);
    }

    /*Mother's Occupation*/
    @Then("^enter mothers occupation as \"([^\"]*)\"$")
    public void enter_mothers_occupation_as(String moccupation) throws Throwable {
        neoMother.enterMothersOccupation(moccupation);
    }

    /*Mother's Current Status*/
    @Then("^select mothers current occupation type as \"([^\"]*)\"$")
    public void select_mothers_current_occupation_type_as(String mcop) throws Throwable {
        neoMother.selectMothersOccupationStatus(mcop);
    }

    /*Mother's Mobile Number*/
    @Then("^enter mobile number and alternate mobile number as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_mobile_number_and_alternate_mobile_number_as_and(String mmobile, String amobile) throws Throwable {
        neoMother.enterMobileNo(mmobile, amobile);
    }

    /*Mother's Email*/
    @Then("^enter mothers email as \"([^\"]*)\"$")
    public void enter_mothers_email_as(String memail) throws Throwable {
        neoMother.enterMothersEmail(memail);
    }

    /*Mother's Spoken Language*/
    @Then("^enter mother spoken languages as \"([^\"]*)\"$")
    public void enter_mother_spoken_languages_as(String language) throws Throwable {
        neoMother.enterMothersSpokenLanguage(language);
    }

    /*Partner's Title*/
    @Then("^select partner title as \"([^\"]*)\"$")
    public void enter_partner_title_as(String ptitle) throws Throwable {
        neoMother.selectPartnerTitle(ptitle);
    }

    /*Partner's Initial*/
    @Then("^enter partner initial as \"([^\"]*)\"$")
    public void enter_partner_initial_as(String pinitial) throws Throwable {
        neoMother.enterPartnersInitial(pinitial);
    }

    /*Partner's First Name*/
    @Then("^enter partner name as \"([^\"]*)\"$")
    public void enter_partner_name_as(String fname) throws Throwable {
        neoMother.enterPartnersFirstName(fname);
    }

    /*Partner's Last Name*/
    @Then("^enter partner lastname as \"([^\"]*)\"$")
    public void enter_partner_lastname_as(String lname) throws Throwable {
        neoMother.enterPartnersLastName(lname);
    }

    /*Partner's DOB*/
    @And("^select partners dob as \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectPartnersDobAsAnd(String pDate, String pMonth, String pYear) throws Throwable {
        neoMother.selectPartnersDob(pMonth, pYear);
    }

    /*Partner's Education*/
    @Then("^select partners education level as \"([^\"]*)\"$")
    public void select_partners_education_level_as(String peducation) throws Throwable {
        neoMother.selectPartnersEducationStatus(peducation);
    }

    /*Partner's Occupation type*/
    @Then("^select partners current occupation type as \"([^\"]*)\"$")
    public void select_partners_current_occupation_type_as(String status) throws Throwable {
        neoMother.enterPartnersOccupation(status);
    }

    /*Partner's Occupation Status*/
    @Then("^enter partners occupation as \"([^\"]*)\"$")
    public void enter_partners_occupation_as(String poccupation) throws Throwable {
        neoMother.selectPartnersOccupationStatus(poccupation);
    }

    /*Address Line 1*/
    @Then("^enter address line(\\d+) doorno as \"([^\"]*)\"$")
    public void enter_address_line_doorno_as(int arg1, String doorno) throws Throwable {
        neoMother.enterTheValueInAddress1Field(doorno);
    }

    /*Address Line 2*/
    @Then("^enter address line(\\d+) street name as \"([^\"]*)\"$")
    public void enter_address_line_street_name_as(int arg1, String streetName) throws Throwable {
        neoMother.enterTheValueInAddress2Field(streetName);
    }

    /*Address Line 3*/
    @Then("^enter address line(\\d+) city as \"([^\"]*)\"$")
    public void enter_address_line_city_as(int arg1, String city) throws Throwable {
        neoMother.enterTheValueInAddress3Field(city);
    }

    /*Address Line 4*/
    @Then("^enter address line(\\d+) pincode as \"([^\"]*)\"$")
    public void enter_address_line_pincode_as(int arg1, String pinCode) throws Throwable {
        neoMother.enterTheValueInaddress4field(pinCode);
    }

    /*Address line 5*/
    @Then("^enter address line(\\d+) country as \"([^\"]*)\"$")
    public void enter_address_line_country_as(int arg1, String country) throws Throwable {
        neoMother.enterTheValueInaddress5field(country);
    }

    /*Save and Close*/
    @Then("^click on save and close button$")
    public void click_on_save_and_close_button() throws Throwable {
        neoMother.clickOnSaveAndCloseButton();
    }

    /*Checking Mother is registered or not*/
    @Then("^check that \"([^\"]*)\" is saved and displaying$")
    public void checkThatIsSavedAndDisplaying(String searchName) throws Throwable {
        neoMother.enterAValueInSearchBox(searchName);
        neoMother.checkMotherIsRegistered(searchName);
    }

    /*Redirecting to baby registration*/
    @And("^click on register baby button$")
    public void clickOnRegisterBabyButton() throws Throwable {
        neonatalReg.clickOnRegisterBabyButton();
    }

    /*Enter Baby's MrNo*/
    @Then("^enter baby MrNo as \"([^\"]*)\"$")
    public void enterBabyMrNoAs(String bMrNo) throws Throwable {
        neoBaby.enterBabyMrNo(bMrNo);
    }

    /*Selecting Baby's DOB*/
    @Then("^select babys dob as \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectBabysDobAsAnd(String Bdate, String Bmonth, String Byear) throws Throwable {
        neoBaby.selectBabyDob(Bmonth, Byear);
    }

    /*Selecting Baby's TOB*/
    @And("^select babys time of birth as \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void selectBabysTimeOfBirthAsAnd(String mins, String secs, String day) throws Throwable {
        neoBaby.selectBabyTimeOfBirth(mins, secs, day);
    }

    /*Selecting Multiple Pregnancy Yes or No*/
    @And("^select muliple pregnancy type as \"([^\"]*)\"$")
    public void selectMuliplePregnancyTypeAs(String multiplePregnancy) throws Throwable {
        neoBaby.selectMothersPregnancyType(multiplePregnancy);
    }

    /*Selecting Sex of the baby*/
    @And("^select baby sex as \"([^\"]*)\"$")
    public void selectBabySexAs(String sex) throws Throwable {
        neoBaby.selectBabySex(sex);
    }

    /*Entering Gestation Weeks and Days*/
    @And("^enter gestation of baby as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterGestationOfBabyAsAnd(String gWeeks, String gDays) throws Throwable {
        neoBaby.enterGestationWeeksAndDays(gWeeks, gDays);
    }

    @And("^enter birth status of baby as \"([^\"]*)\"$")
    public void enterBirthStatusOfBabyAs(String birthStatus) throws Throwable {
        neoBaby.selectBabyBirthStatus(birthStatus);
    }

    @And("^enter birth weight of baby as \"([^\"]*)\"$")
    public void enterBirthWeightOfBabyAs(String bWeight) throws Throwable {
        neoBaby.enterBirthWeightOfBaby(bWeight);
    }

    @And("^select babys blood group as \"([^\"]*)\"$")
    public void selectBabysBloodGroupAs(String bloodGroup) throws Throwable {
        neoBaby.selectBabysBloodGroup(bloodGroup);
    }

    @And("^select consultant as \"([^\"]*)\"$")
    public void selectConsultantAs(String neonatalConsultant) throws Throwable {
        neoBaby.selectNeonatalConsultant(neonatalConsultant);
    }

}

