package main.java.com.lemsviat.javacore.chapter09.p2;

import main.java.com.lemsviat.javacore.chapter09.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p= new Protection();
        System.out.println("Конструктор другого класса из другого пакета");
        //System.out.println("n = " + p.n); //default - доступно только для класса или внутри пакета
        //System.out.println("n_pri = " + p.n_pri); //доступно только внутри класса, так как private
        //System.out.println("n_pro = " + p.n_pro); //protected - доступно только для класса, подкласса или внутри пакета
        System.out.println("n_pub = " + p.n_pub);
    }
}
