package main.java.com.lemsviat.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {
            int a=args.length;
            int b=42/a;
            System.out.println("a = " + a);
            try {
                if (a==1) a=a/(a-a);
                if (a==2) {
                    int[] c={1};
                    c[42]=99;
                }
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Индекс за пределами массива");
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: "+e);
        }
    }
}
