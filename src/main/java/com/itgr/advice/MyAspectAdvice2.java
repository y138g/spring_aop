package com.itgr.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//通知类2
public class MyAspectAdvice2 {
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("联系邮件:1259737090@qq.com");
    }
}
