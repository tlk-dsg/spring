package com.tlk.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.tlk.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========Before Running=========");
    }
    @After("execution(* com.tlk.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========After Running=========");
    }
    @Around("execution(* com.tlk.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("Before around");
        Object proceed = jp.proceed();
        System.out.println("After around");

    }
}
