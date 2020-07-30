package main.java.com.lemsviat.javacore.chapter28.callable;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Integer> f1;
        Future<Integer> f2;

        System.out.println("Запуск");
        Instant start=Instant.now();

        f= es.submit(new Sum(10));
        f1= es.submit(new Sum(20));
        f2= es.submit(new Sum(30));

        try {
            System.out.println(f.get());
            System.out.println(f1.get());
            System.out.println(f2.get());
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("e = " + e);
        }
        es.shutdown();
        Instant finish =Instant.now();
        System.out.println(Duration.between(start,finish));

        System.out.println("Завершение потоков");
    }
}
