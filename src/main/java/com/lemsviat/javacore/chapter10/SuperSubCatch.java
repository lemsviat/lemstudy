package main.java.com.lemsviat.javacore.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("Сюда програма не дойдет");
        }
        catch (Exception e){
            System.out.println("Перехват исключений общего класса Exception");
        }
        /*catch (ArithmeticException e) { //ArithmeticException - частный случай Exception и поэтому он уже перехвачен выше
            System.out.println("Сюда программа не дойдет");
        }*/
    }
}
