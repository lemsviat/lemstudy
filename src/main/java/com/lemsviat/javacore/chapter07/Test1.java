package main.java.com.lemsviat.javacore.chapter07;

public class Test1 {
    int a;
    public Test1(int a) {
        this.a = a;
    }
    Test1 incrByTen() {
        Test1 temp=new Test1(a+10);
        return temp;
    }
}
