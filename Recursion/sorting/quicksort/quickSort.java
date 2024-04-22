package com.subash.recursion.sorting.quicksort;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort (int[] num, int low, int high){
        if (low >= high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = num[mid];
        // also a reason why if its already sorted it will not swap
        while (start <= end){
            while (num[start] < pivot ){
                start++;
            }
            while (num[end] > pivot){
                end--;
            }

            if (start <= end){
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }
        // now my pivot is at correct index, please sort two halves now
        sort(num, low , end);
        sort(num, high, start);
    }
}
