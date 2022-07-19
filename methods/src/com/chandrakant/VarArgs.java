package com.chandrakant;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 4, 5);
//        fun(); prints []
        multiple(1, 2, "Chandrakant", "Pal");
        demo(1, 2, 3);
//        demo("Chandrakant", "Pal");
//        demo(); //Ambiguous method call. Both demo(int...) in VarArgs and demo(String...) in VarArgs match
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println();
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
