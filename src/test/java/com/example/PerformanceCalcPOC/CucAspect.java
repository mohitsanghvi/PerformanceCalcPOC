package com.example.PerformanceCalcPOC;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
@EnableAspectJAutoProxy
class CucAspect {

    @Before("execution(* com.example.PerformanceCalcPOC.steps.*.*(..)) || execution(* com.example.PerformanceCalcPOC.businessLayer.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.print("Before ##### ");
        System.out.print(joinPoint.getSignature().getName() + " called with ");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut = "execution(* com.example.PerformanceCalcPOC.steps.*.*(..)) || execution(* com.example.PerformanceCalcPOC.businessLayer.*.*(..))", returning = "result")
    public void after(JoinPoint joinPoint, Object result) {
        System.out.print("After #### ");
        System.out.print(joinPoint.getSignature().getName());
        System.out.println(" result is " + result);
    }

}
