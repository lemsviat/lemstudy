package main.java.com.lemsviat.javacore.chapter08;

public class Triangle extends Figure {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @java.lang.Override
    double area() {
        System.out.println("В области треугольника");
        return dim1*dim2/2;
    }
}
