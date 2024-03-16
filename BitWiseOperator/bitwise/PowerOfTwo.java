package com.subash.bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        // find power of two
        int n = 15; // note: fix for n = 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
