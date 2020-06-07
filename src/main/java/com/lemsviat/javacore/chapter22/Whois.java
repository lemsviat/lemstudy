package main.java.com.lemsviat.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        Socket s=new Socket("whois.iana.org", 43);  //создается сокетное соединение к сайту по этому порту

        //получаем потоки ввода-вывода
        InputStream in=s.getInputStream();
        OutputStream out=s.getOutputStream();

        //формируем строку запроса
        String str="google.com";

        //преобразуем строку в бацты
        byte[] buf=str.getBytes();

        //отсылаем запрос
        out.write(buf);

        //читаем и выводим ответ
        while ((c=in.read())!=-1){
            System.out.println(c);
        }
        s.close();
    }
}
