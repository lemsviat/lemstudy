package main.java.com.lemsviat.javacore.chapter07;

public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }
        //перегружаемые методы
    void test (int a) {
        System.out.println("a = " + a);
    }

    void test (int a, int b) {
        System.out.println("a и b " + a+" "+b);
    }

    double test (double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
