package com.chandrakant;

// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int personWealth = 0;
            for (int account : person) {
                personWealth += account;
            }
            if (personWealth > max) max = personWealth;
        }
        return max;
    }
}
