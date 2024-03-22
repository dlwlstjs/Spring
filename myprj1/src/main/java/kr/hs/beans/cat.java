package kr.hs.beans;

public class cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat이 eat");
    }

    @Override
    public void live() {
        System.out.println("Cat이 live");
    }
}
