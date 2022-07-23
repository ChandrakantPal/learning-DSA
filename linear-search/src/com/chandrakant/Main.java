package com.chandrakant;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, 0, 14, 55};
        System.out.println(linearSearch2(nums, 0));
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) return Integer.MAX_VALUE;
        for (int j : arr) {
            if (j == target) return j;
        }
        return Integer.MAX_VALUE;
    }

    //search the array return index if item found else return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}