package com.subash;

public class SplitArray {
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int k = 2;
        int ans = splitArray( nums , k);
        System.out.println(ans);
    }
    static int splitArray(int [] nums , int k){
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array
            // sum of the all element
            end += nums[i];
        }

        // binary search
        while (start < end){

            int mid  = start + (end - start) /2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this in this subArray, make new one
                    // say you add this num in new subArray, then sum = num
                    sum =num;
                pieces ++;
                }else {
                    sum += num;
                }
            }
            if (pieces > k){
                start = mid +1;
            } else {
                end =mid;
            }
        }
        return end; //here start = end
    }
}
