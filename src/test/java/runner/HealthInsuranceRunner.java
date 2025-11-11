package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {
				//"C:\\Users\\HP\\eclipse-workspace\\11Oct_BDD\\src\\test\\resources\\FeatureFiles\\Multiscenario.feature"
		//"C:\\Users\\HP\\eclipse-workspace\\11Oct_BDD\\src\\test\\resources\\FeatureFiles\\CoverFoxHealthInsurancePlan.feature"
		"C:\\Users\\HP\\eclipse-workspace\\11Oct_BDD\\src\\test\\resources\\FeatureFiles\\CoverFoxHealthInsurancePlan.feature"
		}
		,glue= {"stepDefinitions","hooks"}
		,plugin = {"pretty","html:target/Cucumber-reports/reports.html"}, publish = true,
				dryRun=false)


public class HealthInsuranceRunner extends AbstractTestNGCucumberTests {

}

