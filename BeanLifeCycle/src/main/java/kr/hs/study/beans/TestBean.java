package kr.hs.study.beans;

public class TestBean {
    public TestBean(){
        System.out.println("기본생성자");
    }
    public void initMethod(){
        System.out.println("생성자 실행 후 자동 실행되는 메서드");
    }
    
    public void destroyMethod(){
        System.out.println("객체소멸할 때 자동으로 실행되는 메소드");
    }
}
