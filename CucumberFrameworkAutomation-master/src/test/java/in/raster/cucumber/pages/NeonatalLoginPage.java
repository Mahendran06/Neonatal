package in.raster.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import in.raster.cucumber.utilities.CommonMethod;
import in.raster.cucumber.utilities.PropertyReader;

import java.util.Random;

public class NeonatalLoginPage {

    private WebDriver driver;

    public NeonatalLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    Random rand = new Random();

    public void setRand(Random rand) {
        this.rand = rand;
        System.out.println(rand.nextInt());
    }
    /*Xpath*/
    /*Xpath for entering username*/
    @FindBy(xpath = "//input[@name='email']")
    public WebElement userNameTextBox;

    /*Xpath for entering password*/
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    /*Xpath for clicking on signin button*/
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    /*Xpath for checking dashboard name*/
    @FindBy(xpath = "//a[@href='/']")
    private WebElement textName;

    /*Xpath for checking error message*/
    @FindBy(xpath = "//div[@class= 'alert fade in alert-danger']")
    private WebElement errorMessage;

    /*Perform Action*/
    /*Checking the url is valid or not*/
    public void checkTheUrl(){
        Assert.assertTrue("URL is not correct",driver.getCurrentUrl().equals(new PropertyReader().readProperty("administratorURL")));
    }

    /*Entering username*/
    public void enterUserName(String userName){
        CommonMethod.clearAndEnterAValueInATextBox(userNameTextBox, userName);
    }

    /*Entering password*/
    public void enterPassword(String password){
        CommonMethod.clearAndEnterAValueInATextBox(passwordTextBox, password);
    }

    /*Clicking on signin button*/
    public void clickOnSignIn(){
        CommonMethod.clickOnAButton(submitButton);
    }

    /*Check that dashboard name is displayed after clicking on signin button*/
    public void checkTheName(String neonatalText){
        Assert.assertEquals("Dashboard name is not displaying", textName.getText(),neonatalText);
    }

    /*Check that proper error message is displaying for invalid username and password*/
    public void checkTheErrorMessage(String actualErrorMessage){
        Assert.assertTrue("Error message is not matching", errorMessage.getText().equals(actualErrorMessage));
    }

}
