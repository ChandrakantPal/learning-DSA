package com.sanjay;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int num = 0; num < 5; num++) {
            System.out.println(num);
        }

        int n = in.nextInt();
        for (int num = 1; num <= n; num++) {
            System.out.print("Hello World");
        }
    }

}
