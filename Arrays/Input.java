package com.subash;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array of primitives.
        int [] arr = new int[5];
        arr [0] = 4;
        arr [1] = 13;
        arr [2] = 103;
        arr [3] = 3463;
        arr [4] = 77;

        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            // length is an integer variable. that represent the before mentioned length of the integer
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // arrays covert into String. this best way to print an arrays.

        // enhanced for loop  or for each loop
//        for (int num : arr) {
////            /*
////                here num represent the element of the array. what is entered before in arr[i].
////                for every element in the print the element.
////             */
//            System.out.print(num);  // System.out.println(num[5]); // index out of bound error.
//        }

        // array of object
        String[] str = new String[5];
        for (int j = 0; j < str.length; j++) {
            str[j] = input.next();
        }
        System.out.println(Arrays.toString(str));

        // modify the original object.
        str[1]= "subash";
        System.out.println(Arrays.toString(str));

    }
}
