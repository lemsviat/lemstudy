package main.java.com.lemsviat.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("исключение перехвачено в теле метода demoproc().");
            throw e; //повторно генерируем исключение для примера
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: "+e);
        }
    }
}
