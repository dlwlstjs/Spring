package hs.kr.beans;
public class TestBean5 {
    public TestBean5(){}

    public void init(){
        System.out.println("생성자실행후에 자동으로 호출되게 하는 메서드 옵션");
    }
    public void destroy(){
        System.out.println("객체소멸시(ctx.close) 자동으로 호출되게 하는 메서드 옵션");
    }
}
