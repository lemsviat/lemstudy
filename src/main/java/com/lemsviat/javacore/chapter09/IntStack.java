package main.java.com.lemsviat.javacore.chapter09;

public interface IntStack {
    void push(int item);
    int pop();
    default void clear(){
        System.out.println("Метод clear() по умолчанию");
    }
}
