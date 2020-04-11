package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\ProjectNaukrinew\\src\\test\\resources\\features\\naukri.feature",
				 glue = {"stepdefinition"},
				 tags = {"@Naukri_3"},
				 plugin = {"pretty","html:target/cucumber" },
					monochrome = true
)
       
	
	

 
public class Companygovt_TestRunner {

}
 