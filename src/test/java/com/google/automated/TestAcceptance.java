package com.google.automated;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions  (features="src/test/resources/features/",
                    plugin = {"pretty" ,"json:target/cucumber.json"},
                    glue = "com.google.automated.steps")
public class TestAcceptance {}