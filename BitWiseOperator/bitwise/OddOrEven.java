package com.subash.bitwise;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(isOdd(n));
    }
    static boolean isOdd (int n) {
        return (n & 1) == 1; // even : (n&1)==0
    }
}