package main.java.com.lemsviat.javacore.chapter08;

public class FindAreas {
    public static void main(String[] args) {
        //Figure f=new Figure(10,10);
        Rectangle r=new Rectangle(9,5);
        Triangle t=new Triangle(10,8);

        Figure figref; //переменная, которая может принимать объекты типа Figure и наследников

        figref=r;
        System.out.println("Площадь = " + figref.area());

        figref=t;
        System.out.println("Площадь = " + figref.area());

        //figref=f;
        //System.out.println("Площадь = " + figref.area());
    }
}
