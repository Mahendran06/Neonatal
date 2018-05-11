package in.raster.cucumber.pages;

import in.raster.cucumber.utilities.CommonMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeonatalRegistrationPage {

    private WebDriver driver;
    public NeonatalRegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*Xpath for clicking register baby button*/
    @FindBy(xpath = "//button[@name = 'babycreate']")
    private WebElement registerBabyButton;

    /*Performing Actions*/
    public void clickOnRegisterBabyButton(){
        CommonMethod.clickOnAButton(registerBabyButton);
    }
}
