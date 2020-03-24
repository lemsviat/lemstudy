package main.java.com.lemsviat.javacore.chapter06;

import java.util.Objects;

public class Box {
        double width;
        double height;
        double depth;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            main.java.com.lemsviat.javacore.chapter06.Box box = (main.java.com.lemsviat.javacore.chapter06.Box) o;
            return Double.compare(box.width, width) == 0 &&
                    Double.compare(box.height, height) == 0 &&
                    Double.compare(box.depth, depth) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(width, height, depth);
        }

        void volume (){
            System.out.println("Объем равен "+ width*height*depth);
        }
        double returnVolume (){
        return (width*height*depth);
        }
}
