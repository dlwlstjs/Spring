package kr.hs.study.beans;

public class TestBean {
    private int data1;
    private double data2;
    private Person p1;
    private Person p2;

    public int getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

    public Person getP1() {
        return p1;
    }

    public Person getP2() {
        return p2;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    public void pr(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(p1);
        System.out.println(p2);
    }
}
