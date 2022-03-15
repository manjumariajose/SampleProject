package Application.SampleProject.cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/java/features/HomePage.feature", glue="src/test/java/stepDefinitions/HomePageSteps.java")
//@CucumberOptions(features="src/test/java/features/", glue="src/test/java/stepDefinitions/")

/*@CucumberOptions(
		features = {"classpath:features"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {"@Second"},
		glue={"helpers","stepDefinitions", "stepDefinitions"},
//		dryRun = true,
		monochrome = true
		)*/
@CucumberOptions(features="src/test/java/features", glue="stepDefinitions")
public class TestRunner extends AbstractTestNGCucumberTests {

}
