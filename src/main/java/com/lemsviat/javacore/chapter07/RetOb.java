package main.java.com.lemsviat.javacore.chapter07;

public class RetOb {
    public static void main(String[] args) {
        Test1 ob1=new Test1(2);
        Test1 ob2;

        ob2=ob1.incrByTen();
        System.out.println("ob1.a = " + ob1.a);
        System.out.println("ob2.a = " + ob2.a);

        ob2=ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
