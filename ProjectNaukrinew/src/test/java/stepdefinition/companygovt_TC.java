package stepdefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Browser.browser;
import com.pages.CompanyGovtPage;

import ScreenShot.Screenshot;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class companygovt_TC extends browser {
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	CompanyGovtPage homepage = null;

	@Given("^I launch a browser$")
	public void i_launch_a_browser() throws Throwable {
		driver = Browsersetup("Chrome");
		homepage = new CompanyGovtPage(driver);
		logger.info("Webpage opens");
	}

	@When("^I open Companies page$")
	public void i_open_companies_page() throws Throwable {		
		homepage.cpage();
	}

	@Then("^I click on government jobs$")
	public void i_click_on_government_jobs() throws Throwable {
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String windowHandle : handles) {
			if (!windowHandle.contentEquals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}		
		homepage.government();
		logger.info("Search of Government job is successful");
	}

	@And("^I click the defence$")
	public void i_click_the_defence() throws Throwable {		
		homepage.defencegovt();
	}

	@And("^I click on inidan army$")
	public void i_click_on_inidan_army() throws Throwable {		
		homepage.indianarmy();
		logger.info("successfully found the jobs");
		Screenshot util = new Screenshot(driver);
		util.takeSnapshot("./Screenshot/naukri.png");
		logger.info("Screenshot is taken successfully");
	}

}
