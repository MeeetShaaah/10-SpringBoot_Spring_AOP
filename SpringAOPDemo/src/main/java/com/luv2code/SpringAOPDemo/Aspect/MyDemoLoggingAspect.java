package com.luv2code.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(public void com.luv2code.SpringAOPDemo.DAO.*.*(*)))")
    private void pointCutDeclaration(){}

    @Before("pointCutDeclaration()")
    public void beforeAddingAccount() {
       System.out.println("\n====> Code in this Aspect block will run @Before running the addAccount()."); 
    }
}
