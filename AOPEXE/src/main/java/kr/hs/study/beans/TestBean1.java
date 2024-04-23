package kr.hs.study.beans;

public class TestBean1 {
    public void method1(){
        System.out.println("TestBean1의 method1");
    }
    public void method1(int num){
        System.out.println("TestBean1의 method1 : " + num);
    }
    public void method1(int num, int num2){
        System.out.println("TestBean1의 method1 : " + num + ", " + num2);
    }
    public void method1(String s){
        System.out.println("TestBean1의 method1 : " + s);
    }
    public void method2(){
        System.out.println("TestBean1의 method2");
    }
    public void method3(){
        System.out.println("TestBean1의 method3");
    }
}
