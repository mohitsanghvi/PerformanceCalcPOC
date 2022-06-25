package com.example.PerformanceCalcPOC;

import java.util.Arrays;

import com.example.PerformanceCalcPOC.steps.SearchbarSteps;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = { "com.example.PerformanceCalcPOC" })
class SpringContextsAOP {
}

@Aspect
@Component
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContextsAOP.class)
public class AopRunner{
    @Autowired
    private SearchbarSteps searchbarsteps;

    @Test
    public void testSome() {
         searchbarsteps.userIsOnHomePage();
    }
}
