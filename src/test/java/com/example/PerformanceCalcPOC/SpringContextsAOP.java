package com.example.PerformanceCalcPOC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "com.example.PerformanceCalcPOC" })
@EnableAspectJAutoProxy
public class SpringContextsAOP {
}
