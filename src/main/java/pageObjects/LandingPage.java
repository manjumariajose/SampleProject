package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;
	private	By signIn=By.cssSelector("a[href*='sign_in']");
	private By text=By.cssSelector(".text-center>h2");
	private	By mainMenu=By.cssSelector(".nav.navbar-nav.navbar-right");
	private	By header=By.cssSelector("div[class*='video-banner'] p");
	public LandingPage(WebDriver driver) {
		
this.driver=driver;
	}
	public LoginPage getLogin() {
		driver.findElement(signIn).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
		
	}
	public WebElement gettext() {
		return(driver.findElement(text));
	}
	public WebElement getMainMenu() {
		return(driver.findElement(mainMenu));
	}
	public WebElement getheader() {
		return(driver.findElement(header));
	}

}

