package main.java.com.lemsviat.javacore.chapter07;

import org.jetbrains.annotations.NotNull;

public class PassArray {
    static void vaTest (@NotNull int[] v) {
        System.out.print("Quantity of arguments: "+v.length+" Insight: ");
        for (int x:
             v)
            System.out.print(x+" ");
            System.out.println();
    }
    public static void main(String[] args) {
     int[] n1 ={10};
     int[] n2 ={1,2,3,};
     int[] n3 ={};

     vaTest(n1);
     vaTest(n2);
     vaTest(n3);
    }
}
