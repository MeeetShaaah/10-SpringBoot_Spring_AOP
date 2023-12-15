package com.luv2code.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    @Before("execution(void add*())")
    public void beforeAddingAccount() {
       System.out.println("\n====> Code in this Aspect block will run @Before running the addAccount()."); 
    }
}
