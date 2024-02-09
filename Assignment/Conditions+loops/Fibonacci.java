package com.subash;

public class Fibonacci {
    // Q : Fibonacci Series In Java Programs.
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 2;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i <= n; i++) {
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
            System.out.println(nextTerm);
        }
    }
}
