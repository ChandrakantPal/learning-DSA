package com.chandrakant;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 3, 2));
    }

    static int maxInRange(int[] arr, int start, int end) {
        if (end < start || arr == null || arr.length == 0) return -1;
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    //imagine that arr is not empty
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
}
