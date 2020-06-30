package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alfa");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Xi");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Spliterator<String> splitr = myStream.spliterator();
        Spliterator<String> splitr2=splitr.trySplit(); //разделяем слитератор на два сплитератора
        if(splitr2 !=null) System.out.println("Результат, выводимый сплитератором splitr2:");
        splitr2.forEachRemaining((n) -> System.out.println(n));

        System.out.println("Результат, выводимый сплитератором splitr:");
        splitr.forEachRemaining((n) -> System.out.println(n));
    }
}
