package main.java.com.lemsviat.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current Thread: " + thread);

        thread.setName("My Thread");
        System.out.println("After changing name of the thread: " + thread);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
    }
}
