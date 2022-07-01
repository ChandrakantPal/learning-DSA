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

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); //257 % 256 = 1

//        byte a = 40;
//        byte b  = 50;
//        byte c = 100;
//        int d = a*b/c; // a*b exceeds the byte can handle but while evaluating the a*b is converted to int
//        System.out.println(d);

//        byte b = 50;
//        b = b*2;  this throws an error because while evaluating the expression it is converted to an int which cannot be reassigned to byte b

        int number = 'A';
        System.out.println(number); // results 65
    }
}
