package com.chandrakant;

public class Main {
    public static void main(String[] args) {
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
//        //or directly
//        int[] rnos2 = {12, 34, 56, 78, 90};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in memory
        //[0,0,0,0,0]
        //System.out.println(ros[1]);//output 0

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}