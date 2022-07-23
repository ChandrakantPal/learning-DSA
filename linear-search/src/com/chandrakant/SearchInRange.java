package com.chandrakant;

public class SearchInRange {
    public static void main(String[] args) {
    int[] nums = {1,4,5,7,8,9};
        System.out.println(linearSearch(nums, 5,1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
