package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
    @Autowired
    private DataBean1 data1;
    public void TestBean1(){
        System.out.println("TestBean1의 기본 생성자");
    }

//    public void setData1(DataBean1 data1) {
//        this.data1 = data1;
//    }

    public DataBean1 getData1() {
        return data1;
    }
}
