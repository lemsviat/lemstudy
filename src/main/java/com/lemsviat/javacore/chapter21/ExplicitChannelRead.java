package main.java.com.lemsviat.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        try {
            filepath = Paths.get("src/main/java/com/lemsviat/javacore/txtFiles/file2.txt");
        } catch (InvalidPathException e) {
            System.out.println("Path error " + e);
            return;
        }

        try (SeekableByteChannel seekableByteChannel = Files.newByteChannel(filepath)) { //создаем канал
            ByteBuffer byteBuffer = ByteBuffer.allocate(128);

            do {
                count = seekableByteChannel.read(byteBuffer);
                if (count != -1) {
                    byteBuffer.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) byteBuffer.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода "+e);
        }
    }
}
