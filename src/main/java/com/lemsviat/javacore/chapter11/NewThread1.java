package main.java.com.lemsviat.javacore.chapter11;

public class NewThread1 extends Thread {
    NewThread1() {
        super("Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван!");
        }
        System.out.println("Дочерний поток завершен!");
    }
}
