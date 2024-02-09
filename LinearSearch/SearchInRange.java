package com.subash;

public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {23,3,4,5,33,24,9};
        int target = 33;
        int ans = SearchRange(arr , target , 1 , 6);
        System.out.println(ans);

    }
    static int SearchRange(int [] arr , int target , int start , int end){
        if (arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element = arr[index];
            if (element == target){
             return index;
            }
        }
        return 0;
    }
}
