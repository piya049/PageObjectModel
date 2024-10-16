package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class POMLoginStepDefination {
	
	static WebDriver driver;
	
	LoginPage login;

@Given("User is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
    driver = new ChromeDriver();
    driver.get("https://www.saucedemo.com/v1/");
}

@When("User enters valid {string} and {string}")
public void user_enters_valid_and(String username, String password) throws InterruptedException{
    // Write code here that turns the phrase above into concrete actions
    
	login = new LoginPage(driver);
	login.enterUserName(username);
    login.enterPassword(password);
}

@When("Clicks on login Button")
public void clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    login.clickLogin();
}

@Then("User is navigated to Home Page")
public void user_is_navigated_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
   login.isAppLogoDisplayed();
}

@Then("Close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
	driver.close();

}




}
