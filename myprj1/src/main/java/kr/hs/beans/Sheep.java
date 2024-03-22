package kr.hs.beans;

public class Sheep implements Animal{
    @Override
    public void eat() {
        System.out.println("sheep이 eat");
    }

    @Override
    public void live() {
        System.out.println("sheep이 live");
    }
}
