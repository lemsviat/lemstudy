package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("src/main/java/com/lemsviat/javacore/txtFiles/file2.txt"))) {
            long fsize = fileChannel.size();
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fsize); //сопоставляем файл с буффером
            for (int i = 0; i < fsize; i++) {
                System.out.print((char) mappedByteBuffer.get());
                //System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода "+e);
        }
    }
}
