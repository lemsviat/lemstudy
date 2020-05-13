package main.java.com.lemsviat.javacore.chapter15;

public class GenericMethodRefDemo {
    static <T> int myOps(MyFunc2<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs={"Один", "Два", "Три", "Два"};
        int count;

        count=myOps(MyArraysOps::countMatching,vals,4);
        System.out.println("Массив чисел vals содержит "+count+" числа 4");

        count=myOps(MyArraysOps::countMatching,strs,"Два");
        System.out.println("Массив строк strs содержит "+count+" числа 'Два'");
    }
}
