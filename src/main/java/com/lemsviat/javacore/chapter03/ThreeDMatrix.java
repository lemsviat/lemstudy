package main.java.com.lemsviat.javacore.chapter03;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] theeD = new int[3][4][5];
        for (int i = 0; i <3; i++)
            for (int j = 0; j <4; j++)
                for (int k = 0; k <5; k++) {
                    theeD [i][j][k]=i*j*k;
                }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++){
                for (int k = 0; k <5; k++)
                    System.out.print(theeD[i][j][k]+" ");
                    System.out.println();
            }
        System.out.println();
        }
    }
}
