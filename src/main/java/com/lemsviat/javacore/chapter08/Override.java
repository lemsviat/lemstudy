package main.java.com.lemsviat.javacore.chapter08;

public class Override {
    public static void main(String[] args) {
        B subOb=new B(1,2,3);
        subOb.show1();
        System.out.println();

        subOb.show2();
        System.out.println();

        subOb.show1("Это к: ");
    }
}
