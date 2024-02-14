package com.subash;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

       // Two dimension array . it is like a matrix
        /*
            int [] [] ; first represent the rows second represent the column
            row is mandatory to need to fill in input . column is not necessary
         */
        Scanner input = new Scanner(System.in);
//        int[][] arr = new int[4][];
//        //arr[3][] = {88, 3 ,3,4} ;
//
//        System.out.println(Arrays.toString(arr));
//        another method;
//        int [][] num = {
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st index
//                {7,8,9}, // 2nd index -> num[2] = {6, 7, 8,9}
//        };
//        System.out.println(Arrays.toString(num));

        int [][] arr = new int[3][3];
        System.out.println(arr.length); // its print no of rows

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr [row][col] = input.nextInt();
            }
        }
        // output
        /* this loop run  row , and column and then loop is run outside & then again start loop. */
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(arr [row][col] + " ");
//            }
//            // should you need print every that for matrix form
//            System.out.println();
//        }

        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // enhanced for loop.
        // here data type is an array itself
        for (int [] a : arr){ // here arr every  single element itself an array
            System.out.println(Arrays.toString(a));
        }
    }
}
