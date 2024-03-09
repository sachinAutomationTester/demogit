package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\SACHIN R\\eclipse-workspace1\\FreecrmBDDFramework\\src\\main\\java\\Features",
        glue={"StepDefinitions"},
		 publish=true,
		format= {"pretty","html:test-outout"}
        )

public class testRunner {

}
