package kr.hs.study.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TestBean tb = new TestBean(55, 55.55, "Mike55");


        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        TestBean obj3 = ctx.getBean("t3", TestBean.class);
        TestBean obj4 = ctx.getBean("t4", TestBean.class);
        TestBean obj5 = ctx.getBean("t5", TestBean.class);

        obj1.prData();
        obj2.prData();
        obj3.prData();
        obj4.prData();
        tb.prData();
        obj5.prData();


        ctx.close();
    }
}