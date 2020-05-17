package main.java.com.lemsviat.javacore.chapter20;

import java.io.Serializable;

public class MyClass5 implements Serializable {
    String s;
    int i;
    double d;

    public MyClass5(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s= " + s + "i; = " + i + "; d=" + d;
    }
}
