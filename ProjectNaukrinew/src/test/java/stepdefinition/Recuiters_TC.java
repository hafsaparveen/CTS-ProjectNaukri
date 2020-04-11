package stepdefinition;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Browser.browser;
import com.pages.RecuitersPage;

import ScreenShot.Screenshot;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Recuiters_TC extends browser {
	final static Logger logger = LogManager.getLogger(Login_TC.class.getName());

	RecuitersPage home =null;

	@Given("^user launches browser page$")
	public void user_launches_browser_page() throws Throwable {
		driver = Browsersetup("Chrome"); 
		home = new RecuitersPage(driver);		 
		logger.info("Webpage opens successfully");
	}
	 @When("^I click recuiters option$")
	    public void i_click_recuiters_option() throws Throwable {		  
			home.recute();
	    }

	    @Then("^user clicks on the IT$")
	    public void user_clicks_on_the_it() throws Throwable {
	    	String parentWindow=driver.getWindowHandle();
 	    	Set<String> handles=driver.getWindowHandles();
 	    	for(String windowHandle : handles) {
 	    		if(!windowHandle.contentEquals(parentWindow)) {
 	    			driver.switchTo().window(windowHandle);
 	    			break;
 	    		}
 	    	}	    	
			home.bycategory();      
	    }

	    @Then("^user click on particular Recuiter$")
	    public void user_click_on_particular_recuiter() throws Throwable {
 	         
	    	String parentWindow=driver.getWindowHandle();
	    	Set<String> handles=driver.getWindowHandles();
	    	for(String windowHandle : handles) {
	    		if(!windowHandle.contentEquals(parentWindow)) {
	    			driver.switchTo().window(windowHandle);
	    			break;
	    		}
	    	}    	  
			home.recuiter();
			logger.info("successfully found reciter");
			Screenshot util = new Screenshot(driver);
			util.takeSnapshot("./Screenshot/naukri.png");
			logger.info("Screenshot is taken successfully");
      }
    }
    