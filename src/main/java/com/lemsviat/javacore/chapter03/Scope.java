package main.java.com.lemsviat.javacore.chapter03;

public class Scope {
    public static void main(String[] args) {
        int x; // available in all method main
        x=10;
        if (x==10){ //start new area
            int y=20;
            //available x, y
            System.out.println("x и y: " + x+ " "+y);
            x=y*2;
        }
        //y=100; out of scope! error during compiling!
        System.out.println("x равно: " + x);
    }
}
