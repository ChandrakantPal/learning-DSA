package com.chandrakant;

public class ArrayFormOfInteger {
    public static void main(String[] args) {

    }

    static int addToArrayForm(int[] num, int k) {
        int number = 0;
        for (int i = num.length - 1; i <= 0; i--) {
            number += Math.pow(num[i], i - num.length - 1);
        }
        return number + k;
    }
}
