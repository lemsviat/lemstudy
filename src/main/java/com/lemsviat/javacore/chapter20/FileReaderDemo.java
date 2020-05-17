package main.java.com.lemsviat.javacore.chapter20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fileReader=new FileReader("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file1.txt")){
            int c;
            while ((c=fileReader.read())!=-1) System.out.print((char) c);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
