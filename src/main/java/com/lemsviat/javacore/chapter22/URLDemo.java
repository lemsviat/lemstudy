package main.java.com.lemsviat.javacore.chapter22;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL hp=new URL("https://dou.ua/lenta");
        System.out.println("Протокол "+hp.getProtocol());
        System.out.println("Порт "+hp.getPort());
        System.out.println("Хост "+hp.getHost());
        System.out.println("Файл "+hp.getFile());
        System.out.println("Полная форма "+hp.toExternalForm());
    }
}
