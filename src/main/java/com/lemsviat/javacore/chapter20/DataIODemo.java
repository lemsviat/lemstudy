package main.java.com.lemsviat.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dataOutputStream = new DataOutputStream
                (new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file4.txt"))) {
            dataOutputStream.writeDouble(98.6);
            dataOutputStream.writeInt(1000);
            dataOutputStream.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream
                ("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file4.txt"))) {
            double d = dataInputStream.readDouble();
            int i = dataInputStream.readInt();
            boolean b = dataInputStream.readBoolean();
            System.out.println("d = " + d);
            System.out.println("i = " + i);
            System.out.println("b = " + b);

        } catch (FileNotFoundException e) {
            System.out.println("Не открывается файл на чтение");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
