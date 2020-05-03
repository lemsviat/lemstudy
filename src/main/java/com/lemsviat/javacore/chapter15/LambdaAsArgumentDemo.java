package main.java.com.lemsviat.javacore.chapter15;

import org.jetbrains.annotations.NotNull;

public class LambdaAsArgumentDemo {
    static String stringOp (@NotNull StringFunc sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr="Лямбда выражения повышают эффективность Java";
        String outStr;
        System.out.println("inStr = " + inStr);
        outStr=stringOp((str)-> str.toUpperCase(),inStr);
        System.out.println("outStr = " + outStr);

        StringFunc reverse = (str) -> {
            String result="";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result+=str.charAt(i);
            }
            return result;
        };
        System.out.println("Переворачиваем и получаем - "+reverse.func(inStr));
    }
}
