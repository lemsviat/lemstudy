package main.java.com.lemsviat.javacore.chapter09;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImpl obj=new MyIFImpl();
        System.out.println(obj.getNumber()); //можно вызвать, так как метод реализован в классе
        System.out.println(obj.getString()); //можно тоже вызвать, потому что в интерфейсе он реализован, как метод по умолчанию
    }
}
