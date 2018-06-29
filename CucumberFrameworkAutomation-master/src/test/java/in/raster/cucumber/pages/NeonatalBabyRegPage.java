package in.raster.cucumber.pages;

import in.raster.cucumber.utilities.CommonMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.raster.cucumber.steps.NeonatalRegistrationStepDefs;


public class NeonatalBabyRegPage {

    private WebDriver driver;

    public NeonatalBabyRegPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*NeonatalRegistrationStepDefs neo = new NeonatalRegistrationStepDefs();*/

    private String motherName;
    public void setMotherName(String mname){
        motherName = mname;
    }
    /*Xpath*/
    /*Xpath for clicking Baby Registration*/
    @FindBy(xpath = "//a[contains(text(),'Babie R')]")
    private WebElement babyRegElement;

    /*Xpath for checking Baby Registration*/
    @FindBy(xpath = "//h4[contains(text(), 'Baby Registration')]")
    private WebElement babyRegPage;

    /*Xpath for clicking Create New button*/
    @FindBy(xpath = "//a[@class = 'btn btn-info pull-right']")
    private WebElement babyRegCreateNewButton;

    /*Xpath for selecting Mother*/
    @FindBy(xpath = "//span[contains(text(), 'Select from List')]")
    private WebElement selectMother;

    /*Xpath for clicking mother name from select from list drop down menu*/
    @FindBy(xpath = "//div[@class = 'select2-result-label' and contains(text(), 'Mother Test - 951/357')]")
    private WebElement selectMotherName;

    /*Xpath for clicking on Start Button*/
    @FindBy(xpath = "//span[contains(text(), 'Start')]")
    private WebElement startButton;

    /*Xpath for checking that create text is available*/
    @FindBy(xpath = "//a[contains(text(), 'Create')]")
    private WebElement babyCreatepage;

    /*Xpath for entering baby MrNo*/
    @FindBy(id = "BMrNo")
    private WebElement babyMrNo;

    /*Xpath for entering baby name*/
    @FindBy(xpath = "//input[@id='BabyName']")
    private WebElement babyName;

    /*Xpath for selecting baby DOB field*/
    @FindBy(id = "DOB")
    private WebElement babyDOB;

    /*Xpath for selecting DOB month*/
    @FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]")
    private WebElement babyMonth;

    /*Xpath for selecting DOB year*/
    @FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]")
    private WebElement babyYear;

    /*Xpath for selecting DOB day*/
    @FindBy(xpath = "//a[@href='#' and contains(text(), '10')]")
    private WebElement babyDate;

    /*Xpath for selecting Time of Birth*/
    /*Xpath for selecting Hours*/
    @FindBy(xpath = "//select[@name = 'TOB_TIME']")
    private WebElement babyHrTime;

    /*Xpath for selecting Minutes*/
    @FindBy(xpath = "//select[@name = 'TOB_MINS']")
    private WebElement babyMinTime;

    /*Xpath for selecting AM or PM*/
    @FindBy(xpath = "//select[@name = 'TOB_AM']")
    private WebElement babyMorOrEve;

    /*Xpath for selecting multiple pregnancy*/
    @FindBy(id = "MultiplePregnancy")
    private WebElement motherMUltiplePregnancy;

    /*Xpath for selecting Sex*/
    @FindBy(id = "Sex")
    private WebElement babySex;

    /*Xpath for selecting gestation in weeks*/
    @FindBy(id = "g_weeks")
    private WebElement gesWeeks;

    /*Xpath for selecting gestation in days*/
    @FindBy(id = "g_days")
    private WebElement gesDays;

    /*Xpath for selecting Birth status*/
    @FindBy(id = "BirthStatus")
    private WebElement babyBirthStatus;

    /*Xpath for selecting Birth weight*/
    @FindBy(id = "BirthWeight")
    private WebElement babyBirthWeight;

    /*Xpath for checking birth weight in kilogram*/
    @FindBy(xpath = "//input[@id = 'birth_weight']")
    private WebElement birthWeightKiloGram;

    /*Xpath for selecting baby's blood group*/
    @FindBy(id = "BabyBloodGroup")
    private WebElement babyBloodGroup;

    /*Xpath for selecting Consultant Name*/
    @FindBy(xpath = "//select[@name = 'neonatal_consultant[]']")
    private WebElement neonatalConsultant;

    /*Xpath for clicking on Add more button*/
    @FindBy(xpath = "//span[contains(text(), 'Add More')]")
    private WebElement addMoreButton;

    /*Xpath for selecting Consultant Name*/
    @FindBy(id = "neonatal_consultant")
    private WebElement addNeonatalConsultant;

    /*Xpath for selecting Paediatric Surgeon*/
    @FindBy(id = "paediatric_surgeon")
    private WebElement paediatricsurgeonName;

    /*Performing Actions*/
    /*Clicking on Baby Registration*/
    public void clickOnBabyRegistrationTab(){
        CommonMethod.clickOnElement(babyRegElement);
    }

    /*Checking whether baby registration is displayed*/
    public void checkBabyRegistrationPageIsDisplayed(String value){
        Assert.assertTrue("Baby  registration page didn't display", babyRegPage.getText().equals(value));
    }

    /*Clicking on Create New button for baby registration*/
    public void clickOnBabyRegCreateNewButton(){
        CommonMethod.clickOnAButton(babyRegCreateNewButton);
    }

    /*Selecting mother for baby registration*/
    public void clickOnSelectMother(){
        CommonMethod.clickOnElement(selectMother);
        CommonMethod.clickOnElement(selectMotherName);
    }

    /*Clicking on start button after selecting mother's name*/
    public void clickOnStartButton(){
        CommonMethod.clickOnAButton(startButton);
    }

    /*Checking that baby registration create page is displayed*/
    public void checkBabyRegPageIsDisplayed(String value){
        Assert.assertTrue("Baby Registration create page is not displayed", babyCreatepage.getText().equals(value));
    }

    /*Entering baby MrNo*/
    public void enterBabyMrNo(String BMrNoValue) {
        CommonMethod.clearAndEnterAValueInATextBox(babyMrNo, BMrNoValue);
    }

    /*Check that baby name is displayed*/
    public void checkOrEnterBabyName(String babyNameValue){
        Assert.assertTrue("Baby name didn't display", babyName.getAttribute("value").equals(babyNameValue));
    }

    /*Selecting the dob of the baby*/
    public void selectBabyDob(String month, String year){
        CommonMethod.clickOnElement(babyDOB);
        CommonMethod.clickOndropDown(babyMonth, month);
        CommonMethod.clickOndropDown(babyYear, year);
        CommonMethod.clickOnElement(babyDate);
    }

    /*Selectin baby's time of birth*/
    public void selectBabyTimeOfBirth(String babyHour, String babyMin, String morOrEve){
        CommonMethod.clickOndropDown(babyHrTime, babyHour);
        CommonMethod.clickOndropDown(babyMinTime, babyMin);
        CommonMethod.clickOndropDown(babyMorOrEve, morOrEve);
    }

    /*Selecting whether baby born was a multiple pregnancy or not*/
    public void selectMothersPregnancyType(String pregnancyType){
        CommonMethod.clickOndropDown(motherMUltiplePregnancy, pregnancyType);
    }

    /*Selecting Sex of the baby*/
    public void selectBabySex(String Sex){
        CommonMethod.clickOndropDown(babySex, Sex);
    }

    /*Entering mother's gestation in weeks and days*/
    public void enterGestationWeeksAndDays(String gWeek, String gday){
        CommonMethod.clearAndEnterAValueInATextBox(gesWeeks, gWeek);
        CommonMethod.clearAndEnterAValueInATextBox(gesDays,gday);
    }

    /*Selecting the birth status of the whether Inborn or Outborn*/
    public void selectBabyBirthStatus(String birthStatus){
        CommonMethod.clickOndropDown(babyBirthStatus, birthStatus);
    }

    /*Entering birth weight of a baby in grams*/
    public void enterBirthWeightOfBaby(String babyBtWeight){
        CommonMethod.clearAndEnterAValueInATextBox(babyBirthWeight, babyBtWeight);
    }

    /*Checking birth weight is displaying in kilo gram*/
    public void checkBirthWeigthInKg(String kg){
        Assert.assertTrue("Value is not displaying properly", birthWeightKiloGram.getAttribute("value").equals(kg));
    }

    /*Selecting baby's blood group*/
    public void selectBabysBloodGroup(String bloodGroup){
        CommonMethod.clickOndropDown(babyBloodGroup, bloodGroup);
    }

    /*Selecting Doctor Consulting Name*/
    public void selectNeonatalConsultant(String consultantName){
        CommonMethod.clickOndropDown(neonatalConsultant, consultantName);
    }

    /*Add more button to add more than one consultant*/
    public void clickOnAddMoreButton(){
        CommonMethod.clickOnAButton(addMoreButton);
    }

    /*Adding Consultant name*/
    public void selectNeonatalConsultantName(String consultantName){
        CommonMethod.clickOndropDown(addNeonatalConsultant, consultantName);
    }

    /*Selecting paediatric surgeon name*/
    public void selectPaediatricSurgeonName(String surgeonName){
        CommonMethod.clickOndropDown(paediatricsurgeonName, surgeonName);
    }
}
