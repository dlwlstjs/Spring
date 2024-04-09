package kr.hs.study;

import kr.hs.study.beans.Chef;
import kr.hs.study.beans.Guest;
import kr.hs.study.beans.Order;
import kr.hs.study.beans.Restaurant;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        Chef obj = ctx.getBean(Chef.class,"ken", 30);
        Order obj2 = ctx.getBean(Order.class,"steak", "juice");
        Guest obj3 = ctx.getBean(Guest.class);
        Restaurant r1 = ctx.getBean(Restaurant.class);
        r1.pr();
        ctx.close();
    }
}