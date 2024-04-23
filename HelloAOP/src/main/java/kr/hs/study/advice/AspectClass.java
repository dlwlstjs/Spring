package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass {
    public void AfterMethod(){
        System.out.println("after");
    }
    public void BeforeMethod(){
        System.out.println("before");
    }
    public void ReturnMethod(){
        System.out.println("return");
    }
    public void ThorwingMethod(Throwable e){
        System.out.println("Thorwing");
    }
    public void AroundMethod(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("around before");
        pjp.proceed();
        System.out.println("around after");
    }
}
