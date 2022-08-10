package com.chandrakant;

import java.util.ArrayList;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};
        System.out.println(addToArrayForm(arr, 34));
    }

    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        int number = 0;
        for (int i = 0; i < num.length; i++) {
            number += num[num.length - 1 - i] * Math.pow(10, i);
        }
        return numberToArray(number + k);
    }

    static ArrayList<Integer> numberToArray(int num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (num > 0) {
            arr.add(num % 10);
            num /= 10;
        }
        return arr;
    }
}
