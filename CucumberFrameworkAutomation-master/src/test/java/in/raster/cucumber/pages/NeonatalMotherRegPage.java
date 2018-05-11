package in.raster.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.raster.cucumber.utilities.CommonMethod;

import java.util.Random;

public class NeonatalMotherRegPage {

    private WebDriver driver;

    public NeonatalMotherRegPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*Xpath*/
    /*Xpath for clicking New Registration*/
    @FindBy(xpath = "//a[contains(text(), 'NEW PATIENT')]")
    private WebElement NewRegistration;

    /*Xpath for clicking Registered Patients*/
    @FindBy(xpath = "//a[@href = 'javascript:void(0);' and contains(text(), 'REGISTERED PATIENTS')]")
    private WebElement RegistrationElement;

    /*Xpath for clicking Mother Registration*/
    @FindBy(xpath = "//a[contains(text(),'Mothers')]")
    private WebElement motherRegistrationElement;

    /*Xpath for finding mother registration name in mother's page*/
    @FindBy(xpath = "//div[@class='widget-header']//h4")
    private WebElement motherRegText;

    /*Xpath for Clicking on create new button to register parent details*/
    @FindBy(xpath = "//span[contains(text(), 'Create New')]")
    private WebElement createNewButton;

    /*Xpath for finding a mother's create page*/
    @FindBy(xpath = "//a[contains(text(), 'Create')]")
    private WebElement motherRegistrationPage;

    /*MOTHER DETAILS*/
    /*Xpath for entering MrNo of Mother in MrNo textbox*/
    @FindBy(xpath = "//input[@id = 'MMrNo']")
    private WebElement mrNo;

    /*Xpath for selecting mohter title from drop down box*/
    @FindBy(xpath = "//Select[@id = 'MotherTitle']")
    private WebElement motherTitleDropDown;

    /*Xpath for entering mother intial in mother initial textbox*/
    @FindBy(id = "MotherInitial")
    private WebElement motherInitialTextBox;

    /*Xpath for entering mother name in mother name textbox*/
    @FindBy(id = "MotherName")
    private WebElement motherName;

    /*Xpath for entering mother last name in last name textbox*/
    @FindBy(id = "MotherLastName")
    private WebElement motherLastName;

    /*Xpath for selecting date of birth from date picker*/
    @FindBy(id = "MotherDOB")
    private WebElement motherDatePicker;

    /*Xpath for selecting month in date picker*/
    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    private WebElement selectMonth;

    /*Xpath for selecting year in date of birth*/
    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    private WebElement selectYear;

    /*Xpath for selecting date in date picker*/
    @FindBy(xpath = "//a[@href='#' and contains(text(), '24')]")
    private WebElement selectDate;

    /*Xpath for selecting education status from drop down menu*/
    @FindBy(id = "education_status")
    private WebElement status;

    /*Xpath for entering mother occupation in mother occupation textbox*/
    @FindBy(id = "Occupation")
    private WebElement motherOccupation;

    /*Xpath for selecting mother occupation from drop down menu*/
    @FindBy(id = "occupation_status")
    private WebElement motherOccupationStatus;

    /*Xpath for entering mothers mobile number in contact1 textbox*/
    @FindBy(id = "Mobile")
    private WebElement motherMobileNo;

    /*Xpath for entering mothers 2nd mobile number or landline number in contact2 textbox*/
    @FindBy(id = "LandLine")
    private WebElement landLineNo;

    /*Xpath for entering mothers email id*/
    @FindBy(id = "MotherEmail")
    private WebElement email;

    /*Xpath for entering mothers spoken languages*/
    @FindBy(id = "MotherSpokenLanguages")
    private WebElement motherLanguage;

    /*PARTNER DETAILS*/
    /*Xpath for selecting partner title from drop down menu*/
    @FindBy(id = "PartnerTitle")
    private WebElement partnerTitle;

    /*Xpath for entering partner intial*/
    @FindBy(id = "PartnerInitial")
    private WebElement partnerInitial;

    /*Xpath for entering partner firstname*/
    @FindBy(id = "PartnerName")
    private WebElement partnerFirstName;

    /*Xpath for entering partner lastname*/
    @FindBy(id = "PartnerLastName")
    private WebElement partnerLastName;

    /*Xpath for selecting date of birth of partner from date picker*/
    @FindBy(id = "PartnerDOB")
    private WebElement partnerDOB;

    /*Xpath for selecting partner education status from drop down menu*/
    @FindBy(id = "partner_education_status")
    private WebElement partnerEducationStatus;

    /*Xpath for entering partner occupation in partner details occupation textbox*/
    @FindBy(id = "PartnerOccupation")
    private WebElement partnerOccupation;

    /*Xpath for selecting partner occupation from drop down menu */
    @FindBy(id = "partner_occupation_status")
    private WebElement partnerOccupationStatus;

    /*Xpath for entering partners mobile number contact1 textbox*/
    @FindBy(id = "PartnerContact")
    private WebElement partnerMobileNo;

    /*Xpath for entering partners 2nd mobile number or landline number in contact2 textbox*/
    @FindBy(id = "PartnerMobile")
    private WebElement partnerLandLine;

    /*Xpath for entering Partners email id*/
    @FindBy(id = "Email")
    private WebElement partnerEmail;

    /*Xpath for entering Partners Spoken Languuage*/
    @FindBy(id = "FatherSpokenLanguages")
    private WebElement partnerLanguage;

    /*Xpath for clicking on same contact check box*/
    @FindBy(xpath = "//input[@name='samecontacts' and @type='checkbox']")
    private WebElement checkBox;

    /*Xpath for entering door no in address1 text box*/
    @FindBy(id = "Address1")
    private WebElement address1;

    /*Xpath for entering street name in address2 textbox*/
    @FindBy(id = "Address2")
    private WebElement address2;

    /*Xpath for entering city in address3 textbox*/
    @FindBy(id = "Address3")
    private WebElement city;

    /*Xpath for entering pincode in address4 textbox*/
    @FindBy(id = "Address4")
    private WebElement pinCode;

    /*Xpath for entering country in address5 textbox*/
    @FindBy(id = "Address5")
    private WebElement country;

    /*Xpath for clicking on the same address check box*/
    @FindBy(xpath = "//input[@name='sameasmailaddress' and @type='checkbox']")
    private WebElement sameAddressCheckBox;

    /*Xpath for checking whether Mailing Address and Current Address are same*/
    @FindBy(id = "FatherAddress1")
    private WebElement mailAddress1;

    @FindBy(id = "FatherAddress2")
    private WebElement mailAddress2;

    @FindBy(id = "City")
    private WebElement mailAddress3;

    @FindBy(id = "Postcode")
    private WebElement mailAddress4;

    @FindBy(id = "Country")
    private WebElement mailAddress5;

    /*Xpath for click on save and close button to save the entered values*/
    @FindBy(xpath = "//span[contains(text(), 'Save & Close')]")
    private WebElement saveAndClose;

    /*Xpath for entering value in Search Box*/
    @FindBy(xpath = "//input[@name = 'search_txt']")
    private WebElement searchBox;

    /*Xpath for clicking on Search Box*/
    @FindBy(xpath = "//i[@class = 'glyphicon glyphicon-search']")
    private WebElement searchClick;

    /*Xpath for checking whether Mother's details are saved*/
    @FindBy(xpath = "//td[3]")
    private WebElement mrnoSearch;


    /*Performing Actions*/
    /*Clicking on Create New Registration Element*/
    public void clickOnNewPatientRegistrationTab(){
        CommonMethod.clickOnElement(NewRegistration);
    }


    /*Clicking on Registration Tab*/
    public void clickOnRegistrationTab(){
        CommonMethod.clickOnElement(RegistrationElement);
    }

    /*Clicking on mother registration*/
    public void clickOnMotherRegTab(){
        CommonMethod.clickOnElement(motherRegistrationElement);
    }

    /*Checking whether mother registration page is displayed*/
    public void checkMotherRegistrationPage(String actualValue){
        Assert.assertEquals("Mother Registration Page is not displaying", motherRegText.getText(), actualValue);
    }

    /*Clicking on Create New Button*/
    public void clickOnCreateNewButton(){
        CommonMethod.clickOnElement(createNewButton);
    }

    /*Checking Create new page is displayed or not*/
    public void checkMotherDetailsPage(String actualValue){
        Assert.assertTrue("Mother Registration create page is not displaying",motherRegistrationPage.getText().equals(actualValue));
    }

    /*Entering MrNo*/
    public void enterTheValuesInMrNoFields(String textBoxValue){
        CommonMethod.clearAndEnterAValueInATextBox(mrNo, textBoxValue);
    }

    /*Selecting Mother Title*/
    public void selectTitle(String Value){
        CommonMethod.clickOndropDown(motherTitleDropDown, Value);
    }

    /*Select the Partner's title*/
    public void selectPartnerTitle(String partnerValue){
        CommonMethod.clickOndropDown(partnerTitle, partnerValue);
    }

    /*Entering Mother Initial*/
    public void enterMothersInitial(String motherInitialValue){
        CommonMethod.clearAndEnterAValueInATextBox(motherInitialTextBox, motherInitialValue);
    }

    /*Enter Partner's Initial*/
    public void enterPartnersInitial(String partnerInitialValue){
        CommonMethod.clearAndEnterAValueInATextBox(partnerInitial, partnerInitialValue);
    }

    /*Entering Mother First Name*/
    public void enterMothersFirstName(String motherFirstNameValue){
        CommonMethod.clearAndEnterAValueInATextBox(motherName, motherFirstNameValue);

    }

    /*Enter Partner's First Name*/
    public void enterPartnersFirstName(String partnerFirstNameValue){
        CommonMethod.clearAndEnterAValueInATextBox(partnerFirstName, partnerFirstNameValue);
    }

    /*Entering Mother Last Name*/
    public void enterMothersLastName(String motherlastNameValue){
        CommonMethod.clearAndEnterAValueInATextBox(motherLastName, motherlastNameValue);
    }

    /*Entering Partners LastName*/
    public void enterPartnersLastName(String partnerLastNameValue){
        CommonMethod.clearAndEnterAValueInATextBox(partnerLastName, partnerLastNameValue);
    }

    /*Selecting Mother's DOB*/
    public void selectMothersDob(String month, String year){
        CommonMethod.clickOnElement(motherDatePicker);
        CommonMethod.clickOndropDown(selectMonth, month);
        CommonMethod.clickOndropDown(selectYear, year);
        CommonMethod.clickOnElement(selectDate);
    }

    /*Selecting Partner's DOB*/
    public void selectPartnersDob(String month, String year){
        CommonMethod.clickOnElement(partnerDOB);
        CommonMethod.clickOndropDown(selectMonth, month);
        CommonMethod.clickOndropDown(selectYear, year);
        CommonMethod.clickOnElement(selectDate);
    }

    /*Selecting Mother's Education Status*/
    public void selectMothersEducationStatus(String motherEducationStatusValue){
        CommonMethod.clickOndropDown(status, motherEducationStatusValue);
    }

    /*Selecting Partner's Education Status*/
    public void selectPartnersEducationStatus(String partnerEducationStatusValue){
        CommonMethod.clickOndropDown(partnerEducationStatus, partnerEducationStatusValue);
    }

    /*Entering Mother's Occupation*/
    public void enterMothersOccupation(String motherOccupationValue){
        CommonMethod.clearAndEnterAValueInATextBox(motherOccupation, motherOccupationValue);
    }

    /*Entering Partner's Occupation*/
    public void enterPartnersOccupation(String partnerOccupationValue){
        CommonMethod.clearAndEnterAValueInATextBox(partnerOccupation, partnerOccupationValue);
    }

    /*Selecting Mother's Occupation Status*/
    public void selectMothersOccupationStatus(String motherOccupationstatusValue){
        CommonMethod.clickOndropDown(motherOccupationStatus, motherOccupationstatusValue);
    }

    /*Selecting Partner's Occupation Status*/
    public void selectPartnersOccupationStatus(String partnerOccupationStatusValue){
        CommonMethod.clickOndropDown(partnerOccupationStatus, partnerOccupationStatusValue);
    }

    /*Entering Mother and Partner's mobile number*/
    public void enterMobileNo(String mobileNo, String landLine){
        CommonMethod.clearAndEnterAValueInATextBox(motherMobileNo, mobileNo);
        CommonMethod.clearAndEnterAValueInATextBox(landLineNo,landLine);
    }

    /*Entering Mother and Partner's Email*/
    public void enterMothersEmail(String motherEmail){
        CommonMethod.clearAndEnterAValueInATextBox(email, motherEmail);
    }

    /*Entering Mother and Partner's Spoken language*/
    public void enterMothersSpokenLanguage(String language){
        CommonMethod.clearAndEnterAValueInATextBox(motherLanguage, language);
    }

    /*Clicking on Same as mother's contact details including languages check box*/
    public void clickOnSameContactCheckBox(){
        CommonMethod.clickOnCheckBox(checkBox);
    }

    public void checkSamevalueIsDisplayed(){
        Assert.assertTrue("Contact1 does not match", motherMobileNo.getText().equals(partnerMobileNo.getText()));
        Assert.assertTrue("Contact2 does not match", landLineNo.getText().equals(partnerLandLine.getText()));
        Assert.assertTrue("Email does not match", email.getText().equals(partnerEmail.getText()));
        Assert.assertTrue("Language does not match", motherLanguage.getText().equals(partnerLanguage.getText()));
    }

   /*Entering the value in address1 text field*/
   public void enterTheValueInAddress1Field(String address1Values){
       CommonMethod.clearAndEnterAValueInATextBox(address1, address1Values);
   }

   /*Entering the value in address2 text field*/
   public void enterTheValueInAddress2Field(String address2Value){
       CommonMethod.clearAndEnterAValueInATextBox(address2, address2Value);
   }

   /*Entering the value in address3 text field*/
   public void enterTheValueInAddress3Field(String cityValue){
       CommonMethod.clearAndEnterAValueInATextBox(city, cityValue);
   }

   /*Entering the value in address4 text field*/
   public void enterTheValueInaddress4field(String pinCodeValue){
       CommonMethod.clearAndEnterAValueInATextBox(pinCode, pinCodeValue);
   }

   /*Entering the value in address5 text field*/
   public void enterTheValueInaddress5field(String countryValue){
       CommonMethod.clearAndEnterAValueInATextBox(country, countryValue);
   }

    /*Clicking on Same as Current Address check box*/
    public void clickOnSameAddressCheckBox(){
        CommonMethod.clickOnCheckBox(sameAddressCheckBox);
    }

    /*Checking same address is displaying in current address and mailing address*/
    public void checkSameAddressIsDisplaying(){
       Assert.assertTrue("Address1 field doesn't match", address1.getText().equals(mailAddress1.getText()));
       Assert.assertTrue("Address2 field doesn't match", address2.getText().equals(mailAddress2.getText()));
       Assert.assertTrue("Address3 field doesn't match", city.getText().equals(mailAddress3.getText()));
       Assert.assertTrue("Address4 field doesn't match", pinCode.getText().equals(mailAddress4.getText()));
       Assert.assertTrue("Address5 field doesn't match", country.getText().equals(mailAddress5.getText()));
    }

    /*After entering the values in the field clicking on save and close button*/
    public void clickOnSaveAndCloseButton(){

        CommonMethod.clickOnAButton(saveAndClose);
    }

    /*Entering a value in a search box*/
    public void enterAValueInSearchBox(String searchName){
        CommonMethod.clearAndEnterAValueInATextBox(searchBox, searchName);
        searchClick.click();
    }

    /*Checking whether the entered mrno are saved and displayed*/
    public void checkMotherIsRegistered(String mrNoValue){
        Assert.assertTrue("Mother Registration is not saved", mrnoSearch.getText().equals(mrNoValue));
    }

}
