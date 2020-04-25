package com.company;

public class Main {
    public static void main(String[] args) {
        double[][] arr = {{2, -4, -2, 2, -4, 0},
                {-2, -4, -6, -6, -6, -4},
                {0, -4, -4, 2, 4, 2},
                {-2, 0, -2, -4, 0, -2}};
	    Matrix A = new Matrix(arr);
	    A.show();
	    A.opRow(4, 1, 1, false);
	    A.opRow(4, 3, -1, true);
	    A.opRow(2, 1, 1, false);
	    A.opRow(3, 2, -1/2.0, true);
	    A.opRow(4, 3, 1, true);
	    A.swapCol(5, 6, true);
        A.multiplyRow(1, 1/2.0, false);
        A.multiplyRow(2, -1/8.0, false);
        A.multiplyRow(4, 1/4.0, true);
        A.swapCol(4, 3, false);
        A.swapCol(5, 4, true);
        A.opRow(3, 4, -9/4.0, true);
        A.opRow(2, 4, -5/4.0, false);
        A.opRow(2, 3, -1/2.0, false);
        A.opRow(1, 4, 2, false);
        A.opRow(1, 3, 1, true);
        A.swapCol(6, 3, true);
    }
}
