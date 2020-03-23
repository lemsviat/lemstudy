package main.java.com.lemsviat.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t=true;
        System.out.println("До оператора return");
        if (t) return;
        System.out.println("Этот оператор выполняться не будет");
    }
}
