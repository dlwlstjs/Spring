package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdviceClass1 {
    public void beforeMethod(){
        System.out.println("before");
    }
    public void afterMethod(){
        System.out.println("after");
    }
    public void aftereturningMethod(){
        System.out.println("return");
    }
    public void afterThrowing(Throwable e){
        System.out.println("예외발생");
        System.out.println(e);
    }
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before method");
        pjp.proceed();
        System.out.println("around after method");
    }
}
