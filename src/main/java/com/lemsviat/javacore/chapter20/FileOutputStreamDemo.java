package main.java.com.lemsviat.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and play their due taxes.";
        byte buffer[] = source.getBytes();
        //System.out.println("buffer = " + Arrays.toString(buffer));

        try (FileOutputStream f0 = new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file1.txt"); //если файла нет, он будет создан автоматически
             FileOutputStream f1 = new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file2.txt");
             FileOutputStream f2 = new FileOutputStream("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file3.txt")) {

            for (int i = 0; i < buffer.length; i += 2) {//запись каждого второго символа
                f0.write(buffer[i]);
            }

            f1.write(buffer);

            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода = " + e);
        }
    }
}
