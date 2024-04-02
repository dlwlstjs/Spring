package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private DataBean1 data3;

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public void setData3(DataBean1 data3) {
        this.data3 = data3;
    }
    public void pr(){
        System.out.println(this.data1);
        System.out.println(this.data2);
        System.out.println(this.data3);
    }
}
