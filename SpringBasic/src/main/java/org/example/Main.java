package org.example;

import kr.hs.study.beans.Testbean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
//        Testbean obj1 = ctx.getBean(Testbean.class);
//        Testbean obj2 = ctx.getBean("t2", Testbean.class);
//        System.out.println(obj1);

Testbean obj3 = ctx.getBean("t3", Testbean.class);
Testbean obj4 = ctx.getBean("t4", Testbean.class);
        ctx.close();

    }
}