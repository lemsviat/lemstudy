package main.java.com.lemsviat.javacore.chapter28.forkjoinpool;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        //создать пул задач
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        //создать и заполнить массив
        double[] nums = new double[10000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println("Часть массива");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        // запустить главную задачу типа ForkJoinTask на выполнение
        forkJoinPool.invoke(task);

        System.out.println("Количество потоков: "+forkJoinPool.getActiveThreadCount()); //количество потоков

        System.out.println ( "Часть преобразованной последовательности " +
                "(с точностью до четырех знаков после десятичной точки): " );
        for (int i = 0; i <10 ; i++) {
            System.out.printf("%.4f ", nums[i]);
            System.out.print(" ");
        }
    }
}
