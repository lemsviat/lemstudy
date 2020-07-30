package main.java.com.lemsviat.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class MyThreadExec implements Runnable {
    String name;
    CountDownLatch latch;

    public MyThreadExec(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
        new Thread(this);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }

}
