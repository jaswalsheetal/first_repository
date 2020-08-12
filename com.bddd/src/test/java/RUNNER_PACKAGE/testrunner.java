package RUNNER_PACKAGE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features={"D:\\automation_1june\\com.bddd\\src\\test\\java\\FEATURE_PACKAGE\\loginfeature.feature"},
glue={"STEP_DEFINATION"},
//dryRun=true
monochrome=true
//strict=false
//plugin={"pretty","json:target/cucumber-json-reports/Cucumber.json","junit:target/cucumber-xml-reports/XMLCucumber.xml","html:target/cucumber-html-reports"}
)

public class testrunner {

}
