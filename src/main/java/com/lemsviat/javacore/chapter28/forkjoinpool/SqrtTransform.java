package main.java.com.lemsviat.javacore.chapter28.forkjoinpool;

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000; //пороговое значение разбиения на подзадачи

    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    // Если количество элементов меньше порогового значения, то выполнить дальнейшую обработку последовательно
    protected void compute() {
        if (end - start < seqThreshold) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }else{ // в противном случае продолжить разделение данных на меньшие части
            // найти середину
            int middle=(start+end)/2;
            // запустить новые подзадачи на выполнение, используя разделенные на части данные
            invokeAll(new SqrtTransform(data,start,middle), new SqrtTransform(data,middle,end));
        }

    }
}
