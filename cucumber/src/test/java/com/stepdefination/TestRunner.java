package com.stepdefination;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="orangehrmapplication",
                              // name of the folder in which the feature file is created
glue="com.Stepdefination",
// glue will connect the feature file with the WebDriver Test Script implemented with userDefined methods
monochrome=true // will remove the junk data from the OutPut console
//dryRun=true
)
public class TestRunner {




}
