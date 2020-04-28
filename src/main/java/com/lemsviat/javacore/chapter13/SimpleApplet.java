package main.java.com.lemsviat.javacore.chapter13;

import org.jetbrains.annotations.NotNull;

import java.applet.Applet;
import java.awt.*;

/*<applet code="SimpleApplet" width=200 height=бO>
</applet>*/

public class SimpleApplet extends Applet {
    public void paint(@NotNull Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
