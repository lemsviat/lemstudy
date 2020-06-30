package main.java.com.lemsviat.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> inputList=new ArrayList<>();
        inputList.add(new NamePhoneEmail("Ivan","23-456-111", "a1@b.com"));
        inputList.add(new NamePhoneEmail("Petr","23-456-222", "a2@b.com"));
        inputList.add(new NamePhoneEmail("Sidor","23-456-333", "a3@b.com"));
        System.out.println("Исходные элементы: ");
        inputList.stream().forEach(a-> System.out.print(a.name+" "+a.phoneNum+" "+a.email+"; "));
        System.out.println();
        //отобразить на новый поток данных только имена и номера телефонов
        Stream<NamePhone> namePhoneStream=inputList.stream().map(a->new NamePhone(a.name,a.phoneNum));
        System.out.println("Только имена и номера телефонов: ");
        namePhoneStream.forEach(a-> System.out.print(a.name+" "+a.phoneNum+"; "));

    }
}
