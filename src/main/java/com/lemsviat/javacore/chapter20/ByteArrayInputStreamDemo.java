package main.java.com.lemsviat.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) sb.append(i);
        String alphabet = sb.toString();
        System.out.println("alphabet = " + alphabet);

        byte[] buffer = alphabet.getBytes();
        ByteArrayInputStream ba1 = new ByteArrayInputStream(buffer);
        ByteArrayInputStream ba2 = new ByteArrayInputStream(buffer, 0, 3);
        System.out.println(ba1);
        System.out.println(ba2);

        for (int i = 0; i < buffer.length; i++) {
            System.out.print((char) ba1.read()+" ");
        }


    }
}
