package com.chandrakant;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition target should be less than arr[end]
        while (target > arr[end]) {
            int newStart = end + 1;
            // double the box value
            // end = previous end + sizeOfBox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

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
        return -1;
    }
}
