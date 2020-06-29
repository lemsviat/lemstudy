package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("исходный список "+myList);

        //получаем поток єлементов массива
        Stream<Integer> myStream=myList.stream();
        
        //получаем минимальное и максимальное значения
        Optional<Integer> minVal= myStream.min(Integer::compareTo);
        minVal.ifPresent(integer -> System.out.println("minVal = " + integer));

        // непременно нужно получить новый поток данных , поскольку
        //предыдущий вызов метода min ( ) стал оконечной операцией, употребившей поток данных
        myStream=myList.stream();
        Optional<Integer> maxVal= myStream.max(Integer::compareTo);
        maxVal.ifPresent(integer -> System.out.println("maxVal = " + integer));

        //сортируем данные
        Stream<Integer> sortedStream=myList.stream().sorted();
        //печатаем отсортированный поток данных
        System.out.println("Отсортированные поток данных: ");
        sortedStream.forEach(n-> System.out.print(n+" "));
        System.out.println();

        // вывести только нечетные целочисленные значения, вызвав метод filter ()
        Stream<Integer>oddVals=myList.stream().sorted().filter(n->(n%2)==1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach(n-> System.out.print(n+" "));
        System.out.println();
        // вывести только те нечетные целочисленные значения,
        // которые больше 5 . Обратите внимание на конвейеризацию
        //обеих операций фильтрации
        oddVals=myList.stream().sorted().filter(n->(n%2)==1).filter(n->n>5);
        System.out.print("Нечетные значения больше 5: ");
        oddVals.forEach(n-> System.out.print(n+" "));
        System.out.println();
    }

}
