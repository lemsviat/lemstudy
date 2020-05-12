package main.java.com.lemsviat.javacore.chapter15;

public class HighTemp {
    private int hTemp;

    public HighTemp(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThanTemp2(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }

    public int gethTemp() {
        return hTemp;
    }
}
