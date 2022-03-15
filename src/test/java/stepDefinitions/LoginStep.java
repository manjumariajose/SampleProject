package stepDefinitions;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class LoginStep extends Base {
	LoginPage lp;
	
	@Given("^Initialize the application browser$")
    public void initialize_the_browser() throws Throwable {
		driver = initializeDriver();
    }
	@Given("^Navigate to the login url$")
    public void navigate_to_the_url() throws Throwable {
		driver.get(prop.getProperty("url"));
    }

	@Given("^Click on the login link in home page$")
    public void click_on_the_login_link_in_home_page() throws Throwable {
    	LandingPage login = new LandingPage(driver);
		 lp = login.getLogin();
    }
    @When("^Enter (.+) and (.+)$")
    public void enter_and(String username, String password) throws Throwable {
       lp.getEmail().sendKeys(username);
       lp.getPassword().sendKeys(password);
       lp.getSubmit().click();;
    }

   /* @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	ForgotPassword fp = lp.getforgotPassword();
    	Assert.assertFalse(fp.getforgetPassword().isDisplayed());
    }*/

    

   @Then("^Close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }


}
