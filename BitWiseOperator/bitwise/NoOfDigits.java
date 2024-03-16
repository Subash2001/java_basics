package com.subash.bitwise;

public class NoOfDigits {
    public static void main(String[] args) {
        // finding the digits in binary, decimal, octal
        // log (n) complexity : no of digit is no os complexity.
        int n = 11;
        int b = 2;

        int ans = (int)(Math.log(n)/ Math.log(b)) + 1;

        System.out.println(ans);
    }
}
