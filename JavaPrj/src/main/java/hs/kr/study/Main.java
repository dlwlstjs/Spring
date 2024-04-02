package hs.kr.study;

import hs.kr.study.beans.TestBean1;
import hs.kr.study.beans.TestBean2;
import hs.kr.study.beans.TestBean3;
import hs.kr.study.beans.TestBean4;
import hs.kr.study.config.BeanConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        //ApplicationContext c = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        //부모의 참조변수로 자식객체를 생성한다.
        //.java파일을 읽어서 객체를 만들고 스프링 컨테이너(Ioc Conatainner)에 넣는다.

        //ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
        //classpath(resourse)를 찾아서 xml을 읽어오고 객체를 생성하여 IoC contain에 넣는다.

//        TestBean1 obj2 = ctx.getBean("java1", TestBean1.class);
//        System.out.println(obj2);
//
//        TestBean2 obj3 = ctx.getBean("new", TestBean2.class);
//        System.out.println(obj3);
//
//        TestBean3 obj4 = ctx.getBean("a3", TestBean3.class);
//        System.out.println(obj3);

        TestBean4 obj5 = ctx.getBean(TestBean4.class);
        System.out.println(obj5);

//        TestBean4 obj6 = ctx.getBean("t4", TestBean4.class);
//        System.out.println(obj6);
        ctx.close();
    }
}