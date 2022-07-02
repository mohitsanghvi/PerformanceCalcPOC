package com.example.PerformanceCalcPOC;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        classes = SpringCuckesApp.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class AOPAppRunner {
    //protected RestTemplate restTemplate = new RestTemplate();

    //protected final String DEFAULT_URL = "http://localhost:8082/";
}

