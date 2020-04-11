package stepdefinition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Browser.browser;
import com.pages.ServicePage;
import com.pages.LoginPage;

import ScreenShot.Screenshot;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	

	public class Server_TC extends browser {
		final static Logger logger = LogManager.getLogger(Login_TC.class.getName());
		
		LoginPage loginpage  = null;
		ServicePage  serv = null;
		@Given("^Open chrome and start naukri application$")
	    public void open_chrome_and_start_naukri_application() throws Throwable {
			driver = Browsersetup("Chrome");
			  loginpage  = new LoginPage(driver);
			  serv = new  ServicePage();
	    }

	    @When("^User enters valid username and password$")
	    public void user_enters_valid_username_and_password() throws Throwable {
	    	 loginpage.loginfirst();
		    	loginpage.values();
		    	loginpage.value();
	    }

	    @Then("^user must able to login$")
	    public void user_must_able_to_login() throws Throwable {
	    	loginpage.login();	
	    }
	    
	    
	    @Then("^user selects service page$")
	    public void user_selects_service_page() throws Throwable {
	    	Thread.sleep(5000);
	    	serv.servicepg();
	    	logger.info("Successfully opened service page");
	    	Screenshot util = new Screenshot(driver);
			util.takeSnapshot("./Screenshot/naukri.png");
			logger.info("Screenshot is taken successfully");
	    }
	    
	}
		
		
		
		 
		    	
	

