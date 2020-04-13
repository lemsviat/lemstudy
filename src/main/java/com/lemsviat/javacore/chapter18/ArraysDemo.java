package main.java.com.lemsviat.javacore.chapter18;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array =new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=-3*i;
        }
        //System.out.println("array = " + Arrays.toString(array)); //обычная печать массива
        System.out.print("Исходный массив = ");
        display(array);

        Arrays.sort(array);
        System.out.print("Отсортированный массив = ");
        display(array);

        Arrays.fill(array,2,6,-1);
        System.out.print("Массив после вызова метода fill = ");
        display(array);

        Arrays.sort(array);
        System.out.print("Массив после вторичной сортировки = ");
        display(array);

        System.out.print("Значение -9 находится на позиции: ");
        int index=Arrays.binarySearch(array,-9);
        System.out.println(index);
    }
    static void display(@NotNull int[] array){
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
