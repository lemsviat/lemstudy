package main.java.com.lemsviat.javacore.chapter09;

public class NestedIFDemo {
    public static void main(String[] args) {
        A3.NestedIF nif=new B3();
        if (nif.isNotNegative(10)) System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12)) System.out.println("Это не будет выведено, потому что условие false");
    }
}
