package com.subash;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9};
        int target = 3;
        int [] ans =searchRange (nums , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange ( int [] nums , int target){

        int [] ans = { -1 ,-1 };

        // check for first occurrence if target first

        ans [0] = searchRange1(nums , target , true); // log n
        if (ans [0] != -1) {
            ans[1] = searchRange1(nums, target, false);
        }
        return ans;
    }

    // this function just return the index value of target
    static int searchRange1 (int [] nums , int target, boolean findStartIndex){
        int  ans = -1 ;
        int start = 0 ;
        int end = nums.length-1;
        while (start <= end ){
            int mid = start + (end - start) / 2 ;
            if (target < nums [mid]){
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }else {
                ans = mid;
                if (findStartIndex){
                    end = mid -1;
                }else {
                    start = mid +1;
                }

            }
        }
        return ans;
    }
}
