package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\GoogleSearch.feature",
glue = "stepDefinitions")
public class googleSearch extends AbstractTestNGCucumberTests {

}