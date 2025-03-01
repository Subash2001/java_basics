package com.subash;

import java.util.Arrays;

public class missingNumber {
    // Q : https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {
        int [] arr = {3,0,1};
        MissingNumber(arr);
        System.out.println(Arrays.toString(arr));

    }
     static int MissingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length ){
            int correct = arr[i];
            // less than n - num.length
            if (arr [i] < arr.length && arr[i] != arr [correct]){
                swap (arr ,i, correct );
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        // case 2
        return arr.length;
    }
    static void swap (int[] arr, int first ,int second){
        int temp = arr [first];
        arr [first] = arr[second];
        arr [second] = temp;
    }
}