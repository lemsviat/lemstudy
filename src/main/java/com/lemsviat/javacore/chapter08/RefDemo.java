package main.java.com.lemsviat.javacore.chapter08;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox= new BoxWeight(3,5,7,8.37);
        Box2 plainbox=new Box2();
        double vol=weightbox.returnVolume();
        System.out.println("Объем weightbox равен "+vol);
        System.out.println("Вес weightbox равен "+weightbox.weight);
        System.out.println();

        plainbox=weightbox; // присваивание ссылки на объект подкласса переменной суперкласса
        vol=plainbox.returnVolume(); // верно так как суперкласс имеет данный метод
        System.out.println("Объем plainbox равен "+vol);

        //System.out.println("Вес plainbox равен "+plainbox.weight); //ошибка, в суперклассе нет параметра weight
    }
}
