package main.java.com.lemsviat.javacore.chapter07;

public class PassObjRe {
    public static void main(String[] args) {
        Test ob=new Test(15,20);

        System.out.println("ob.a and ob.bb before the call: "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.bb after the call: "+ob.a+" "+ob.b);

    }
}
