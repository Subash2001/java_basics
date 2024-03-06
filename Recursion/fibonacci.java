package com.subash;

public class fibonacci {
    public static void main(String[] args) {
        int ans = Fibonacci(5);
        System.out.println(ans);
    }
    static int Fibonacci(int n){
        // base condition
        if (n < 2){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
}
