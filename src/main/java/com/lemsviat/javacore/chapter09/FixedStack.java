package main.java.com.lemsviat.javacore.chapter09;

public class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    public FixedStack(int size) { //выделяем память и инициализируем стек
        stck = new int[size];
        tos=-1;
    }

    @Override
    public void push(int item) { //размещаем элемент в стеке
        if (tos==stck.length-1) System.out.println("Стек заполнен");
        else stck[++tos]=item;
    }

    @Override
    public int pop() {
        if (tos<0){
            System.out.println("Стек не загружен. Извлекать нечего.");
        return 0;
        }
        else return stck[tos--];
    }
}
