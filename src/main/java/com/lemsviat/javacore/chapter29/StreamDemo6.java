package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        System.out.println("Исходные значения из myList: ");
        myList.stream().forEach(a-> System.out.print(a+" "));
        System.out.println();

        //округляем кажый элемент до большего целого
        IntStream cStrm=myList.stream().mapToInt(a-> (int) Math.ceil(a));
        System.out.println("Округленные до большего значения из myList: ");
        cStrm.forEach(a-> System.out.print(a+" "));
        System.out.println();
    }
}
