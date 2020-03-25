package main.java.com.lemsviat.javacore.chapter07;

public class Box1 {
    double width;
    double height;
    double depth;

    public Box1(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box1 (Box1 ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box1 () {
        width=-1; //-1 для обозначения неинициализированного параллелепипеда
        height=-1;
        depth=-1;
    }
    Box1 (double len) {
        width=height=depth=len;
    }
    void volume () {
        System.out.println("Объем "+ getClass().getName() +" равен "+width*height*depth);
    }
    double returnVolume() {
        return width*height*depth;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
