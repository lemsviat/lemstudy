package main.java.com.lemsviat.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStrm = new ObjectOutputStream
                (new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file5.txt"))) {
            MyClass5 object1 = new MyClass5("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при серилизации " + e);
        }
        try (ObjectInputStream objIStrm = new ObjectInputStream
                (new FileInputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file5.txt"))) {
            MyClass5 object2 = (MyClass5) objIStrm.readObject();
            System.out.println("object2:" + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации:" + e);
            //System.exit(0);
        }
    }
}