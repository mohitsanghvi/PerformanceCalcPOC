package com.example.PerformanceCalcPOC;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Temp{

    @Before("execution(* com.example.PerformanceCalcPOC.steps.SearchbarSteps.*(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("BEFORE fHEREERDECDFVFFFDCDCFVFBGBGBFFRDCWVNJMJ<KJ");
    }
    /*
    @Pointcut(value="execution(* com.example.PerformanceCalcPOC.steps.*(..))")
    public void pointCut()
    {

    }

    @Around("pointCut")
    public Object stepLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("method: "+pjp.getSignature().getName());
        System.out.println("Here@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Object object=pjp.proceed();
        System.out.println("method end: "+pjp.getSignature().getName());
        System.out.println("There@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return object;
    }*/
}
