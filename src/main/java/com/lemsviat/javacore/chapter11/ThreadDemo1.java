package main.java.com.lemsviat.javacore.chapter11;

public class ThreadDemo1 {
    public static void main(String[] args) {
        new NewThread1();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }
        System.out.println("Главный поток завершен!");
    }
}
