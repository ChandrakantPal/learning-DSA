package com.sanjay;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num  = input.nextFloat();
//        System.out.println(num);

        //type casting
        int num = (int)(42.54f);
        System.out.println(num);

    }
}
