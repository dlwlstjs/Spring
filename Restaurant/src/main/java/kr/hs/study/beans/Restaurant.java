package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Restaurant {
    @Autowired
    private Chef chef;
    @Autowired
    private Order order;
    @Autowired
    private Guest guest;

    public void pr(){
        System.out.println("chef's name : " + chef.getName());
        System.out.println("chef's age : " + chef.getAge());
        System.out.println("Order menu : " + order.getMenu());
        System.out.println("Order drink : " + order.getDrink());
        System.out.println("Guest drink : " + guest.getReservation());
        System.out.println("Guest drink : " + guest.getMember());
        System.out.println("Guest drink : " + guest.getName());
    }
}
