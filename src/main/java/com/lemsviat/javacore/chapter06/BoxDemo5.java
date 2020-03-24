package main.java.com.lemsviat.javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        mybox1.volume();
        mybox2.volume();
    }

}
