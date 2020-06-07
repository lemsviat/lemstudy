package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("src/main/java/com/lemsviat/javacore/txtFiles/file3.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            for (int i = 0; i < byteBuffer.limit(); i++) {
                byteBuffer.put((byte) ('A' + i));
            }
            byteBuffer.rewind();
            fileChannel.write(byteBuffer);
        }
        catch (InvalidPathException e){
            System.out.println("Ошибка указания пути "+e);
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода "+e);
        }

    }
}
