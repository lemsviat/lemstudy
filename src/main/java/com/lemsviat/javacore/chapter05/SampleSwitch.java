package main.java.com.lemsviat.javacore.chapter05;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i <6; i++)
            switch (i) {
                case 0:
                    System.out.println(" і равно нулю.");
                    break;
                case 1:
                    System.out.println(" і равно единице.");
                    break;
                case 2:
                    System.out.println(" і равно двум.");
                    break;
                case 3:
                    System.out.println(" і равно трем.");
                    break;
                default:
                    System.out.println(" і равно больше трех.");
            }
    }
}
