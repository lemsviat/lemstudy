package main.java.com.lemsviat.javacore.chapter13;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("Это строка");
        int i=-7;
        pw.println(i);
        pw.println(4.5e-7);
    }
}
