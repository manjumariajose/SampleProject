package Application.SampleProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginScenarios extends Base {

	private static Logger log = LogManager.getLogger(Base.class.getName());

	public WebDriver driver;

	@BeforeTest
	public void openBrowser() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void homepageNavigation(String un, String pw) throws IOException {
		System.setProperty("org.freemarker.loggerLibrary", "none");
		driver.get(prop.getProperty("url"));
		LandingPage login = new LandingPage(driver);
		LoginPage lp = login.getLogin();
		lp.getEmail().sendKeys(un);
		lp.getPassword().sendKeys(pw);
		lp.getSubmit().click();
		log.info("validated login scenarios");
		ForgotPassword fp = lp.getforgotPassword();
		fp.getEmail().sendKeys("kkk");
		fp.getInstruction().click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "abc@gmail.com";
		data[0][1] = "1234";

		data[1][0] = "qwe@gmail.com";
		data[1][1] = "3214";
		return data;
	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}

}
