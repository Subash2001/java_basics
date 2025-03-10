package com.subash;

public class RotationCount {
    public static void main(String[] args) {
        // Q: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotation(arr));

    }
    static int countRotation (int [] arr){
        int pivot = FindPivot(arr);

        return pivot + 1;
    }
    // non duplicates
    static int FindPivot (int [] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (mid < end && arr [mid] > arr [mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid -1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }

    // duplicate
    static int FindingDuplicate  (int [] arr ){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) /2;

            if (mid < end && arr[mid] > arr [mid + 1]){
                return mid;
            }
            if (mid > start && arr [mid] < arr [mid -1]){
                return mid-1;
            }
            // rotation
            if (arr[mid] == arr[start] && arr[mid]== arr[end]){
                // skip
                if (arr[start] > arr[start +1]){
                    return start;
                }
                start ++;
                if (arr[end] < arr[end -1]){
                    return end-1;
                }
                end --;
            } else if (arr [start] < arr[mid] || arr [start] == arr[mid] && arr [mid] > arr[end] ) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
