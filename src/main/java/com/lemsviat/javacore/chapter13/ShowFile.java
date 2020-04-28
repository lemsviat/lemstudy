package main.java.com.lemsviat.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        //args[0]="1.txt";
        int i;
        FileInputStream fin;

        /*if (args.length != 1) {
            System.out.println("Использование имя_файла");
            return;
        }*/

        try {
            //fin = new FileInputStream(args[0]);
            fin = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\lemstudy\\src\\main\\java\\com\\lemsviat\\javacore\\chapter13\\input");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл"+e);
            return;
        }


        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }

        try {
            fin.close();

        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }
}
