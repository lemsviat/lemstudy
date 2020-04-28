package main.java.com.lemsviat.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile1 {
    public static void main(String[] args) {
        int i;


        try (FileInputStream fin = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\lemstudy" +
                "\\src\\main\\java\\com\\lemsviat\\javacore\\chapter13\\input")) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
    }
}
