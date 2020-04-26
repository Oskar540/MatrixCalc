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
                System.out.print(fmt(values[i][j]) + "  ");
                if(values[i][j]<0 || values[i][j] != (long)values[i][j] || values[i][j] >= 10)
                    System.out.print("\b");
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
    void opRow(int w1, int w2, double multiplier){
        opRow(w1, w2, multiplier, true);
    }
    void multiplyRow(int w1, double multiplier, boolean wantDisplay){
        for(int i = 0; i < values[w1 - 1].length; i++){
            values[w1 - 1][i] *= multiplier;
        }
        if(wantDisplay) show();
    }
    void multiplyRow(int w1, double multiplier){
        multiplyRow(w1, multiplier, true);
    }
    void swapRow(int w1, int w2, boolean wantDisplay){
        double[] tmp = values[w1 - 1];
        values[w1 - 1] = values[w2 - 1];
        values[w2 - 1] = tmp;
        if(wantDisplay) show();
    }
    void swapCol(int x1, int x2, boolean wantDisplay){
        int iX1 = 0;
        int iX2 = 0;
        for (int i = 0; i < x.length; i++) {
            if(x[i] == x1) iX1 = i;
            if(x[i] == x2) iX2 = i;
        }

        double[] tmp = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            tmp[i] = values[i][iX1];
            values[i][iX1] = values[i][iX2];
            values[i][iX2] = tmp[i];
        }
        int tmpX;
        tmpX = x[iX1];
        x[iX1] = x[iX2];
        x[iX2] = tmpX;
        if(wantDisplay) show();
    }
    private static String fmt(double d)
    {
        if(d == (long) d)
            return String.format("%d",(long)d);
        else
            return String.format("%s",d);
    }
}
