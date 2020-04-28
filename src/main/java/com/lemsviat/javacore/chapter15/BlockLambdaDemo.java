package main.java.com.lemsviat.javacore.chapter15;

public class BlockLambdaDemo {
    public static void main(String[] args) {
        int m = (int) (Math.random() * 20);
        NumericFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал числа " + m + " равен " + factorial.func(m));
    }
}
