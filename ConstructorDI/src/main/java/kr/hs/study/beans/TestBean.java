package kr.hs.study.beans;

public class TestBean {
    int data1;
    double data2;
    String data3;

    public  TestBean(){
        this.data1 = 11;
        this.data2 = 11.11;
        this.data3 = "Mike11";
    }

    public TestBean(int data1){
        System.out.println("obj2");
        this.data1 = data1;
        this.data2 = 22.22;
        this.data3 = "Mike22";
    }

    public TestBean(double data2){
        System.out.println("obj3");
        this.data1 = 33;
        this.data2 = data2;
        this.data3 = "Mike33";
    }

    public TestBean(String data3){
        System.out.println("obj4");
        this.data1 = 44;
        this.data2 = 44.44;
        this.data3 = data3;
    }

    public TestBean(int data1, double data2, String data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void prData(){
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}
