package main.java.com.lemsviat.javacore.chapter20;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        String s = "Входящая строка данных.";
        byte[] buffer = s.getBytes();

        try (ByteArrayOutputStream bao = new ByteArrayOutputStream()) {
            bao.write(buffer);
            System.out.println("bao = " + bao);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
        }

        // запишем данные, которые находятся в потоке вывода ByteArrayOutputStream в файл
        ByteArrayOutputStream bao1 = new ByteArrayOutputStream();
        bao1.write(buffer);
        try (FileOutputStream fileOutputStream = new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file1.txt", true)) {
            bao1.writeTo(fileOutputStream); //пишем
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл");
        }

    }
}
