package com.subash.recursion.bubblesortandselectionsort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,4,3,2,1};
        sort(arr, arr.length-1, 0 );
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int row, int column){
        if (row == 0){
            return;
        }
        if (column < row){
            if (arr[column] > arr[column+1]){  // before element > next element
                // swap
                int temp = arr[column];
                arr[column] = arr[column+1];
                arr[column+1] = temp;
            }
            sort(arr, row , column+1);
        } else {
            sort(arr, row-1, 0);
        }
    }
}