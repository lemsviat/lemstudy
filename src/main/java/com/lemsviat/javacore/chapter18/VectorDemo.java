package main.java.com.lemsviat.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(3,2);
        System.out.println("Начальный размер вектора: "+ vector.size());
        System.out.println("Начальный емкость вектора: "+ vector.capacity());

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println("Емкость вектора после введения 4 элементов: "+ vector.capacity());

        System.out.println("Первый элемент вектора - "+vector.firstElement());
        System.out.println("Последний элемент вектора - "+vector.lastElement());

        if(vector.contains(3)) System.out.println("Вектор содержит элемент 3");

        Enumeration<Integer> vectorEnum = vector.elements(); //в современной коде enumeration заменяют на foreach или итератор
        System.out.print("Элементы вектора - ");
        while (vectorEnum.hasMoreElements()){
            System.out.print(vectorEnum.nextElement()+" ");
        }

    }
}
