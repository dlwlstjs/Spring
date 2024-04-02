package kr.hs.study.beans;

import org.springframework.context.annotation.Configuration;
@Configuration
public class TestBean2 {
    public TestBean1 java1(){
        TestBean1 t = new TestBean1(11, "mark", new DataBean1());
        return t;
    }

}
