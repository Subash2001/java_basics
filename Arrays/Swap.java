package com.subash;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {3 , 4, 6 ,7 ,8};
       // swap(arr, 1,2);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // swap
    static void swap (int [] arr, int index1, int index2 ){
        int tem = arr[index1];
        arr [index1] = arr[index2];
        arr[index2]=tem;
    }

    // reverse the array
    // 2 pointer method.
    static void reverse (int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            // swap the element.
            swap(arr, start, end);
            start ++;
            end --;
        }

    }
}
