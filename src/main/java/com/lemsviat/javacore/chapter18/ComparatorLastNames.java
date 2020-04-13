package main.java.com.lemsviat.javacore.chapter18;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ComparatorLastNames implements Comparator<String> {
    public int compare(@NotNull String a, @NotNull String b) {
        int i = a.lastIndexOf(' ');
        int j = b.lastIndexOf(' ');
        return a.substring(i).compareToIgnoreCase(b.substring(j));
    }
}
