package kr.hs.study.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("t1")
public class TestBean1 {
    //생성자에는 넣지 말자ㅠㅠㅠ
    public TestBean1(){
        System.out.println("생성자");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("생성자 실행 후에 자동으로 실행되는 메소드");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("객체 소멸될 때 자동으로 실행되는 메서드");
    }
}