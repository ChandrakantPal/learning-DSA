package com.chandrakant;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
datatype[][] arr = new datatype[size][]
        int[][] arr = new int[3][];
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
*/
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        //input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        /*
output
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print (arr[row][col] + " ");
            }
            System.out.println();
        }
*/
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
