package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = s.next();

        System.out.println(String.format("Hello %s %d!",name, 1));
        // shorter
        System.out.format("Hello %s %d! \n",name, 1);

        //System.out.printf();

        // `Hello ${name} !`

        // for 3 numbers array of int
        //int[] numbers = new int[3]; // {0, 0, 0}
        //numbers[0] = s.nextInt();

        // use scanner to input 2 numbers from the user
        // a , b
        // if a > b
        // print this using format: a > b
        // 2, -4
        // 2 > -4

        int a1, b1;
        System.out.println("insert number 1:");
        a1 = s.nextInt();
        System.out.println("insert number 2:");
        b1 = s.nextInt();
        System.out.printf("%d > %d \n", a1 > b1 ? a1 : b1, a1 < b1 ? a1 : b1);

        int a, b, c;
        System.out.println("insert number 1:");
        a = s.nextInt();
        System.out.println("insert number 2:");
        b = s.nextInt();
        System.out.println("insert number 3:");
        c = s.nextInt();
        System.out.printf("%d > %d > %d", a > b && a > c ? a : b > c ? b : c,
                                          a > b && a < c ? a : b > a && b < c ? b : c,
                                          a < b && a < c ? a : b < a && b < c ? b : c);
    }
}
