package main.java.com.lemsviat.javacore.chapter08;

public abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area(); //{
        //System.out.println("Площадь фигуры не определена");
       // return 0;
    //}
}
