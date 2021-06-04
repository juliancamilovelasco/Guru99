package com.demo.guru99.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
                glue = "com.demo.guru99.test.stepdefinitions",
                snippets = SnippetType.CAMELCASE) //Aplica CamelCase a los Scenarios de Cucumber establecidos en los Features

public class RegisterRunner {

}
