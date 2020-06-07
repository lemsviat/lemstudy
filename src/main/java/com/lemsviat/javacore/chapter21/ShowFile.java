package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        try (InputStream inputStream = Files.newInputStream(Path.of("src/main/java/com/lemsviat/javacore/txtFiles/file6.txt"))) {
            do{
                i=inputStream.read();
                if(i!=-1)System.out.print((char) i+" ");
            }while (i!=-1);
        }catch (InvalidPathException e){
            System.out.println("Ошибка указания пути "+e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода "+e);
        }
    }
}
