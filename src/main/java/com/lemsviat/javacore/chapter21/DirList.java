package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src\\main\\java\\com\\lemsviat\\javacore\\chapter21";

        //создаем фильтр файлов
        DirectoryStream.Filter<Path> how = path -> Files.isWritable(path);

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname),how)) {
            System.out.println("Каталог " + dirname);
            for (Path entry : directoryStream
            ) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if(attributes.isDirectory()) System.out.print("<DIR>");
                else System.out.print("     ");
                System.out.println(entry.getName(7)); //7- в данном случае файлы находятся в 7-м по иерархии вложении в указанном пути dirname
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
