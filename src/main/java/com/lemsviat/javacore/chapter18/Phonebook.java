package main.java.com.lemsviat.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht=new Properties();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String name, number;
        FileInputStream fileInputStream=null;
        boolean changed=false;

        try { //пытаемся открыть файл телефонной книги
            fileInputStream=new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            //игнорировать отсутствие файла
        }
        try { //если она существует, загрузить телефонные номера
            if(fileInputStream!=null){
                ht.load(fileInputStream);
                fileInputStream.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }
        do { //пользователь может вводить новые имена и номера телефонов абонентов
            System.out.println("Введите имя или 'выход' для завершения: ");
            name=bufferedReader.readLine();
            if(name.equals("выход")){
                continue;
            }
            System.out.println("Введите номер: ");
            number=bufferedReader.readLine();
            ht.put(name,number);
            changed=true;
        } while (!name.equals("выход"));

        if (changed){ //сохранить телефонную книгу , если она изменилась
            FileOutputStream fileOutputStream=new FileOutputStream("phonebook.dat");
            ht.store(fileOutputStream, "Телефонная книга");
            fileOutputStream.close();
        }

        do {
            System.out.println("Введите имя для поиска или 'выход' для завершения: ");
            name=bufferedReader.readLine();
            if(name.equals("выход")){
                continue;
            }
            number= (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
