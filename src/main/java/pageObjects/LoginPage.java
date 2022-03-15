package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	private	By email=By.cssSelector("[id='user_email']");
	private	By password=By.cssSelector("[id='user_password']");
	private	By submit=By.cssSelector("[value='Log In']");
	private	By forgotPassword=By.cssSelector("[href*='password/new']");
	public LoginPage(WebDriver driver) {
		
this.driver=driver;
	}
	public WebElement getEmail() {
		return(driver.findElement(email));
	}
	public WebElement getPassword() {
		return(driver.findElement(password));
	}
	public WebElement getSubmit() {
		return(driver.findElement(submit));
	}
	
	public ForgotPassword getforgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
		
	}
}
