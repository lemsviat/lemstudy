package main.java.com.lemsviat.javacore.chapter06;

import java.util.Objects;

public class Box {
        double width;
        double height;
        double depth;

    public Box() {
        System.out.println("Конструктор по умолчанию с размерами -10*10*10");
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

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
        void setDim(double width, double height, double depth){
            this.width=width;
            this.height=height;
            this.depth=depth;
        }
}
