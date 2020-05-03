package main.java.com.lemsviat.javacore.chapter15;

public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Массив пуст");
    }
}
