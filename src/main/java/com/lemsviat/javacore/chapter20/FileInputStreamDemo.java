package main.java.com.lemsviat.javacore.chapter20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        File f1 = new File("F:\\Log1.txt");
        //try(BufferedReader br=new BufferedReader(new InputStreamReader((new FileInputStream(f1)), StandardCharsets.UTF_8))) {
        try (FileInputStream fis = new FileInputStream(f1)) {
            System.out.println("Общее количество доступный байтов = " + (size = fis.available()));
            int n = size-1000;
           /* System.out.println("Первые " + n + " прочитанных из файла по очереди методом read ( )");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fis.read());
            }*/
            System.out.println("\nBce еще доступно : " + fis.available());
            System.out.println("Чтeниe следующих " + n + " байтов по очереди методом read (b[])");
            byte[] b = new byte[n];
            int m=fis.read(b);//читает b байт и возвращает число прочитанных байт
            if (m != n) {
                System.err.println(" Нельзя прочитать " + n + " байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("Прочитано байт - "+m);
            System.out.println("\nBce еще доступно : " + fis.available());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
