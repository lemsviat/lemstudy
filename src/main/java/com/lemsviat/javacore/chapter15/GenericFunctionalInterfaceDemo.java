package main.java.com.lemsviat.javacore.chapter15;

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result="";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда переворачиваем и получаем "+reverse.func("Лямбда"));

        SomeFunc<Integer> factorial= (n)->{
            int result=1;
            for (int i = 1; i <=n; i++) {
                result=result*i;
            }
            return result;
        };
        System.out.println("Факториал числа 3 равен "+factorial.func(3));
    }
}
