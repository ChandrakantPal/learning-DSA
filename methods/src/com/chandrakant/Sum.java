package com.chandrakant;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//    sum();
//    int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(10, 20);
        System.out.println(ans);
        int a = 10;
        int b = 20;
        swap(a, b);

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static int sum3(int num1, int num2) {
        return num1 + num2;
    }


}
