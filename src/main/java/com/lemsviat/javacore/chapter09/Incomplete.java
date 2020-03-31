package main.java.com.lemsviat.javacore.chapter09;

public abstract class Incomplete implements Callback{
    int a,b;
    void show(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
