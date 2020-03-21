package main.java.com.lemsviat.javacore.chapter04;

public class Ternary {
    public static void main(String[] args) {
        int i,k;
        i=10;
        k=i<0?-i:i; // получения абсолютного значения i
        System.out.println("Абсолютное значение "+i+" равно "+k);

        i=-10;
        k=i<0?-i:i; // получения абсолютного значения i
        System.out.println("Абсолютное значение "+i+" равно "+k);

    }
}
