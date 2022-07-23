package com.chandrakant;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 6},
                {2, 7},
                {4, 5, 9, 11, 16}
        };
        System.out.println(Arrays.toString(search(arr, 19)));
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > ans) ans = anInt;
            }
        }
        return ans;
    }

    static int[] search(int[][] arr, int target) {
        int[] not_found = {-1, -1};
        if (arr.length == 0) return not_found;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[]{i, j};

            }
        }
        return not_found;
    }
}
