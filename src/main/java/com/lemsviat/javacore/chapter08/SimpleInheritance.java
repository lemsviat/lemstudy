package main.java.com.lemsviat.javacore.chapter08;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb=new A();
        B subOb=new B();

        superOb.i=10;
        superOb.j=20;
        System.out.println("superOb has: ");
        superOb.showij();
        System.out.println();

        subOb.i=7; // наследник видит переменные и методы суперкласса, если они не private
        subOb.j=8;
        subOb.k=9;
        System.out.println("subOb has: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum i, j,k in subOb: ");
        subOb.sum();
    }
}
