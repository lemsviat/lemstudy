package main.java.com.lemsviat.javacore.chapter08;

public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области четырехугольника");
        return dim1*dim2;
    }
}
