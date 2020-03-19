package main.java.com.lemsviat.javacore.chapter03;

public class ScopeErr {
    public static void main(String[] args) {
        int bar=1;
        {
            //int bar=2; // there is another 'bar' in the scope
        }
    }
}
