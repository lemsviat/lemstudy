package main.java.com.lemsviat.javacore.chapter07;

public class TestStack2 {
    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1(5);
        Stack1 mystack2 = new Stack1(8);

        for (int i = 0; i <5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i <8; i++) {
            mystack2.push(i);
        }
        System.out.println("Стек в mystack1:");
        for (int i = 0; i <5; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Стек в mystack1:");
        for (int i = 0; i <8; i++) {
            System.out.println(mystack2.pop());
        }
    }


}
