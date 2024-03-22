package org.example;

import kr.hs.beans.Animal;
import kr.hs.beans.Sheep;
import kr.hs.beans.cat;
import kr.hs.beans.dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Animal t1= ctx.getBean("cat", cat.class);
        Animal t2 = ctx.getBean("dog", dog.class);
        Animal t3 = ctx.getBean("sheep", Sheep.class);

        t1.eat();
        t1.live();

        t2.eat();
        t2.live();

        t3.eat();
        t3.live();

        ctx.close();
    }
}