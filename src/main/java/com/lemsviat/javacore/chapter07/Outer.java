package main.java.com.lemsviat.javacore.chapter07;

public class Outer {
    int outer_x=100;

    void test() {
        Inner inner=new Inner();
        inner.display();
    }
    class Inner {
        int y=10; //видна только в пределах класса Inner
        void display() {
            System.out.println("outer_x = " + outer_x);
        }
    }
    void showy(){
        //System.out.println(y); //ошибка "у" не видно во внешнем классе
    }

}
