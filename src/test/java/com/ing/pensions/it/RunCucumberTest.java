package com.ing.pensions.it;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = { "com.ing.pensions.it.stepDefinitions" }, plugin = { "pretty",
                                                                                                                        "html:target/cucumber-reports",
                                                                                                                        "json:target/cucumber.json",
                                                                                                                        "junit:target/cucumber.xml",
                                                                                                                        "rerun:target/rerun.txt" }, monochrome = true)
public class RunCucumberTest {
}
