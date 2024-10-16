package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By text_username = By.id("user-name");
	By text_password = By.id("password");
	By btn_login = By.id("login-button");
	By lbl_logo = By.xpath("//div[@class='app_logo']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {
		driver.findElement(text_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(text_password).sendKeys(password);

	}

	public void clickLogin() {
		driver.findElement(btn_login).click();

	}

	public void isAppLogoDisplayed() {
		driver.findElement(lbl_logo).isDisplayed();
	}

	public void userLogin(String username, String password) {

		driver.findElement(text_username).sendKeys(username);
		driver.findElement(text_password).sendKeys(password);
		driver.findElement(btn_login).click();

	}

}
