package main.java.com.lemsviat.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals=new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        System.out.println("Исходный массив vals = " + vals);

        System.out.println("Массив vals, напечатанный сплитератором: ");
        Spliterator<Double> spliterator= vals.spliterator();
        while (spliterator.tryAdvance(n-> System.out.println("n = " + n)));

        System.out.println("Массив корней квадратных из vals, напечатанный сплитератором: ");
        spliterator= vals.spliterator();
        while (spliterator.tryAdvance(n-> System.out.println("n = " + Math.sqrt(n))));

        System.out.println("Массив корней квадратных из vals, напечатанный сетодом сплитератора forEachRemaining : ");
        spliterator= vals.spliterator();
        spliterator.forEachRemaining(n-> System.out.println("n = " + Math.sqrt(n)));
    }
}
