package com.subash.recursion.arrayquestions;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,4,3,8,5,6,2};
        System.out.println(isSorted(arr , 0));
    }
    static boolean isSorted(int[] arr, int index){
        // base condition
        if (index == arr.length -1){
            return true;
        }
        return arr[index] < arr [index+1] && isSorted(arr , index +1);
    }
}