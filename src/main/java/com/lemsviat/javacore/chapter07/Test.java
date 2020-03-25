package main.java.com.lemsviat.javacore.chapter07;

public class Test {
    int a,b;
    public Test(int i, int j) {
        this.a = i;
        this.b = j;
    }
    boolean equals (Test o){
        if(o.a==a&&o.b==b) return true;
        else return false;
    }
    public Test() {
    }

    void meth(int i, int j){
        i*=2;
        j/=2;
    }
    void meth(Test o){
        o.a*=2;
        o.b/=2;
    }
}
