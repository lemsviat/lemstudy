package main.java.com.lemsviat.javacore.chapter18;

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer>exampleCollection=new ArrayList<>();
        exampleCollection.add(1);
        exampleCollection.add(2);
        exampleCollection.add(3);
        exampleCollection.add(4);
        System.out.println("Content of arraylist exampleCollection: "+exampleCollection); //all collections support toString
        exampleCollection.forEach(n-> System.out.println("n = " + n)); //using lambda expressions
        exampleCollection.forEach(System.out::println); //using lambda expressions

        Integer[] simpleArray=new Integer[exampleCollection.size()];
        simpleArray=exampleCollection.toArray(simpleArray);
        int sum=0;
        for (int i:simpleArray) {
            sum=sum+i;
        }
        System.out.println(Arrays.toString(simpleArray)); //печать обычных массивов производится через оператор Arrays.toString()

        for (Integer integer : simpleArray) {
            System.out.print("( "+integer+" )");
        }
        System.out.println();
        System.out.println("Sum: "+sum);

        Set<Integer> si=new TreeSet<>();
                si.add(5);
                si.add(32);
                si.add(16);
                si.add(10);
                si.forEach(System.out::println);


    }
}
