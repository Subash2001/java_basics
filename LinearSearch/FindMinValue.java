package com.subash;

public class FindMinValue {
    public static void main(String[] args) {
        int [] arr = {4,24,56,77,43,5};
        System.out.println(min(arr));
    }

    // assume arr.length !=0
    // return the minimum value in array
    static int min (int[] arr ){
        int ans = arr [0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]< ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
