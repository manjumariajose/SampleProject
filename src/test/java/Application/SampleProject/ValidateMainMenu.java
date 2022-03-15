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

public class ValidateMainMenu extends Base {
	private static Logger log = LogManager.getLogger(Base.class.getName());
	public WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initializeDriver();
		
	}

	@Test
	public void homepageNavigation() throws IOException {
		System.setProperty("org.freemarker.loggerLibrary", "none");
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);

		Assert.assertTrue(l.getMainMenu().isDisplayed());
		log.info("validated main menu");

	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
