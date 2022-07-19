package com.chandrakant;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//           int a = 7; // already initialised outside the block in the same method, hence you cannot initialise it again
            a = 45; // reassign the origin ref variable to some other value
            System.out.println(a);
            int c = 19;
            // values initialised in this block will remain in the block
        }
        int c = 16;
        System.out.println(a);
//        System.out.println(c); error c is not in the scope
//        System.out.println(marks); throws error since marks is not in the scope

        // scoping in for loops
        for (int i = 0; i < 7; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
//        System.out.println(a); throws error because a is not in the scope
    }
}
