package main.java.com.lemsviat.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        try (FileInputStream fin = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\lemstudy" +
                "\\src\\main\\java\\com\\lemsviat\\javacore\\chapter13\\input");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\lemstudy" +
                     "\\src\\main\\java\\com\\lemsviat\\javacore\\chapter13\\output")) {
            do {
                i = fin.read();
                if (i != -1) fos.write(i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
