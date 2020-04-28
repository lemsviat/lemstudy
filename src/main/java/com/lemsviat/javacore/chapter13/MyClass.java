package main.java.com.lemsviat.javacore.chapter13;

public class MyClass {
    int a;
    int b;
    MyClass (int i, int j){
        a=i;
        b=j;
    }
    MyClass (int i){
        this(i,i); //перешруженный конструктор использует this как базовый конструктор
    }
    MyClass(){
        this(0);
    }

    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        System.out.println(myClass.a+" "+myClass.b);
    }
}
