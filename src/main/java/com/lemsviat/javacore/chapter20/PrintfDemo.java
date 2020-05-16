package main.java.com.lemsviat.javacore.chapter20;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("%d %(d %+d %05d\n", 3,-3,3,3);
        System.out.printf("%f\n",123456.789); //числа с плавающей точкой, формат по умолчанию
        System.out.printf("%,f\n",1234560.789);
        System.out.printf("%,f\n",-1234560.789);
    }
}
