package main.java.com.lemsviat.javacore.chapter18;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ComparatorFirstName implements Comparator<String> {
    public int compare (@NotNull String a, String b){
        return a.compareToIgnoreCase(b);
    }
}
