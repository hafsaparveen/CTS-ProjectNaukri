package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\ProjectNaukrinew\\src\\test\\resources\\features\\naukri.feature",
                  plugin = {"pretty","html:target/cucumber" },
                  tags = {"@Naukri_1"},
				  glue = {"stepdefinition"},
				  monochrome = true
)
public class Login_TestRunner {
	
       
	
}
  