package com.chandrakant;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        largestAltitude(arr);
        System.out.println("Hello world!");
    }

    static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        for (int i = 0; i < altitudes.length - 1; i++) {
            altitudes[i+1] = sum(gain, i );
        }
        System.out.println(Arrays.toString(altitudes));
        return largest(altitudes);
    }

    static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    static int sum(int[] arr, int last) {
        int sum = 0;
        for (int i = 0; i <= last; i++) {
            sum += arr[i];

        }
        return sum;
    }
}