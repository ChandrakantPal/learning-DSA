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

    static int optimisedOddCells(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]] ^= true;
            col[indices[i][1]] ^= true;
        }
        int r = 0;
        int c = 0;
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                r++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (col[i]) {
                c++;
            }
        }

        return ((r * n) + (c * m) - (2 * r * c));
    }
}
