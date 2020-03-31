package main.java.com.lemsviat.javacore.chapter09.p2;

import main.java.com.lemsviat.javacore.chapter09.p1.Protection;

public class Protection2 extends Protection {
    public Protection2() {
        System.out.println("Конструктор наследника класса из другого пакета");
        //System.out.println("n = " + n); //default - доступно только для класса или внутри пакета
        //System.out.println("n_pri = " + n_pri); //private - доступно только для данного класса
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
