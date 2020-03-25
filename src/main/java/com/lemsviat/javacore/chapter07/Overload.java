package main.java.com.lemsviat.javacore.chapter07;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob=new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result=ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): "+result);
    }
}
