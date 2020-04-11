package main.java.com.lemsviat.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> hm=new HashMap<>();
        hm.put("Джон Доу", 3434.34);
        hm.put("Том Смит", 123.22);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Холл", 99.22);
        hm.put("Ральф Смит", -19.08);
        hm.forEach((k,v)-> System.out.println("k,v = " + k+": "+v)); //принт с помощью лямбда выражения

        Set<Map.Entry<String,Double>> set= hm.entrySet();
        for (Map.Entry<String,Double> pair:set) {
            System.out.println("Key = " + pair.getKey()+", Value = "+pair.getValue());
        }
        double balance =hm.get("Джон Доу");
        hm.put("Джон Доу", balance+1000);
        System.out.println("New balance of John Dou = " + hm.get("Джон Доу"));

    }
}
