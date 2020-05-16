package main.java.com.lemsviat.javacore.chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file1.txt");
        files.addElement("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file2.txt");
        files.addElement("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file3.txt");
        System.out.println("files = " + files);

        //InputStreamEnumerator ise = new InputStreamEnumerator(files);
        try (InputStream inputStream = new SequenceInputStream(new InputStreamEnumerator(files))) {
            while ((c = inputStream.read()) != -1) System.out.print((char) c);
        } catch (NullPointerException e) {
            System.out.println("Ошибка открытия файла");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }

    }
}
