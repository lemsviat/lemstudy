package main.java.com.lemsviat.javacore.chapter07;


import org.jetbrains.annotations.NotNull;

public class VarArgs {
    static void vaTest (@NotNull int ... v) {
        System.out.print("Quantity of arguments: "+v.length+" Insight: ");
        for (int x: v)
            System.out.print(x+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
