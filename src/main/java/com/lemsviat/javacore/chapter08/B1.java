package main.java.com.lemsviat.javacore.chapter08;

public class B1 extends superA {
    int i; //эта переменная "і" скрывает переменную "і" суперкласса
    B1(int a, int b) {
        super.i=a;
        i=b;
    }
    void show() {
        System.out.println("Элемент i в суперклассе: "+super.i);
        System.out.println("Элемент i в подклассе: "+i);
    }
}
