package in.raster.cucumber.pages;

import in.raster.cucumber.utilities.CommonMethod;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.raster.cucumber.pages.NeonatalBabyRegPage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NeonatalProformaPage {

    private WebDriver driver;
    private NeonatalBabyRegPage babyReg = new NeonatalBabyRegPage(driver);

    public NeonatalProformaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*XPATH*/
    /*Xpath for finding Neonatal Proforma tab*/
    @FindBy(xpath = "//a[contains(text(), 'NEONATE - Basic entry form (for all babies)')]")
    private WebElement neonatlProformaTab;

    /*Xpath for finding Neonatal proforma Text*/
    @FindBy(xpath = "//div[@class = 'widget-header']//h4")
    private WebElement neonatalProformaPage;

    /*Xpath for clicking Create New button*/
    @FindBy(xpath = "//span[contains(text(), 'Create New')]")
    private WebElement neonatalProformaCreateNewButton;

    /*Xpath for finding Select baby*/
    @FindBy(xpath = "//span[contains(text(), 'Select from List')]")
    private WebElement selectBaby;

    /*Xpath for finding baby*/
    @FindBy(xpath = "//div[contains(text(), 'B/O Mother Father - 123/454MB')]")
    private WebElement babySelect;

    /*Xpath for finding Start button*/
    @FindBy(xpath = "//span[contains(text(), 'Start')]")
    private WebElement startButton;

    /*Xpath for finding baby details text*/
    @FindBy(xpath = "//a[@href = \"#babyform\"]")
    private WebElement babyDetails;

    /*Xpath for finding data text*/
    @FindBy(id = "TestDate")
    private WebElement dataEntryDate;

    /*Xpath for finding baby name*/
    @FindBy(id = "BabyName")
    private WebElement nBabyName;

    /*Xpath for finding DOB*/
    @FindBy(id = "DOB")
    private WebElement nBabyDob;

    /*Xpath for finding Time of Birth*/
    /*Xpath for finding Hours*/
    //@FindBy(xpath = "//select[@name = 'TOB_TIME']")
    @FindBy(xpath = "//select[@name = 'TOB_TIME']//option[@selected = 'selected']")
    private WebElement babyHrTime;

    /*Finding Minutes*/
    //@FindBy(xpath = "//select[@name = 'TOB_MINS']")
    @FindBy(xpath = "//select[@name = 'TOB_MINS']//option[@selected = 'selected']")
    private WebElement babyMinTime;

    /*Finding AM or PM*/
    //@FindBy(xpath = "//select[@name = 'TOB_AM']")
    @FindBy(xpath = "//select[@name = 'TOB_AM']//option[@selected = 'selected']")
    private WebElement babyMorOrEve;

    /*Performing Actions*/
    /*Clicking on Neonatal Proforma Tab*/
    public void clickOnNeonatalProformaTab(){
        CommonMethod.clickOnElement(neonatlProformaTab);
    }

    /*Checking Neonatal Proforma page is displayed*/
    public void checkNeonatalProformaPageIsDisplayed(String value){
        Assert.assertTrue("Neonatal Proforma page is not displayed", neonatalProformaPage.getText().equals(value));
    }

    /*Clicking on create new button*/
    public void clickOnCreateNewButton(){
        CommonMethod.clickOnAButton(neonatalProformaCreateNewButton);
    }

    /*Clicking on select from list drop down menu*/
    public void clickOnSelectBaby(){
        CommonMethod.clickOnElement(selectBaby);
    }

    /*Select the baby from the drop down menu*/
    public void selectTheBaby(String babyName){
        Assert.assertTrue("Baby Name is Not displaying", babySelect.getText().equals(babyName));
        CommonMethod.clickOnElement(babySelect);
    }

    /*Clicking on start button*/
    public void clickOnStartButton(){
        CommonMethod.clickOnAButton(startButton);
    }

    /*Check that Baby Details page is displayed*/
    public void checkBabyDetailsIsDisplayed(String value){
        Assert.assertTrue("Baby Details page is not displaying", babyDetails.getText().equals(value));
    }

    /*Checking that system date and data entry date are same*/
    public void checkDateIsVaild(String dataDate){
        Assert.assertTrue("System date is not displaying", dataEntryDate.getAttribute("value").equals(dataDate));
    }

    /*Check that baby name displaying same as entered in baby registration*/
    public void checkValidBabyNameIsDisplayed(String babyName){
        Assert.assertTrue("Baby Name is not displaying", nBabyName.getAttribute("value").equals(babyName));

       // Assert.assertTrue("Not a baby name", nBabyName.getAttribute("value").equals(babyReg.bName));
    }

    /*Checking that baby DOB is displaying as entered in baby registration*/
    public void checkBabysDobIsValid(String nDob){
        Assert.assertTrue("Baby's Dob is not valid", nBabyDob.getAttribute("value").equals(nDob));
    }

}
