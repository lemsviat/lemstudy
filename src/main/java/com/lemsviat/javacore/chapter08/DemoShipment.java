package main.java.com.lemsviat.javacore.chapter08;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1=new Shipment(10,20,15,10,3.41);
        Shipment shipment2=new Shipment(2,3,4,0.76,1.28);
        double vol;

        String currenshipmentname;

        currenshipmentname="shipment1";
        vol=shipment1.returnVolume();
        System.out.println("Объем "+currenshipmentname+ " равен "+vol);
        System.out.println("Вес "+currenshipmentname+" равен "+shipment1.weight);
        System.out.println("Стоимость доставки "+currenshipmentname+" равна "+shipment1.cost+" $");
        System.out.println();

        currenshipmentname="shipment2";
        vol=shipment2.returnVolume();
        System.out.println("Объем "+currenshipmentname+ " равен "+vol);
        System.out.println("Вес "+currenshipmentname+" равен "+shipment2.weight);
        System.out.println("Стоимость доставки "+currenshipmentname+" равна "+shipment2.cost+" $");
        System.out.println();

    }
}
