package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
    @Autowired
    @Qualifier("d1")
    private DataBean1 data1;

    @Autowired
    private DataBean1 data2;//setData1()

    public DataBean1 getData1() {
        return data1;
    }

    public DataBean1 getData2() {
        return data2;
    }

    public void pr(){
        System.out.println(data1);
        System.out.println(data2);
    }

    //자동주입x
    //data1, data2에 값을 주입해서 main에서 출력시키기

}
