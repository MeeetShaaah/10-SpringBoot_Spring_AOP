package com.luv2code.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.*(..)))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.get*(..)))")
    private void getters(){}

    @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.set*(..)))")
    private void setters(){}

    @Pointcut("forDaoPackage() && !(getter() || setters())")
    private void combineForDaoGetterSetter(){}

    @Before("combineForDaoGetterSetter()")
    public void beforeAddingAccount() {
       System.out.println("\n====> Code in this Aspect block will run @Before running the addAccount()."); 
    }
}

