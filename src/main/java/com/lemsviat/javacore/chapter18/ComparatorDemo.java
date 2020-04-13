package main.java.com.lemsviat.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        //можно любым из этих методов
        //TreeSet<String> ts = new TreeSet<>(new MyComparator()); //кастомный компаратор
        //TreeSet<String> ts = new TreeSet<>((a,b)->b.compareTo(a)); //компаратор, созданный лямбда выражением
        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder()); //компаратор с обратной сортировкой

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element: ts) {
            System.out.println("element = " + element);
        }
    }
}
