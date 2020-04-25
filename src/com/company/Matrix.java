package com.company;

public class Matrix {
    double[][] values;
    int[] x;

    Matrix(double[][] array){
        values = array;
        x = new int[array[0].length];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
    }
    void show(){
        for (int v : x) {
            System.out.print(v + " ");
        }
        System.out.println();
        for (int i = 0; i < values.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println(" |");
        }
        System.out.println("====================");
    }
    void opRow(int w1, int w2, double multiplier, boolean wantDisplay){
        for(int i = 0; i < values[w1 - 1].length; i++){
            values[w1 - 1][i] += (double)(values[w2 - 1][i]*multiplier);
        }
        if(wantDisplay) show();
    }
    void multiplyRow(int w1, double multiplier, boolean wantDisplay){
        for(int i = 0; i < values[w1 - 1].length; i++){
            values[w1 - 1][i] *= multiplier;
        }
        if(wantDisplay) show();
    }
    void swapRow(int w1, int w2, boolean wantDisplay){
        double[] tmp = values[w1 - 1];
        values[w1 - 1] = values[w2 - 1];
        values[w2 - 1] = tmp;
        if(wantDisplay) show();
    }
    void swapCol(int x1, int x2, boolean wantDisplay){
        double[] tmp = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            tmp[i] = values[i][x1 - 1];
            values[i][x1 - 1] = values[i][x2 - 1];
            values[i][x2 - 1] = tmp[i];
        }
        int tmpX;
        tmpX = x[x1 - 1];
        x[x1 - 1] = x[x2 - 1];
        x[x2 - 1] = tmpX;
        if(wantDisplay) show();
    }
}
