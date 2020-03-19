package main.java.com.lemsviat.javacore.chapter03;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x <3; x++) {
            int y=-1; //initialize in start of each loop
            System.out.println("y равно: " + y); //always -1
            y=100;
            System.out.println("y теперь равно: " + y); //always 100
        }
    }
}
