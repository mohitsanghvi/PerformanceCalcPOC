package com.example.PerformanceCalcPOC;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "com/example/PerformanceCalcPOC/steps")
public class RunnerTest {

}