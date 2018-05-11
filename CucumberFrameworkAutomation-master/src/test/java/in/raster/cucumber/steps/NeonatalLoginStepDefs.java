package in.raster.cucumber.steps;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import in.raster.cucumber.pages.NeonatalLoginPage;
import in.raster.cucumber.utilities.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import in.raster.cucumber.utilities.CommonMethod;

import java.util.List;
import java.util.Map;

public class NeonatalLoginStepDefs {

    private WebDriver driver;
    private NeonatalLoginPage neonatalLogin;

    @Before // before every scenario
    public void beforeEveryScenario(){
        driver = DriverFactory.createNewDriver();
        new CommonMethod(driver).init();
        neonatalLogin = new NeonatalLoginPage(driver);
    }

    @After
    public void afterEveryScenario(Scenario scenario){

        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        //DriverFactory.killDriver();
    }

    /*Checking the URL*/
    @Given("^login page is displayed$")
    public void login_page_is_displayed()  {
        neonatalLogin.checkTheUrl();
    }

    @Given("^login with valid credentials$")
    public void login_with_valid_credentials(DataTable userCredentials)  {

        List<Map<String, String>> data = userCredentials.asMaps(String.class, String.class);
        neonatalLogin.userNameTextBox.sendKeys(data.get(0).get("username"));
        neonatalLogin.passwordTextBox.sendKeys(data.get(0).get("password"));

    }

    /*Clicking on signin button*/
    @And("^click on the Login button$")
    public void click_on_the_Login_button()  {
        neonatalLogin.clickOnSignIn();
    }

    /*Checking dashboard name is displayed*/
    @Then("^check that neonatal dashboard name displays$")
    public void check_that_neonatal_dashboard_displays()  {
        neonatalLogin.checkTheName("Dashboard");
    }

    /*Checking error message for invalid username and password*/
    @Then("^check that error message is displayed$")
    public void check_that_error_message_is_displayed()  {
        neonatalLogin.checkTheErrorMessage("Enter correct username and password");
    }

    /*login for other scenarios*/
    @Given("^login with valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_valid_credentials_and(String userName1, String password1)  {
        neonatalLogin.checkTheUrl();
        neonatalLogin.enterUserName(userName1);
        neonatalLogin.enterPassword(password1);
        neonatalLogin.clickOnSignIn();
        neonatalLogin.checkTheName("Dashboard");
    }

}
