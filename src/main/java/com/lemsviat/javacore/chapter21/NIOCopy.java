package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOCopy {
    public static void main(String[] args) {
        Path sourse = Path.of("src/main/java/com/lemsviat/javacore/txtFiles/file3.txt");
        Path target = Path.of("src/main/java/com/lemsviat/javacore/txtFiles/file6.txt");
        try {
            Files.copy(sourse, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
