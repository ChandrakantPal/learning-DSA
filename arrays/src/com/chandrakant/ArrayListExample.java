package com.chandrakant;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //syntax
        //ArrayList<Datatype> variable_name = new ArrayList<>()
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        System.out.println(list.contains(2223));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
//        System.out.println(list);
    }
}
