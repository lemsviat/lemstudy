package main.java.com.lemsviat.javacore.chapter05;

public class Search {
    public static void main(String[] args) {
        int[] nums ={6,8,3,7,5,6,1,4};
        int val=5;
        boolean found=false;
        int index=0;

        for (int x:nums) {
            if (x==val)
            {
                found=true;
                break;
            }
            index++;
        }
        System.out.println(val+" находится в позиции с индексом "+index);
    }
}
