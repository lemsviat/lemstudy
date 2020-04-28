package main.java.com.lemsviat.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (a, b) -> (a % b) == 0;

        for (int i = 0; i < 10; i++) {
            int m = (int) (Math.random() * (i - 5) * 10);
            int n = (int) (Math.random() * (i - 5) + 2);
            try {
                if (isFactor.test(m, n) && n != 1 && n != -1 && m != 0)
                    System.out.println("Число " + n + " является множителем числа " + m);
                    //System.out.println("Число " + n + " не является множителем числа " + m);

            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль: " + m + " / " + n);
            }
        }
    }
}
