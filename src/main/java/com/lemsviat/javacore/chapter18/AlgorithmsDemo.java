package main.java.com.lemsviat.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);
        linkedList.add((int) (Math.random()*50));

        Comparator<Integer> comparator= Collections.reverseOrder();
        Collections.sort(linkedList);
        System.out.println("linkedList = " + linkedList);
        Collections.sort(linkedList,comparator);
        System.out.println("Reversed list by comparator = " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("Shuffled  list = " + linkedList);

        System.out.println("Min= "+Collections.min(linkedList));
        System.out.println("Max= "+Collections.max(linkedList));

    }
}
