package stepDefinitions;

import org.junit.runner.RunWith;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import resources.Base;
@RunWith(Cucumber.class)
public class HomePageStep extends Base {
	LandingPage	l = new LandingPage(driver);
	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver = initializeDriver();
	}

	@And("^Navigate to the url$")
	public void navigate_to_the_url() throws Throwable {
		driver.get(prop.getProperty("url"));
	}

	@And("^verify that user is in homepage$")
	public void verify_that_user_is_in_homepage() throws Throwable {
		l = new LandingPage(driver);
		Assert.assertEquals(l.gettext().getText(), "FEATURED COURSES");
	    
	}
	@Then("^verify the title$")
	public void verify_the_title_and_close_the_browser() throws Throwable {
		Assert.assertEquals(l.getheader().getText(),
				"Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
	}
	@Then("^Compare the main menu$")
	public void compare_the_main_menu() throws Throwable {
		Assert.assertTrue(l.getMainMenu().isDisplayed());
	}
	@And("^Close the browser$")
	public void close_the_browser() {
		driver.close();
	}

	
}
