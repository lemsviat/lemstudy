package main.java.com.lemsviat.javacore.chapter08;

public class Shipment extends BoxWeight{
    double cost;

    Shipment(double width, double height, double depth, double weight, double cost) {
        super(width,height,depth,weight);
        this.cost = cost;
    }
    Shipment(Shipment ob){ //клонирование объекта
        super(ob);
        this.cost=ob.cost;
    }
    Shipment() { //конструктор по умолчанию
        super();
        cost=-1;
    }
    Shipment(double len, double weight){
        super(len,weight);
        this.weight=weight;
    }
}
