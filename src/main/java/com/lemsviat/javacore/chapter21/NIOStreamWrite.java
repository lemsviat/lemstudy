package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try (OutputStream outputStream = Files.newOutputStream(Path.of("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file7.txt"))) {
            for (int i = 0; i <26; i++) {
                outputStream.write((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
