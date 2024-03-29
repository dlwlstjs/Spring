package hs.kr.study.config;


import hs.kr.study.beans.TestBean1;
import hs.kr.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {
    //스프링에게 명령을 내리는 설정파일
    @Bean
    public TestBean1 java1(){
        TestBean1 t1 = new TestBean1();
        return t1;
    }
    @Bean(name = "new")
    public TestBean2 java2(){
        return new TestBean2();
    }
}
