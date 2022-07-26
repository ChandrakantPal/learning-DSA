package com.chandrakant;

public class OderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 12, 16, 19, 25, 36, 48};
        System.out.println(orderAgnosticBS(arr, 16));
        int[] arr2 = {90, 80, 70, 60, 50, 40, 30, 20, 10, 9, 8, 6};
        System.out.println(orderAgnosticBS(arr2, 60));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            // int mid = (start + end ) / 2; // might be possible that (start + end ) exceeds the range of int
            int mid = start + (end - start) / 2; // (2s + e -s)/2=(s+e)/2

            if (target == arr[mid]) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
