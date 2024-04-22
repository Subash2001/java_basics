package com.subash.recursion.basic;

public class fibonacci {
    public static void main(String[] args) {
        int ans = Fibonacci(5);
        System.out.println(ans);
        for (int i = 0; i < 11; i++) {
            System.out.println(FibonacciFormula(i));
        }
    }

    static int FibonacciFormula (int n){
        // use long instead
       return (int)(Math.pow(((1+Math.sqrt(5)) /2 ), n) / Math.sqrt(5));
    }
    static int Fibonacci(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}