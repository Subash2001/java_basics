package com.subash;

public class EvenDigits {
    public static void main(String[] args) {
        /*
            Q: 1295. Find Numbers with Even Number of Digits.
            https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
         */
        int [] nums = {12,345,2,6,7896};
        System.out.println("Numbers with Even Number : " + findNumbers(nums));
        // finding number of digits
        System.out.println("Number of digits in this number : "+ digits2(7890));
    }
    static int findNumbers(int [] nums){
        int count =0;
        for (int num : nums) {
            if (even (num)){
                count ++;
            }
        }
        return count;
    }
     // function to check whether a number ? even digits or not .
 static boolean even(int num) {
        int numberOfDigits = digit(num);
        /*
           if (numberOfDigits %2 == 0){
            return true;
           }
            return false;
        */
     return numberOfDigits % 2 == 0 ;

    }

 // count a number of digit in a number
 static int digit (int num ){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count ++;
            num = num/10;
        }
        return count;
 }
 // shortcut to find the digits.
 static int digits2(int num){
     if (num < 0) {
         num = num * -1;
     }
        return (int) (Math.log10(num)) +1 ;
 }
}
