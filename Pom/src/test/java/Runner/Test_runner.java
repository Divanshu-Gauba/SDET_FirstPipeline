package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"C:\\Users\\Lalit\\workspace\\Pom\\src\\main\\resources\\Login\\login.feature"},
	glue={"StepDefinition"},
	tags="@login",
	dryRun=false,//To check weather you have missed an steps in the scenarion
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check wether any step is not defined in step definition
	plugin={"html:testoutput.html","junit:junit_xml/cucumber.xml","json:json_output/cucumber.json"}
	)
public class Test_runner {

}
