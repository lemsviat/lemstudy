package main.java.com.lemsviat.javacore.chapter09;

public class Client implements Callback {
    public void callback(int param) { //метод интерфейса всегда реализуется как public
        System.out.println("Метод  callback(), вызываемый со значением "+param);
    }
    void nonIfaceMeth(){
        System.out.println("В классах, реализующих интерфейсы,"+
                            "могут определяться и другие члены.");
    }
}
