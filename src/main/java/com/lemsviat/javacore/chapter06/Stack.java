package main.java.com.lemsviat.javacore.chapter06;

public class Stack {
    private int[] stck = new int[10];
    private int tos;
    //инициализация вершины стека
    public Stack() {
        tos = -1;
    }
    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9) System.out.println("Stack is full");
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
