package kr.hs.beans;

public class dog implements Animal{
    @Override
    public void eat() {
        System.out.println("dog가 eat");
    }

    @Override
    public void live() {
        System.out.println("dog가 live");
    }
}
