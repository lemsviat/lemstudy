package main.java.com.lemsviat.javacore.chapter15;

public class ConstractorByLambda {
    public static void main(String[] args) {
        MyClassConstructorInterface mci=MyClass1::new;
        MyClass1 mc=mci.func(100);
        System.out.println("mc.getVal() = " + mc.getVal());
    }
}
