package main.java.com.lemsviat.javacore.chapter07;

public class RecTest {
    int[] values;
    RecTest (int i){
        values=new int[i];
    }
    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("["+(i-1)+"] "+values[i-1]);
    }
}
