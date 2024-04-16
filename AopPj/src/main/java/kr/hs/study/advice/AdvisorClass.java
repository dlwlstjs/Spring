package kr.hs.study.advice;

//삽입될 메서드들이(advice)들이 있는 클래스
public class AdvisorClass {
    public void beforeMethod(){
        System.out.println("beforeMethod 먼저 실행");
    }
    public void afterMethod(){
        System.out.println("afterMethod 나중 실행");
    }
    public void returningMethod() {
        System.out.println("after-returningMethod 리턴될 때 실행");
    }
}
