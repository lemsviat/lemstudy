package main.java.com.lemsviat.javacore.chapter09;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; //переменная ссылается на интерфейс
        DynStack ds=new DynStack(5);
        FixedStack fs=new FixedStack(8);

        mystack=ds; //загрузка стека з изменяемой длиной
        for (int i = 0; i <12; i++) mystack.push(i);
        mystack=fs; //загрузка стека фиксированной длины
        for (int i = 0; i <8; i++) mystack.push(i);

        mystack=ds;
        System.out.println("Stack into DynamicStack:");
        for (int i = 0; i <12; i++) System.out.println(mystack.pop());
        mystack=fs;
        System.out.println("Stack into FixStack:");
        for (int i = 0; i <8; i++) System.out.println(mystack.pop());
    }
}
