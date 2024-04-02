package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component("t2")
public class TestBeans2 {
    public TestBeans2(){
        System.out.println("기본생성자2");
    }
}
