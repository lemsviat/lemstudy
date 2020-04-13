package main.java.com.lemsviat.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        ComparatorLastNames comparatorLastNames=new ComparatorLastNames();
        ComparatorFirstName comparatorFirstName=new ComparatorFirstName();

        Map<String, Double> treeMap = new TreeMap<String, Double>(comparatorLastNames.thenComparing(comparatorFirstName));
        treeMap.put("Джон Доу", 3434.34);
        treeMap.put("Том Смит", 123.22);
        treeMap.put("Джейн Бейкер", 1378.00);
        treeMap.put("Тод Холл", 99.22);
        treeMap.put("Ральф Смит", -19.08);
        treeMap.forEach((k, v) -> System.out.println("k,v = " + k + ": " + v)); //принт с помощью лямбда выражения

        Set<Map.Entry<String, Double>> set = treeMap.entrySet();
        for (Map.Entry<String, Double> pair : set) {
            System.out.println("Key = " + pair.getKey() + ", Value = " + pair.getValue());
        }
    }
}
