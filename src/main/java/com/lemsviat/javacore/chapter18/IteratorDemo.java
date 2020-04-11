package main.java.com.lemsviat.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        System.out.println("Исходный массив a1 = " + a1);

        Iterator<String> itr = a1.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            //System.out.print(element+ " ");
        }
        //System.out.println();

        ListIterator<String> litr = a1.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Измененный массив a1 = " + a1);
        System.out.print("Развернутый массив a1: ");
        while (litr.hasPrevious()) {
            String element1 = litr.previous();
            litr.set(element1 + "2");
            System.out.print(element1+" ");
        }
        //System.out.println("Развернутый массив a1 = " + a1);
    }
}
