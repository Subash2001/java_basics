package com.subash;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {21,23,45,88,45,66,-3,21,88,3,5};
        int target = 34;
        System.out.println(linearSearch(num , target));
        System.out.println(linearSearch1(num , target));
        System.out.println(linearSearch2(num , target));
    }

    // Search in the array : return the index if item found
    // otherwise if item not found return -1.
    static int linearSearch (int[] arr , int target){
        if (arr.length == 0){  // arr.length is a variable.
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target.
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return 0;
    }

    // search the element if not found return the target element;
    static int linearSearch1 (int [] arr , int target){
        if (arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return element;
            }
        }
        return Integer.MIN_VALUE;
    }

    // search the target return true or false;
    static boolean linearSearch2(int [] arr , int target ){
        if (arr.length == 0){
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return true;
            }
        }
        return false;
    }
}