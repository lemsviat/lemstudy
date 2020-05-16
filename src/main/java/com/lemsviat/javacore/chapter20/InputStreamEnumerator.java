package main.java.com.lemsviat.javacore.chapter20;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }
    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }
    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream (files.nextElement().toString());
        } catch (Exception e) {
            return null;
        }
    }
}
