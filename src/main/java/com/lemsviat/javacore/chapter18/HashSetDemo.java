package main.java.com.lemsviat.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Beta");
        stringHashSet.add("Alfa");
        stringHashSet.add("Eta");
        stringHashSet.add("Gamma");
        stringHashSet.add("Epsilon");
        stringHashSet.add("Omega");

        System.out.println(stringHashSet); //все коллекции хорошо печатаюся напрямую

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Beta");
        linkedHashSet.add("Alfa");
        linkedHashSet.add("Eta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Epsilon");
        linkedHashSet.add("Omega");
        System.out.println("linkedHashSet = " + linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Beta");
        treeSet.add("Alfa");
        treeSet.add("Eta");
        treeSet.add("Gamma");
        treeSet.add("Epsilon");
        treeSet.add("Omega");
        System.out.println("treeSet = " + treeSet);
        System.out.println("part of treeSet = " + treeSet.subSet("Epsilon","Gamma"));
    }
}