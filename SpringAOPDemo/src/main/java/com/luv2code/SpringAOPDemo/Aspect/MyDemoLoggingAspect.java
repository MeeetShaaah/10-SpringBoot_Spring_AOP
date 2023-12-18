package com.luv2code.SpringAOPDemo.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.luv2code.SpringAOPDemo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // @Before("combineForDaoGetterSetter()")
    // public void beforeAddingAccount() {
    //    System.out.println("\n====> Code in this Aspect block will run @Before running the addAccount()."); 
    // }

    @AfterReturning(pointcut = "execution(* com.luv2code.SpringAOPDemo.DAO.AccountDao.findAccounts(..))", returning = "result" )
    public void afterReturningFindAccountAdvices(JoinPoint theJoinPoint, List<Account> result){
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("Running AfterReturning Module");

        System.out.println(result);
    }
}

