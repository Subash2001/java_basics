package com.subash;

public class SearchInMountain {
    // Q : https://leetcode.com/problems/find-in-mountain-array/
    // this not full answer but this an algo of this question.
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr , target);
        System.out.println(ans);
    }

    static int search (int [] arr, int target ){
        int peak = mountainArray(arr);
        int firstTry = binarySearch(arr , target , 0, peak);
        if (firstTry !=-1){
            return firstTry;
        }
        // try to search in second half
        return binarySearch(arr , target , peak+1 , arr.length-1);
    }
    static int mountainArray (int [] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (arr [mid] > arr [mid+1]){
                end = mid ;
            }else {
                start = mid +1;
            }
        }
        return start;
    }

    static int binarySearch (int [] arr , int target ,int start , int end){

        boolean isAscending = arr [start] < arr [end];
        while (start < end) {
            int mid = start + (end - start) /2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending){
                if (target < arr[mid]) {
                    end = mid -1;
                } else {
                    start = mid +1;
                }
            }else {
                if (target > arr[mid]){
                    start = mid -1;
                }else {
                    end = mid+1;
                }
            }
        }
        return -1;
    }
}
