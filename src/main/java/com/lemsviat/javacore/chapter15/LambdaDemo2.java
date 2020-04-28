package main.java.com.lemsviat.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = n -> (n % 2) == 0;
        for (int i = 0; i < 10; i++) {
            int m = (int) (Math.random() * (i-5)*10);
            if (isEven.test(m)) System.out.println("Число " + m + " четное");
            else System.out.println("Число " + m + " нечетное");
        }
        NumericTest isNoNeg=n->(n>=0);
        for (int i = 0; i < 10; i++) {
            int m = (int) (Math.random() * (i-5)*10);
            if (isNoNeg.test(m)) System.out.println("Число " + m + " не отрицательное");
            else System.out.println("Число " + m + " отрицательное");
        }

    }
}
