package com.chandrakant;

import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] numbs = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbs)); // [1,2,3,4]
        change(numbs);
        System.out.println(Arrays.toString(numbs)); //[99,2,3,4]
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
