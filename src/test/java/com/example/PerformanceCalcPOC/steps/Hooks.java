package com.example.PerformanceCalcPOC.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
public class Hooks {

    private static long exeStartTime,exeEndTime;
    private static float totalExecTimeInSec;


    @Before
    public void beforeScenario(){
        System.out.println("\n$$$$$ Before Scenario Hook executing $$$$$");
        testExecStartTimeCapture();
    }

    @After
    public void afterScenario(){
        System.out.println("\n$$$$$ After Scenario Hook executing $$$$$");
        System.out.println("#### TOTAL EXECUTION TIME(In Seconds): "+totalExecTimeInSec+" ####");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("\n$$$$$ Before Step Hook executing $$$$$");
        testExecStartTimeCapture();
    }

    @AfterStep
    public void afterStep(){
        System.out.println("$$$$$ After Step Hook executing $$$$$");
        testExecEndTimeCapture();
        totalExecTimeInSec=totalExecTimeInSec+calculateExecutionTimePerCase();
    }


    private void testExecStartTimeCapture(){
        exeStartTime = System.currentTimeMillis();
        System.out.println("#### Execution started at:" + exeStartTime +" ####");
    }

    private void testExecEndTimeCapture(){
        exeEndTime = System.currentTimeMillis();
        System.out.println("#### Execution ended at:" + exeEndTime+" ####");
    }

    private float calculateExecutionTimePerCase(){
        float stepExecTimeInSec = (exeEndTime-exeStartTime)/1000F;
        System.out.println("#### STEP EXECUTION TIME(In Seconds): "+stepExecTimeInSec+" ####");
        return stepExecTimeInSec;
    }
}


 */