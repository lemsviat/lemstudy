package main.java.com.lemsviat.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d=323.142;

        System.out.println("\n Преобразование типа int в тип byte");
        b= (byte) i;
        System.out.println(" i и Ь " + i + " " + b);

        System.out.println("\n Преобразование типа double в тип int");
        i= (int) d;
        System.out.println(" d и i " + d + " " + i);

        System.out.println("\n Преобразование типа double в тип byte");
        b= (byte) d;
        System.out.println(" d и Ь " + d + " " + b);
    }
}
