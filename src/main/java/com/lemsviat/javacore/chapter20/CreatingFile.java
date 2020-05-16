package main.java.com.lemsviat.javacore.chapter20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\Hello2.txt");
        File file1 = new File("F:\\SomeDir2\\3", "Hello1.txt");
        File file2 = new File("F:\\SomeDir2\\3", "DirectCreated.txt");
        File folder = new File("F:\\SomeDir2\\1");
        FileWriter fw = new FileWriter(f1);
        FileWriter fw1 = new FileWriter(file1);
        file2.createNewFile(); //создастся пустой файл
        //file2.delete();
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        String folderOrFile=((file2.isDirectory())?"Я папка":"Я файл");
        System.out.println(folderOrFile);
        System.out.println(file2.isAbsolute());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getParent());
        System.out.println(file2.getParentFile());
        System.out.println(file2.getName());
        System.out.println();


        //folder.createNewFile(); // будет файл без расширения, папки не создаст
        folder.mkdir(); //создастся папка, но путь должен уже существовать

        File folder1 = new File("F:\\SomeDir20\\6\\folder1");
        folder1.mkdirs(); //создает папку и все папки, что выше нее по пути, до этого их могло и не быть

        String folderOrFile1=((folder.isDirectory())?"Я папка":"Я файл");
        System.out.println(folderOrFile1);
        System.out.println(folder.isFile());
        System.out.println(folder.isAbsolute());
        System.out.println(folder.getAbsoluteFile());
        System.out.println(folder.getAbsolutePath());
        System.out.println(folder.getPath());
        System.out.println(folder.getParent());
        System.out.println(folder.getParentFile());
        System.out.println(folder.getName());
    }

}
