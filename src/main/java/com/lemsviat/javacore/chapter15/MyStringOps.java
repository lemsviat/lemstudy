package main.java.com.lemsviat.javacore.chapter15;

import org.jetbrains.annotations.NotNull;

public class MyStringOps {
    static @NotNull String strReverse (String str){
        StringBuilder reversed= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    @NotNull String strReverseNonStatic (String str){
        StringBuilder reversed= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
