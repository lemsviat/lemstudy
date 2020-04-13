package main.java.com.lemsviat.javacore.chapter18;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        return t1.compareTo(s);
    }
}
