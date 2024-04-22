package com.subash.recursion.bubblesortandselectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,8,2};
        sort(arr, arr.length, 0, 0 );
        System.out.println(Arrays.toString(arr));
    }
    static void sort (int[] arr, int row, int column, int max){
        if (row == 0){
            return;
        }
        if (column < row){
            if (arr[column] > arr[max]){ // MAX= INDEX
                sort(arr, row, column+1, column);
        } else {
             sort(arr, row, column+1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            sort(arr, row-1, 0, 0);
        }
    }
}