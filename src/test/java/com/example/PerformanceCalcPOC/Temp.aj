package com.example.PerformanceCalcPOC;

public aspect Temp{

    pointcut greeting() : execution(* com.example.PerformanceCalcPOC.steps.*.*(..));

    after() returning() : greeting(){
        System.out.println("WWWWWWWW");
    }

}