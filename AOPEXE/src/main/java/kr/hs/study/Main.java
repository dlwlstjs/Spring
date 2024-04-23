package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 obj = ctx.getBean("t1", TestBean1.class);
        kr.hs.study.beans2.TestBean1 obj2 = ctx.getBean("t2", kr.hs.study.beans2.TestBean1.class);
        obj.method1();
        obj.method1(30);
        obj.method1(30, 10);
        obj.method1("String");
        obj.method2();
        obj.method3();
        obj2.method1();
        ctx.close();
    }
}