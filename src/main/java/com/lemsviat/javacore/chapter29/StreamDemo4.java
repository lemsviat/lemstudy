package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        //отобразить квадратные корни элементов массива в новый поток данных
        Stream<Double> mappedList=myList.stream().map(a->Math.sqrt(a));
        //mappedList.forEach(n-> System.out.print(n+" "));
        //получить произведение элементов нового стрима
        double product=mappedList.reduce(1.0,(a,b)->a*b);
        System.out.println("Произведение квадратных корней элементов массива = " + product);
    }

}
