package main.java.com.lemsviat.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList= new Properties();
        defList.put("Флорида","Тэллеси");
        defList.put("Висконсин","Мэдисон");

        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        Set<?> states = capitals.keySet();
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
        }
        System.out.println();

        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида "+str+".");
    }
}
