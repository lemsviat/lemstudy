package main.java.com.lemsviat.javacore.chapter10;

public class MultiCatch {
    public static void main(String[] args) {
        int a=10, b=0;
        int[] vals={1,2,3,4};
        try {
            int result =a/b;
            vals[10]=19;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение перехвачено: "+e);
        }
        System.out.println("После многократного перехвата");
    }
}
