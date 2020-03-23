package main.java.com.lemsviat.javacore.chapter05;

public class Foreach2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for (int x:nums
        ) {
            System.out.println("Значение равно: " + x);
            sum+=x;
            if (x==5) break;
        }
        System.out.println("Сумма первых пяти элементов равна: " + sum);
    }
}
