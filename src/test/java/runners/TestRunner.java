package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import extentreporting.ExtentReportingManager;

@CucumberOptions(features={"Features"}
,glue={"stepdefinitions"}
,plugin = {"pretty", "html:target/cucumber"}
 , tags ={"@smoke"}, 
 monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
	
	
	
}
