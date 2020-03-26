package main.java.com.lemsviat.javacore.chapter08;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.076);

        System.out.println(mybox1.equals(mybox2));
        System.out.println(mybox1.hashCode()==mybox2.hashCode());


        mybox1.volume();
        System.out.println("Weight mybox1= "+mybox1.weight);
        mybox2.volume();
        System.out.println("Weight mybox2= "+mybox2.weight);

    }
}
