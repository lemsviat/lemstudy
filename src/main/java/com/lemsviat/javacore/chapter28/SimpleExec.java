package main.java.com.lemsviat.javacore.chapter28;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExec {
    public static void main(String[] args) {
        int counter = 5;
        CountDownLatch cd1= new CountDownLatch(counter);
        CountDownLatch cd12= new CountDownLatch(counter);
        CountDownLatch cd13= new CountDownLatch(counter);
        CountDownLatch cd14= new CountDownLatch(counter);
        ExecutorService es= Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков:");
        Instant start = Instant.now();
        //запускаем потоки исполнения
        es.execute(new MyThreadExec(cd1,"A"));
        es.execute(new MyThreadExec(cd12,"B"));
        es.execute(new MyThreadExec(cd13,"C"));
        es.execute(new MyThreadExec(cd14,"D"));

        try {
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        Instant finish = Instant.now();
        System.out.println(Duration.between(start,finish));
        es.shutdown();
        System.out.println("Завершение потоков");
    }
}
