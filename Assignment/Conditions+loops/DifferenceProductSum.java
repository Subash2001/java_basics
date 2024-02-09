package com.subash;

public class DifferenceProductSum {

    //  Q : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

    public static void main(String[] args) {
        int n = 234;
        int result = calculateDifference(n);
        System.out.println("The difference between the product and sum of digits is: " + result);
    }

    public static int calculateDifference(int n) {
        // Initialize variables to store product and sum
        int product = 1;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        // product and sum
        int difference = product - sum;
        return difference;
    }
}


