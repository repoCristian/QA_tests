package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com/utest/stepdefinitions"},
        features = {"src/test/resources/features/loguser.feature"}
)
public class LogUserRunner {
}
