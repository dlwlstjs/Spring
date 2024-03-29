package kr.hs.study;

import hs.kr.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean1 t1 = ctx.getBean("t", TestBean1.class);
        System.out.println(t1);
        ctx.close();
    }
}