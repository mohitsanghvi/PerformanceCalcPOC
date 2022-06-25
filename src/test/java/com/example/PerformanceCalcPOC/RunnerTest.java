package com.example.PerformanceCalcPOC;

import com.example.PerformanceCalcPOC.steps.SearchbarSteps;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "com/example/PerformanceCalcPOC/steps")
public class RunnerTest {

}