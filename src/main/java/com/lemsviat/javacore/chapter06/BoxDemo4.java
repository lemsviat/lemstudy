package main.java.com.lemsviat.javacore.chapter06;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol=mybox1.returnVolume();
        System.out.println("Объем равен " + vol);
        vol=mybox2.returnVolume();
        System.out.println("Объем равен " + vol);
    }
}
