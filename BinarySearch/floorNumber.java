package com.subash;

public class floorNumber {
    public static void main(String[] args) {
        int [] arr = {2, 4, 6, 79,434};
        int target = 4;
        int ans = floor(arr , target);
        System.out.println(ans);
    }
    // return the index greatest number <= target
    static int floor(int [] arr , int target ){
        int start =0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) /2;
            if (target > arr[mid]){
                start = mid +1;
            } else if (target < arr[mid] ) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return end;
    }
}
