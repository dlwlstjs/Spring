package kr.hs.study;

import kr.hs.study.beans.TestBeans1;
import kr.hs.study.beans.TestBeans2;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBeans2 obj = ctx.getBean("t2", TestBeans2.class);
        System.out.println(obj);
        ctx.close();
    }
}