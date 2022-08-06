package com.chandrakant;

import java.util.Arrays;

public class OddCell {
    public static void main(String[] args) {
        int[][] indices = {
                {0, 1},
                {1, 1}
        };
        System.out.println(oddCells(2, 3, indices));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[indices[i][0]][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][indices[i][1]]++;
            }
        }

        return checkForOdd(arr);
    }

    static int checkForOdd(int[][] arr) {
        int noOfOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                noOfOdd += arr[i][j] % 2;
            }
        }
        return noOfOdd;
    }
}
