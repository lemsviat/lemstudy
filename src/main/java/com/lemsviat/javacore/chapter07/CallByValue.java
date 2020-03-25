package main.java.com.lemsviat.javacore.chapter07;

public class CallByValue {
    public static void main(String[] args) {
        Test ob=new Test();
        int a=15, b=20;
        System.out.println("a and b before the call: "+a+" "+b);
        ob.meth(a,b);
        System.out.println("a and b after the call: "+a+" "+b);
    }
}
