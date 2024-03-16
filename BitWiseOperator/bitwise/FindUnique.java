package com.subash.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
    static int ans (int[] arr){
        int unique = 0;
        for (int n : arr){
            // xor -  ^= : same num is 0 , any one is not same with other that will the ans
            unique ^= n;

        }
        return unique;
    }
}