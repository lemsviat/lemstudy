package main.java.com.lemsviat.javacore.chapter09.p1;

public class Derived extends Protection{
    Derived(){
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);
        //System.out.println("n_pri = " + n_pri); //доступно только внутри класса, так как private
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
