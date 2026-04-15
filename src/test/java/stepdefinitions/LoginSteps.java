package stepdefinitions;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;
import utils.*;
public class LoginSteps {
    LoginPage page;

    @Given("user is on login page")
    public void open(){
        page=new LoginPage(DriverFactory.get());
        page.open(ConfigReader.get("url"));
    }

    @When("user logs in with username {string} and password {string}")
    public void login(String u,String p)
    { page.login(u,p);
    }

    @Then("dashboard should be displayed")
    public void verify(){
        Assert.assertEquals(page.title(),"Logged In Successfully | Practice Test Automation");
    }
}