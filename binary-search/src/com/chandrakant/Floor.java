package com.chandrakant;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 12, 16, 19, 25, 36, 48};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(arr[ans]);
    }

    //return the index the greatest no <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end ) / 2; // might be possible that (start + end ) exceeds the range of int
            int mid = start + (end - start) / 2; // (2s + e -s)/2=(s+e)/2

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer
                return mid;
            }
        }
        return end;
    }
}
