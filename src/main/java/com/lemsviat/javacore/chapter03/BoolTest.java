package main.java.com.lemsviat.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b=false;
        System.out.println("b равно " + b);
        b=true;
        System.out.println("b равно " + b);
        if (b) System.out.println("Этот код выполняется.");
        b=false;
        if (b) System.out.println("Этот не код выполняется");

        System.out.println("10>9 равно "+(10>9));


    }
}
