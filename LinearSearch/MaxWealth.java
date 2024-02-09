package com.subash;

public class MaxWealth {
    public static void main(String[] args) {
        /*
            Q ; A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
            https://leetcode.com/problems/richest-customer-wealth/
         */
    }
    static int maximumWealth(int [][] accounts){
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
