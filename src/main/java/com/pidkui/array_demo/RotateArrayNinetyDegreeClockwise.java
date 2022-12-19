package com.pidkui.array_demo;

public class RotateArrayNinetyDegreeClockwise {
    public static void main(String[] args) {

        int row = 4;
        int column = 4;

        int a[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int b[][] = new int[row][column];

        for (int j = 0; j < column; j++) {
            for (int i = row - 1; i >= 0; i--) {
//                System.out.print(a[i][j] + " ");
                b[j][(row - 1) - i] = a[i][j];
            }
//            System.out.println();
        }

        for (int x[] : b) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
