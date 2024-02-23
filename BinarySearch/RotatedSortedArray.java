package com.subash;

public class RotatedSortedArray {
    public static void main(String[] args) {
        // q : https://leetcode.com/problems/search-in-rotated-sorted-array/description/
        int[] nums = {3,4,5,6,6,1,2};
        int target = 6;
        int ans =  Search(nums , target);
        System.out.println(ans);
        //System.out.println(findPivot(arr));
    }

    /*
       rotated array means [1,3,4,5,6,7]
       1st rotation last element will come at first [7,1,3,4,5,6]
       2nd rotation [6,,7,1,3,4,5,6]
       same for this all numbers.

       pivot mean largest element in the array
       method to find pivot
       search in 1st half ( 0 to pivot )
       otherwise search in 2nd half [pivot + 1]

    */
    static int Search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find the pivot, it means the array is not rotated

        if (pivot == -1) {
            // normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if pivot is found , you have found 2 ascending sorted array
        if (nums[pivot] == target) {
            return pivot;
        }
        // pivot -1 before the pivot element;
        if (target >= nums [0]){
            return binarySearch(nums , target , 0 , pivot -1);
        }
        // pivot +1 after the pivot in element
        return binarySearch(nums , target , pivot +1, nums.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <  arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // case 1 : pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // cse 2 :
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // case 3 :
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicate (int [] arr ){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (mid < end && arr [mid] > arr [mid +1]) {
                return mid;
            }
            if (mid > start && arr [mid] < arr [mid -1]){
                return mid -1;
            }
            // if element at middle, start, and equal then just skip the duplicates

            if (arr [mid] == arr [start] && arr[mid] == arr [end] ){
                // skip duplicates
                // NOTE :  what if these element at start and were the pivot ??
                // check if start is pivot
                if (arr [start] > arr [start +1]){
                    return start;
                }
                start ++;

                // check the end pivot
                if (arr[end] < arr[end -1]) {
                    return end -1;
                }
                end --;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr [mid] || arr[start] == arr[mid] && arr[mid] > arr [end] ) {
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
