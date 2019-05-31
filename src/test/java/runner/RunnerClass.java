package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepdefinition",plugin="html:C:\\cucumber-html-report")
public class RunnerClass {

}
