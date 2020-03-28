package main.java.com.lemsviat.javacore.chapter08;

public class B extends A {
    int k;

    public B() {
    }

    public B(int i, int j, int k) {
        super(i, j);
        this.k=k;
    }

    void showk(){
        System.out.println("k: " + k);
    }

    @java.lang.Override
    void show1(){ // переопределен относительно такого же метода суперкласса А
        System.out.println("k: " + k);
    }
    void  show2(){
        super.show1();
        System.out.println("k = " + k);
    }

    void show1(String msg){ //перегружен (изменена сигнатура) относительно такого же метода суперкласса А
        System.out.println(msg + k);
    }
    @java.lang.Override
    void callme(){
        System.out.println("В методе callme() из класса B");
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}
