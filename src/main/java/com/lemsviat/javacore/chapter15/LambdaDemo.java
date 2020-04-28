package main.java.com.lemsviat.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum=()->123.45; //лямбда реализует метод интерфейса MyNumber
        System.out.println("myNum = " + myNum.getValue());

        myNum=()->Math.random()*100;

        Runnable r = () -> System.out.println("hello world");
        r.run();

        System.out.println("Первое случайное число = " + myNum.getValue());
        System.out.println("Еще одно случайное число = " + myNum.getValue());
    }
}
