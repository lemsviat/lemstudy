package main.java.com.lemsviat.javacore.chapter15;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class MethodRefDemo2 {
    static String reverseString(@NotNull StringFunc stringFunc, String s) {
        return stringFunc.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Indoor string";
        MyStringOps myStringOps = new MyStringOps();
        String outStr = reverseString(myStringOps::strReverseNonStatic, inStr);
        String outStr1 = myStringOps.strReverseNonStatic(inStr);

        System.out.println(inStr);
        System.out.println(outStr);
        System.out.println(outStr1);


    }


}
