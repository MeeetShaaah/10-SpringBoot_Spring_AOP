package com.luv2code.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    @Before("execution(public void addAccount())")
    public void beforeAddingAccount() {
       System.out.println("\n====> Code in this block will run @Before running the addAccount()."); 
    }
}
