package runner_file;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features={"D:\\automation_1june\\com.orangebdd\\src\\test\\java\\feature_package\\parameter.feature"},

glue={"STEP_DEFINATION"},
tags={"@smoke"},
//dryRun=false
monochrome=true
//plugin={"pretty","json:target/cucumber-json-reports/Cucumber.json","junit:target/cucumber-xml-reports/XMLCucumber.xml","html:target/cucumber-html-reports"}
)

public class ruuner_file {
	
}
   