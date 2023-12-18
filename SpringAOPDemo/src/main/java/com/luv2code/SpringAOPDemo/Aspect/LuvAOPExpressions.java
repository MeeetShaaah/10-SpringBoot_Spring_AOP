package com.luv2code.SpringAOPDemo.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAOPExpressions {
    
     @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.*(..)))")
    public void forDaoPackage(){}

    @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.get*(..)))")
    public void getters(){}

    @Pointcut("execution(* com.luv2code.SpringAOPDemo.DAO.*.set*(..)))")
    public void setters(){}

    @Pointcut("forDaoPackage() && !(getter() || setters())")
    public void combineForDaoGetterSetter(){}

}
