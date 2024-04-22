package com.subash.recursion.level1questions;

public class NumberOfSteps {
    // Q: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public static void main(String[] args) {
        int ans = numberOfSteps(14);
        System.out.println(ans);
    }
    static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
