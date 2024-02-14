package com.subash;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 2));
    }
    static int max(int [] arr){
        if (arr.length == 0){
            return -1;
        }

        int maxValue =arr [0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    // work on edge case here, like array being null
    static int maxRange(int []arr , int start , int end){
        if (end >start){
            return -1;
        }

        if (arr == null){
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>maxValue){
                maxValue =arr[i];
            }

        }
        return maxValue;
    }
}
