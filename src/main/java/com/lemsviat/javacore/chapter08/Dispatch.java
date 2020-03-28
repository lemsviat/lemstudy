package main.java.com.lemsviat.javacore.chapter08;

public class Dispatch {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();

        A r; //переменная, которая ссылается на объект типа А

        r=a;
        r.callme();

        r=b;
        r.callme();

        r=c;
        r.callme();
    }
}
