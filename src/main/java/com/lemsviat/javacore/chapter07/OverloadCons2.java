package main.java.com.lemsviat.javacore.chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box1 mybox1=new Box1(10,20,15);
        Box1 mybox2=new Box1();
        Box1 mycube=new Box1(7);

        Box1 myclone=new Box1(mybox1);

        double vol;
        vol=mybox1.returnVolume();
        System.out.println("Объем mybox1 равен "+vol);
        vol=mybox2.returnVolume();
        System.out.println("Объем mybox2 равен "+vol);
        vol=mycube.returnVolume();
        System.out.println("Объем mycube равен "+vol);
        vol=myclone.returnVolume();
        System.out.println("Объем myclone равен "+vol);

        System.out.println(mybox1.toString());
    }
}
