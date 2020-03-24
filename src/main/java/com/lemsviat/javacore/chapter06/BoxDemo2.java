package main.java.com.lemsviat.javacore.chapter06;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;

        mybox2.width=10;
        mybox2.height=20;
        mybox2.depth=15;

        vol=mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Объем равен " + vol);
        vol=mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Объем равен " + vol);

        boolean Eq=(mybox1==mybox2);
        System.out.println("Равенство ссылок "+Eq);

        boolean Eq1=mybox1.equals(mybox2);
        System.out.println("Равенсво по полям " + Eq1);

    }
}