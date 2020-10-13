package com.qa.cuke;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//glue = "src/test/java/com/qa/cuke" // location of the stepdefs (if this test runner is in a package alongside a package named stepdefs, you do not need to include glue)
 features = "src/test/resources/cuke",  // location of the feature files
 plugin = {"pretty", "html:target/reports/htmlReports"}, // produces a in console report, can also support exporting to html, json and junit/xml
 monochrome = true, // tidies up our report from the plugin = "pretty"
 tags = {"~@ignore"} // Tags allow us to refer to 
 )
public class TestRunner {
}