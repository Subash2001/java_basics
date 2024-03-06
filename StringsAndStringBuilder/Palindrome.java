package com.subash;

public class Palindrome {
    public static void main(String[] args) {
        // Q: https://leetcode.com/problems/valid-palindrome/description/
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));

    }

    static boolean isPalindrome(String str) {
//        if (str == null || str.length() == 0) {
//            return true;
//        }
        // removing all non-alphanumeric characters
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
