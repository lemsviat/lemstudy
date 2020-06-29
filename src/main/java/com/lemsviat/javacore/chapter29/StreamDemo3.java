package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double>myList=new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        //вычисляем произведение квадратных корней всех элементов
        double product=myList.parallelStream().reduce(1.0, (a,b)->a*Math.sqrt(b),(a,b)->a*b);
        System.out.println("произведение квадратных корней элементов массива = " + product);
    }
}
