package main.java.com.lemsviat.javacore.chapter09;

public interface MyIF {
    int getNumber(); // обычный метод интерфейса, который не предоставляет реализацию по умолчанию (которая появилась в Java 8)
    default String getString() { //метод по умолчанию, который появился в Java 8
        return "Объект типа String по умолчанию";
    }
    static int getDefaultNumber(){ //статический метод интерфейса, тоже появился в Java 8
        return 0;
    }
}
