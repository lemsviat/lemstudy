package main.java.com.lemsviat.javacore.chapter08;

public class BoxWeight extends Box2 {
    double weight;

    public BoxWeight(double width, double height, double depth,double weight) {
        super(width,height,depth);
        this.weight = weight;
    }
    BoxWeight(BoxWeight ob){ //клонирование объекта
        super(ob);
        this.weight=ob.weight;
    }
    BoxWeight() { //конструктор по умолчанию
        super();
        weight=-1;
    }
    BoxWeight (double len, double weight){
        super(len);
        this.weight=weight;
    }

}
