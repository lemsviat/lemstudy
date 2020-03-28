package main.java.com.lemsviat.javacore.chapter08;

import main.java.com.lemsviat.javacore.chapter07.Box1;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    public Box2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box2(Box2 ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box2() {
        width=-1; //-1 для обозначения неинициализированного параллелепипеда
        height=-1;
        depth=-1;
    }
    Box2(double len) {
        width=height=depth=len;
    }
    void volume () {
        System.out.println("Объем "+ hashCode() +" равен "+width*height*depth);
    }
    double returnVolume() {
        return width*height*depth;
    }

}
