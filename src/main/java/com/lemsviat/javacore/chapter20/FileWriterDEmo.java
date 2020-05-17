package main.java.com.lemsviat.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDEmo {
    public static void main(String[] args) {
        String source = "Это пример входящих данных в FileWriter.";
        char[] buffer = new char[source.length()];
        try (FileWriter fileWriter = new FileWriter("src\\main\\java\\com\\lemsviat\\javacore\\txtFiles\\file4.txt")) {
            fileWriter.write(source+"\n");

            for (char i : source.toCharArray()
            ) {
                fileWriter.append(i);
            }
            fileWriter.append("\n");
            fileWriter.write(source,0,10);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
