package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arr2 = new int[3];
        System.out.println();
        System.out.println(Arrays.toString(arr2));

        // fill up array with random numbers
        System.out.println("What is the size of the array you want?");
        int len = s.nextInt();

        int[] arr = new int[len];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("print array using for-each");
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("==========================");

        // 1 2
        // 7 8 9
        // 9 9 9 9
        int[][] matrix1 = { {1,2}, {7,8,9}, {9,9,9,9} };
        System.out.println(matrix1[0][1]);

        int[][] matrix2 = new int[ 3 ][ 2 ]; // must be 3 x 2
        System.out.println(matrix2[0][0]); // ok

        int[][] jagged = new int[ 3 ][]; // jagged
        //System.out.println(matrix3[0][0]); // error
        jagged[0] = new int[4];
        System.out.println(jagged[0][0]); // ok


    }
}
