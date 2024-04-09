package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Guest {
    private int reservation;
    private int member;
    private String name;

    public Guest(){
        this.reservation = 1;
        this.member = 3;
        this.name = "jin";
    }

    public int getReservation() {
        return reservation;
    }

    public int getMember() {
        return member;
    }

    public String getName() {
        return name;
    }
}
