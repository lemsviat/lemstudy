package main.java.com.lemsviat.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    static void showpush(Stack<Integer> stack, int a) {
        stack.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack = " + stack);
    }

    static void showpop(Stack<Integer> stack) {
        System.out.print("pop-> ");
        Integer a = stack.pop();
        System.out.println(a);
        System.out.println("stack = " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("stack = " + stack);
        showpush(stack,42);
        showpush(stack,66);
        showpush(stack,99);
        showpop(stack);
        showpop(stack);
        showpop(stack);
        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
