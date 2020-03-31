package main.java.com.lemsviat.javacore.chapter09;

public class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    public DynStack (int size) { //выделяем память и инициализируем стек
        stck = new int[size];
        tos=-1;
    }

    @Override
    public void push(int item) { //размещаем элемент в стеке
        if (tos==stck.length-1) {
           int temp[]=new int[stck.length*2]; //удватваем размер стека
            for (int i = 0; i <stck.length; i++)
                temp[i]=stck[i];
            stck=temp;
            stck[++tos]=item;
        }
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
