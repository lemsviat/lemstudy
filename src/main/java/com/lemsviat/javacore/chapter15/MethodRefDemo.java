package main.java.com.lemsviat.javacore.chapter15;

import org.jetbrains.annotations.NotNull;

public class MethodRefDemo {
    static String reverseString(@NotNull StringFunc stringFunc, String s){
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inStr="Indoor string";
        String outStr=reverseString(MyStringOps::strReverse,inStr);
        String outStr1=MyStringOps.strReverse(inStr);

        System.out.println(inStr);
        System.out.println(outStr);
        System.out.println(outStr1);
    }
}
