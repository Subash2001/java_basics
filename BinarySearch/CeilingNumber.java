package com.subash;

public class CeilingNumber {
    public static void main(String[] args) {
        // Q : ceiling a number ; ceiling means smallest element in array |  greater or equal to target.
        // floor = greatest number |   smaller or equal to target
        int [] arr = {2,3,4,6,8};
        int target = 7;
        int ans = ceilingNumber(arr , target);
        System.out.println(ans);
    }
    // return the index smallest number >= target
    static int ceilingNumber (int [] arr, int target){

        // but what if the target is greater than the greatest number in the array
        if (target > arr [arr.length-1] ){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
            return mid;
            }
        }
        return start;
    }
}
