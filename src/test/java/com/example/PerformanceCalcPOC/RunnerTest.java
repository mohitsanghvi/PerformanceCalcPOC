package com.example.PerformanceCalcPOC;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "com/example/PerformanceCalcPOC/steps")
public class RunnerTest{
}