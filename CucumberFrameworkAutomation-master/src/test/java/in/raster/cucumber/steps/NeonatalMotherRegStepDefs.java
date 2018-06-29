package in.raster.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import in.raster.cucumber.pages.NeonatalMotherRegPage;
import in.raster.cucumber.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class NeonatalMotherRegStepDefs {

    private WebDriver driver = DriverFactory.getCurrentDriverInstance();
    private NeonatalMotherRegPage motherReg = new NeonatalMotherRegPage(driver);

    @And("^click on \"([^\"]*)\" tab$")
    public void clickOnTab(String arg0) {
        motherReg.clickOnRegistrationTab();
    }

    /*Click on New Registration*/
    @Given("^click \"([^\"]*)\" tab$")
    public void clickTab() {
        motherReg.clickOnNewPatientRegistrationTab();
    }

    /*Mother Registration*/
    @And("^click on mother registration tab$")
    public void click_on_mother_registration_tab() {
        motherReg.clickOnMotherRegTab();
    }

    /*Mother Registration Page*/
    @And("^check that mother registration page is displayed$")
    public void check_that_mother_registration_page_is_displayed() {
        motherReg.checkMotherRegistrationPage("Registered Patients");
    }

    /*Create New Button*/
    @And("^click on create new button$")
    public void click_on_create_new_button() {
        motherReg.clickOnCreateNewButton();
    }

    /*Mother Registration Page*/
    @Then("^check that mother details page is displayed$")
    public void check_that_mother_details_page_is_displayed() {
        motherReg.checkMotherDetailsPage("Create");
    }

    /*MrNo text field*/
    @Then("^enter \"([^\"]*)\" in the MrNo textfield$")
    public void enter_in_the_MrNo_textfield() {
        motherReg.enterTheValuesInMrNoFields();
    }

    /*Mother's Title drop down*/
    @Then("^select \"([^\"]*)\" from mother details title dropdown menu$")
    public void select_from_mother_details_title_dropdown_menu(String motherTitle) {
        motherReg.selectTitle(motherTitle);
    }

    /*Mother's Initial text field*/
    @Then("^enter \"([^\"]*)\" in mother details initial text field$")
    public void enter_in_mother_details_initial_text_field(String motherInitial) {
        motherReg.enterMothersInitial(motherInitial);
    }

    /*Mother's First Name text field*/
    @Then("^enter \"([^\"]*)\" in mother details first name text field$")
    public void enter_in_mother_details_first_name_text_field(String motherFirstName) {
        motherReg.enterMothersFirstName(motherFirstName);
    }

    /*Mother's Last Name text field*/
    @Then("^enter \"([^\"]*)\" in mother details last name text field$")
    public void enter_in_mother_details_last_name_text_field(String motherLastName) {
        motherReg.enterMothersLastName(motherLastName);
    }

    /*Mother's DOB*/
    @Then("^select dob from mother details dob field date picker$")
    public void select_dob_from_mother_details_dob_field_date_picker() {

        motherReg.selectMothersDob("1", "1988");
    }

    /*Mother's Education Level drop down menu*/
    @Then("^select \"([^\"]*)\" from mother details mother's education level drop down menu$")
    public void select_from_mother_details_mother_s_education_level_drop_down_menu(String educationStatus) {
        motherReg.selectMothersEducationStatus(educationStatus);
    }

    /*Mother's Occupation type text field*/
    @Then("^enter \"([^\"]*)\" in mother details occupation type text field$")
    public void enter_in_mother_details_occupation_type_text_field(String Occupation) {
        motherReg.enterMothersOccupation(Occupation);
    }

    /*Mother's Occupation status drop down menu*/
    @Then("^select \"([^\"]*)\" from mother details current occupation status drop down menu$")
    public void select_from_mother_details_current_occupation_status_drop_down_menu(String occupationStatus) {
        motherReg.selectMothersOccupationStatus(occupationStatus);
    }

    @And("^enter \"([^\"]*)\" and \"([^\"]*)\" in mother details in contact fields$")
    public void enterAndInMotherDetailsInContactFields(String mobileNo, String landLine) {
        motherReg.enterMobileNo(mobileNo, landLine);
    }

    /*Mother's email text field*/
    @Then("^enter \"([^\"]*)\" in mother details email text field$")
    public void enter_in_mother_details_email_text_field(String motheremail) {
        motherReg.enterMothersEmail(motheremail);
    }

    /*Mother's language text field*/
    @Then("^enter \"([^\"]*)\" in mother details mother spoken languages$")
    public void enter_in_mother_details_mother_spoken_languages(String motherLanguage) {
        motherReg.enterMothersSpokenLanguage(motherLanguage);
    }

    /*Partner's Title drop down menu*/
    @Then("^select \"([^\"]*)\" from partner details title dropdown menu$")
    public void select_from_partner_details_title_dropdown_menu(String partnerTitle) {
        motherReg.selectPartnerTitle(partnerTitle);
    }

    /*Partner's Initial text field*/
    @Then("^enter \"([^\"]*)\" in partner details initial text field$")
    public void enter_in_partner_details_initial_text_field(String partnerInitial) {
        motherReg.enterPartnersInitial(partnerInitial);
    }

    /*Partner's First Name text field*/
    @Then("^enter \"([^\"]*)\" in partner details first name text field$")
    public void enter_in_partner_details_first_name_text_field(String partnerFirstName) {
        motherReg.enterPartnersFirstName(partnerFirstName);
    }

    /*Partner's Last Name text field*/
    @Then("^enter \"([^\"]*)\" in partner details last name text field$")
    public void enter_in_partner_details_last_name_text_field(String partnerLastName) {
        motherReg.enterPartnersLastName(partnerLastName);
    }

    /*Partner's DOB*/
    @Then("^select dob from partner details dob field date picker$")
    public void select_dob_from_partner_details_dob_field_date_picker() {

        motherReg.selectPartnersDob("7", "1986");
    }

    /*Partner's Education level drop down menu*/
    @Then("^select \"([^\"]*)\" from partner details father's education level drop down menu$")
    public void select_from_partner_details_father_s_education_level_drop_down_menu(String partnerEducationStatus) {
        motherReg.selectPartnersEducationStatus(partnerEducationStatus);
    }

    /*Partner's Occupation type text field*/
    @Then("^enter \"([^\"]*)\" in partner details occupation type text field$")
    public void enter_in_partner_details_occupation_type_text_field(String partnerOccupation) {
        motherReg.enterPartnersOccupation(partnerOccupation);
    }

    /*Partner's Occupation status drop down menu*/
    @Then("^select \"([^\"]*)\" from partner details current occupation status drop down menu$")
    public void select_from_partner_details_current_occupation_status_drop_down_menu(String partnerOccupationStatus) {
        motherReg.selectPartnersOccupationStatus(partnerOccupationStatus);
    }

    /*Same as mother's details Check box*/
    @Then("^click on Same as mother's contact details including languages check box$")
    public void click_on_Same_as_mother_s_contact_details_including_languages_check_box() {
        motherReg.clickOnSameContactCheckBox();
    }

    /*Mother's and Partner's same value or not*/
    @Then("^check that mother's and partner's contact details, email, language are same$")
    public void check_that_mother_s_and_partner_s_contact_details_email_language_are_same() {
    }

    /*Current address*/
    /*Address1 Field*/
    @Then("^enter \"([^\"]*)\" in address line(\\d+) doorno field$")
    public void enter_in_address_line_doorno_field(String doorNo) {
        motherReg.enterTheValueInAddress1Field(doorNo);
    }

    /*Address2 Field*/
    @Then("^enter \"([^\"]*)\" in adddress line(\\d+) streetname field$")
    public void enter_in_adddress_line_streetname_field(String streetName) {
        motherReg.enterTheValueInAddress2Field(streetName);
    }

    /*Address3 Field*/
    @Then("^enter \"([^\"]*)\" in address line(\\d+) city field$")
    public void enter_in_address_line_city_field(String city) {

        motherReg.enterTheValueInAddress3Field(city);
    }

    /*Address4 Field*/
    @Then("^enter \"([^\"]*)\" in address line(\\d+) pincode field$")
    public void enter_in_address_line_pincode_field(String pinCode) {
        motherReg.enterTheValueInaddress4field(pinCode);
    }

    /*Address5 Field*/
    @Then("^enter \"([^\"]*)\" in address line(\\d+) country field$")
    public void enter_in_address_line_country_field(String country) {
        motherReg.enterTheValueInaddress5field(country);
    }

    /*Mailing address*/
    @Then("^click on same as current address check box for mailing address$")
    public void click_on_same_as_current_address_check_box_for_mailing_address() {
        motherReg.clickOnSameAddressCheckBox();
    }

    /*Check current address and mailing address are same*/
    @Then("^check that same address is displaying$")
    public void check_that_same_address_is_displaying() {
        motherReg.checkSameAddressIsDisplaying();
    }

    @Then("^click on save button$")
    public void click_on_save_button() {
        motherReg.clickOnSaveAndCloseButton();
    }

}
