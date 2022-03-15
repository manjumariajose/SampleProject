package Application.SampleProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class validateTitle extends Base {
	private static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	LandingPage l;

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initializeDriver();

	}

	@Test
	public void homepageNavigation() throws IOException {
		System.setProperty("org.freemarker.loggerLibrary", "none");//to disable freemarker logging. 
		driver.get(prop.getProperty("url"));
		 l = new LandingPage(driver);

		Assert.assertEquals(l.gettext().getText(), "FEATURED COURSES");
		log.info("validated home page text");

	}

	@Test
	public void verifyHeader() throws IOException {

		Assert.assertEquals(l.getheader().getText(),
				"Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		log.info("validated home page text");

	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
