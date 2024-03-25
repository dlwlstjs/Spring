package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;
    private boolean data4;
    private TestBean2 data5;

    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

    public String getData3() {
        return data3;
    }

    public boolean isData4() {
        return data4;
    }

    public TestBean2 getData5() {
        return data5;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public void setData4(boolean data4) {
        this.data4 = data4;
    }

    public void setData5(TestBean2 data5) {
        this.data5 = data5;
    }
    public void pr(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);
    }

}
