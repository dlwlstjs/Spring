package kr.hs.study.beans;

public class TestBean {
    private int data1;
    private double data2;
    private DataBean1 data3;
    private DataBean2 data4;

    public TestBean(int data1, double data2, DataBean1 data3, DataBean2 data4){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }
    public void prdata(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
    }
}
