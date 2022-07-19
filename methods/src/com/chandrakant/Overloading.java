package com.chandrakant;

public class Overloading {
    public static void main(String[] args) {
//        fun(67);
        fun("Chandrakant");
        sum(2, 4);
        sum(6, 8, 4);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("First");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second");
        System.out.println(name);
    }

}
