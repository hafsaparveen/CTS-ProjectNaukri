package stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Browser.browser;
import com.pages.JobSearchPage;

import ScreenShot.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jobsearch_TC extends browser {
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());
	JobSearchPage page = null;

	@Given("^the user opens the browser$")
	public void the_user_opens_the_browser() throws Throwable {
		driver = Browsersetup("Chrome");
		page = new JobSearchPage(driver);
		logger.info("Browser Launches");
	}

	@When("^user enters the skill$")
	public void user_enters_the_skill() throws Throwable {		
		page.skillsearch();
		logger.info("Webpage opens and gives the skills");
	}

	@Then("^I enter a location$")
	public void i_enter_a_location() throws Throwable {		
		page.jobloc();
		logger.info("Webpage opens and gives the location");
	}

	@And("^click on jobsearch button$")
	public void click_on_jobsearch_button() throws Throwable {		
		page.search();
		logger.info("Successfully searches");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshot/naukri.png");
		logger.info("Screenshot is taken successfully");

	}

}
