package kr.hs.study.beans;

public class TestBean1 {
    public TestBean1(){
        int data1;
        String data2;
        DataBean1 data3;
    }

    public TestBean1(int i, String mark, DataBean1 dataBean1) {
        System.out.println(i);
        System.out.println(mark);
        System.out.println(dataBean1);
    }
}
