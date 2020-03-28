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
    void show1(){ // переопределен относительно суперкласса А
        System.out.println("k: " + k);
    }
    void  show2(){
        super.show1();
        System.out.println("k = " + k);
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}
