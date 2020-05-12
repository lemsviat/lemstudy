package main.java.com.lemsviat.javacore.chapter15;

import java.util.Arrays;
import java.util.Date;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc1<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHights = {new HighTemp((int) (Math.random() * 50)), new HighTemp((int) (Math.random() * 50)),
                new HighTemp((int) (Math.random() * 50)), new HighTemp((int) (Math.random() * 50)),
                new HighTemp((int) (Math.random() * 50)), new HighTemp((int) (Math.random() * 50)),
                new HighTemp((int) (Math.random() * 50))};

        System.out.print("Температура за неделю по дням: ");
        for (int i=0; i<weekDayHights.length;i++) {
             if(i<weekDayHights.length-1) System.out.print(weekDayHights[i].gethTemp()+", ");
             else System.out.print(weekDayHights[i].gethTemp()+".");
        }
        System.out.println();

        count = counter(weekDayHights, HighTemp::sameTemp, new HighTemp(20));
        System.out.println("Дней, когда максимальная температура была 20 град Цельсия - " + count);

        count=counter(weekDayHights, HighTemp::lessThanTemp2, new HighTemp(30));
        System.out.println("Дней, когда максимальная температура была меньше 30 град Цельсия - " + count);

    }
}
