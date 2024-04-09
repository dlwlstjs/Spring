package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order {
    private String menu;
    private String drink;

    public Order(String menu, String drink){
        this.menu = menu;
        this.drink = drink;
    }

    public String getMenu() {
        return menu;
    }

    public String getDrink() {
        return drink;
    }
}
