package main.java.com.lemsviat.javacore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10; //переменная должна быть завершенной, то есть не изменяться далее нигде
        MyFunc myLambda = (n) -> {
            int v = num + n; //захват внешней переменной
            //num++; //тут будет ошибка, внешнюю переменную изменять нельзя
            return v;
        };
        //num = 9;
    }
}
