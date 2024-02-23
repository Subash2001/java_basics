package com.subash;

public class InfiniteArray {
    public static void main(String[] args) {
        // Q : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

        int [] arr = {3,5,6,8,9,22,34,56,77,88,90,112,133};
        int target = 9;
        System.out.println(ans(arr , target));

    }
    static  int ans(int [] arr , int target){
        // find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]){
            int temp = end  +1;
            // double the box value
            // end = previous end + sizeOfBox *2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr , target ,start , end);
    }
    static int binarySearch(int [] arr , int target , int start , int end){

        while (start <= end){
            int mid = start + (end - start) /2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start =mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
