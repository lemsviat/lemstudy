package main.java.com.lemsviat.javacore.chapter07;

public class AccessTest {
    public static void main(String[] args) {
        Test2 ob=new Test2();

        ob.a=10;
        ob.b=20;

        ob.setC(100);
        System.out.println("a,b and c: "+ob.a+" "+ob.b+" "+ob.getC());
    }
}
