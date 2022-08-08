package com.chandrakant;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
        };
        int[][] ans = transpose(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
