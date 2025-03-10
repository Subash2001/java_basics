package com.subash.recursion.level1questions;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = product(1342);
        System.out.println(ans);
    }
    static int product(int n){
        if (n%10 == n){ // one digit remaining return that digit
            return n;
        }
        return (n % 10) * product(n/10);
    }
}
