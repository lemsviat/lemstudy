package main.java.com.lemsviat.javacore.chapter08;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1=new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2=new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3=new BoxWeight();
        BoxWeight mycube=new BoxWeight(3,2);
        BoxWeight myclone=new BoxWeight(mybox1);
        double vol;
        String currentboxname;

        currentboxname="mybox1";
        vol=mybox1.returnVolume();
        System.out.println("Объем "+currentboxname+ " равен "+vol);
        System.out.println("Вес "+currentboxname+" равен "+mybox1.weight);
        System.out.println();

        currentboxname="mybox2";
        vol=mybox2.returnVolume();
        System.out.println("Объем "+currentboxname+ " равен "+vol);
        System.out.println("Вес "+currentboxname+" равен "+mybox2.weight);
        System.out.println();

        currentboxname="mybox3";
        vol=mybox3.returnVolume();
        System.out.println("Объем "+currentboxname+ " равен "+vol);
        System.out.println("Вес "+currentboxname+" равен "+mybox3.weight);
        System.out.println();

        currentboxname="mycube";
        vol=mycube.returnVolume();
        System.out.println("Объем "+currentboxname+ " равен "+vol);
        System.out.println("Вес "+currentboxname+" равен "+mycube.weight);
        System.out.println();

        currentboxname="myclone";
        vol=myclone.returnVolume();
        System.out.println("Объем "+currentboxname+ " равен "+vol);
        System.out.println("Вес "+currentboxname+" равен "+myclone.weight);
        System.out.println();
    }
}
