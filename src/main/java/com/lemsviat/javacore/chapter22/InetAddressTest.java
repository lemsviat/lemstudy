package main.java.com.lemsviat.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        Address=InetAddress.getByName("www.dou.ua");
        System.out.println("Address = " + Address);

        InetAddress[] SW =InetAddress.getAllByName("www.amazon.com");
        for (InetAddress inetAddress : SW) {
            System.out.println("SW = " + inetAddress);
        }
    }
}
