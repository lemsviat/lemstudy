package main.java.com.lemsviat.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        String message;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        //получить дату ответа на запрос
        long d = hpCon.getDate();
        System.out.println("Дата ответа на запрос: " + new Date(d).toLocaleString());
        //тип содержимого
        System.out.println("Тип содержимого: " + hpCon.getContentType());
        //дата строка действия ресурса
        message = (hpCon.getExpiration() == 0) ? "Сведения не найдены! " : "Строк действия ресурса: " +
                new Date(hpCon.getExpiration()).toLocaleString();
        System.out.println(message);
        //дата последнее модификации
        message = (hpCon.getLastModified() == 0) ? "Сведения не найдены! " : "Дата последне модификации: " +
                new Date(hpCon.getLastModified()).toLocaleString();
        System.out.println(message);
        //получить длину содержимого
        message = (hpCon.getContentLengthLong() == -1) ? "Сведения не найдены! " : "Длина содержимого: " +
                hpCon.getContentLengthLong();
        System.out.println(message);
        //получить содержимое
        if (hpCon.getContentLengthLong() != 0) {
            InputStream in = hpCon.getInputStream();
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
            in.close();
        } else System.out.println("Содержимое недоступно!");
    }
}
