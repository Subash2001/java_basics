package com.subash;
public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,8,54,345,456};
        int target = 8;
        int ans = orderAgnosticBs(arr , target);
        System.out.println(ans);
    }

    static int orderAgnosticBs(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return -1;
    }
}
