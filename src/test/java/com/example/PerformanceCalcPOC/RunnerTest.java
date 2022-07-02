package com.example.PerformanceCalcPOC;

import com.example.PerformanceCalcPOC.steps.SearchbarSteps;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        glue = "com/example/PerformanceCalcPOC/steps")
public class RunnerTest{

/*
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContextsAOP.class);
        SearchbarSteps searchbarobj =context.getBean(SearchbarSteps.class);


        searchbarobj.userIsOnHomePage();
        searchbarobj.userSearchesFor("Macbook");
        searchbarobj.verifyMatchingOptions();

    }

 */




}