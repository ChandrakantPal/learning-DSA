package com.chandrakant;

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(diagonalSum(arr));

    }

    static int diagonalSum(int[][] mat) {
        int primaryDiagonal = Integer.MIN_VALUE;
        int secondaryDiagonal = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            primaryDiagonal += mat[i][i];
            if (mat.length - 1 - i != i) {
                secondaryDiagonal += mat[i][mat.length - i - 1];
            }
        }

        return primaryDiagonal + secondaryDiagonal;
    }
}
