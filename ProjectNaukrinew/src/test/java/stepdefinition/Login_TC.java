package stepdefinition;

import com.Browser.browser;
import com.pages.LoginPage;

import ScreenShot.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Login_TC extends browser {
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());
	WebDriver driver;
	LoginPage web = null;
	browser browserpage;

	// To launch the browser
	@Given("^I navigate to login page$")
	public void i_navigate_to_login_page() throws Throwable {
		driver = Browsersetup("Chrome");
		web = new LoginPage(driver);
		logger.info("Browser Launches");
	}

	// Login Page
	@When("^I open home page$")
	public void i_open_home_page() throws Throwable {		
		web.loginfirst();
		logger.info("Website opens");
	}

	// Giving the username
	@Then("^user enter username$")
	public void user_enter_username() throws Throwable {		
		web.values();
	}

	// Giving the password
	@And("^the user enters password$")
	public void the_user_enters_password() throws Throwable {
		LoginPage web = new LoginPage(driver);
		web.value();
	}

	// to logged in to the homepage
	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {		
		web.login();
		logger.info("login successfull");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshot/naukri.png");
		logger.info("Screenshot is taken successfully");
	}

}
