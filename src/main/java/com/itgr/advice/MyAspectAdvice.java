package com.itgr.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAspectAdvice {

    @Pointcut("execution(* com.itgr.dao.UserDao.*(..))")
    public void pointCut(){

    }
    @AfterReturning("pointCut()")
    public void myAfterReturning(JoinPoint joinPoint) {
        System.out.println("切点方法名:"+joinPoint.getSignature().getName());
        System.out.println("目标对象:"+joinPoint.getTarget());
        System.out.println("打印日志:"+joinPoint.getSignature().getName()+"方法被执行了");
    }
    // 前置通知
    @Before("pointCut()")
    public void myBefore() {
        System.out.println("前置通知...");
    }

    // 异常通知
    @AfterThrowing(value="pointCut()",throwing = "ex")
    public void myAfterThrowing(Exception ex) {
        System.out.println("异常通知...");
        System.err.println(ex.getMessage());
    }

    // 最终通知
    @After("pointCut()")
    public void myAfter() {
        System.out.println("最终通知");
    }

    // 环绕通知
    @Around("pointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        Object obj = proceedingJoinPoint.proceed(); // 执行方法
        System.out.println("环绕后");
        return obj;
    }
}
