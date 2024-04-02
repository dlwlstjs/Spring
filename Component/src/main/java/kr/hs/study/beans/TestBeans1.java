package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component //객체를 생성하는 어노테이션
public class TestBeans1 {
    public TestBeans1(){
        System.out.println("TestBean1의 기본생성자");
    }

}
