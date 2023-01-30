package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = s.next();

        System.out.println(String.format("Hello %s %d!",name, 1));
        System.out.format("Hello %s %d!",name, 1);
                           // `Hello ${name} !`

        // use scanner to input 2 numbers from the user
        // a , b
        // if a > b
        // print this using format: a > b
        // 2, -4
        // 2 > -4
    }
}
