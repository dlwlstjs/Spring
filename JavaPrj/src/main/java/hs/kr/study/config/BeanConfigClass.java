package hs.kr.study.config;


import hs.kr.study.beans.TestBean1;
import hs.kr.study.beans.TestBean2;
import hs.kr.study.beans.TestBean3;
import hs.kr.study.beans.TestBean4;
import org.springframework.context.annotation.*;

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

    @Bean(name = "a3")
    @Lazy
    @Scope("prototype")
    public TestBean3 java3(){
        return new TestBean3();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
//    @Scope("prototype")
//    @Primary //우선적으로 가져옴
    public TestBean4 java5(){
        return new TestBean4();
    }
}
