package main.java.com.lemsviat.javacore.chapter18;

import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String,Double> hashtable=new Hashtable<>();
        hashtable.put("Джон Доу", 3434.34);
        hashtable.put("Том Смит", 123.22);
        hashtable.put("Джейн Бейкер", 1378.00);
        hashtable.put("Тод Холл", 99.22);
        hashtable.put("Ральф Смит", -19.08);
        hashtable.forEach((k,v)-> System.out.println("k,v = " + k+": "+v)); //принт с помощью лямбда выражения

        Set<Map.Entry<String,Double>> set= hashtable.entrySet();
        for (Map.Entry<String,Double> pair:set) {
            System.out.println("Key = " + pair.getKey()+", Value = "+pair.getValue());
        }
        double balance =hashtable.get("Джон Доу");
        hashtable.put("Джон Доу", balance+1000);
        System.out.println("New balance of John Dou = " + hashtable.get("Джон Доу"));

        Enumeration<String> names;
        String name;
        double bal;
        names=hashtable.keys();
        while (names.hasMoreElements()){
            name=names.nextElement();
            System.out.print(name+": "+hashtable.get(name));
            System.out.println();
        }


    }
}
