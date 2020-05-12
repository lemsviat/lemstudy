package main.java.com.lemsviat.javacore.chapter15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\Hello2.txt");
        File file1 = new File("F:\\SomeDir2\\3", "Hello1.txt");
        FileWriter fw=new FileWriter(f1);
        FileWriter fw1=new FileWriter(file1);

    }

}
