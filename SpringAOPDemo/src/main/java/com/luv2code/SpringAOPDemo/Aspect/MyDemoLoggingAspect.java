package com.luv2code.SpringAOPDemo.Aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.luv2code.SpringAOPDemo.Account;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // @Before("combineForDaoGetterSetter()")
    // public void beforeAddingAccount() {
    // System.out.println("\n====> Code in this Aspect block will run @Before
    // running the addAccount().");
    // }

    @After("execution(* com.luv2code.SpringAOPDemo.Service.*.getFortune(..))")
    public Object aroundGetFortunObject(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        String method = theProceedingJoinPoint.getSignature().toShortString();
        System.out.println("Execution of @Around" + method);

        long begin = System.currentTimeMillis();

        Object result = theProceedingJoinPoint.proceed();

        long end = System.currentTimeMillis();

        long duretion = end - begin;

        System.out.println("Total time to run the method: " + duretion / 1000.0 + "seconds");

        return result;
    }

    // @AfterReturning(pointcut = "execution(*
    // com.luv2code.SpringAOPDemo.DAO.AccountDao.findAccounts(..))", returning =
    // "result" )
    // public void afterReturningFindAccountAdvices(JoinPoint theJoinPoint,
    // List<Account> result){
    // String method = theJoinPoint.getSignature().toShortString();
    // System.out.println("Running AfterReturning Module");

    // System.out.println(result);
    // }
}
