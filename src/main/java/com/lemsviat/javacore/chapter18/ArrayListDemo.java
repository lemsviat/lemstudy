package main.java.com.lemsviat.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        System.out.println("Initial size of array a1: "+a1.size());

        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1,"A2");
        System.out.println("Size of array a1 after add-operations: "+a1.size());

        System.out.println("Content of a1: "+a1); //all collections support toString

        a1.remove("F");
        a1.remove(2);

        System.out.println("Size of array a1 after remove-operations: "+a1.size());
        System.out.println("Content of a1: "+a1);

    }
}
