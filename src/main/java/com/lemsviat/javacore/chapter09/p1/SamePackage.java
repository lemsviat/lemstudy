package main.java.com.lemsviat.javacore.chapter09.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор этого же пакета");
        System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri); //доступно только внутри класса, так как private
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
