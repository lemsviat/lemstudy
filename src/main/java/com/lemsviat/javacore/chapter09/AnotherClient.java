package main.java.com.lemsviat.javacore.chapter09;

public class AnotherClient  implements Callback{
    public void callback(int p){ //реализуем интерфейс callback по другому
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно "+(p*p));
    }
}
