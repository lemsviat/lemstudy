package main.java.com.lemsviat.javacore.chapter07;

public class Stack1 {
    private int[] stck;
    private int tos;
    //инициализация вершины стека
    public Stack1(int size)
    {
        stck=new int[size];
        tos = -1;
    }
    //разместить элемент в стеке
    void push(int item) {
        if (tos == stck.length-1) System.out.println("Stack is full");
        else stck[++tos] = item;
    }
    //извлечь элемент из стека
    int pop() {
        if (tos<0) {
            System.out.println("Stack is empty");
            return 0;
        }
        else return stck[tos--];
    }
}
