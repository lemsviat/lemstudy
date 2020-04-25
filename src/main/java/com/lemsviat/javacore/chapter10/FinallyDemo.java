package main.java.com.lemsviat.javacore.chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("Demonstration");
        } finally {
            System.out.println("in finally in procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("В теле метода procB()");
           return;
        } finally {
            System.out.println("in finally in procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("В теле метода procC()");
        } finally {
            System.out.println("in finally in procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }
        procB();
        procC();
    }
}
