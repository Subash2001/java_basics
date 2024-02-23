package com.subash;

public class SmallestLetterGreaterTarget {
    public static void main(String[] args) {
        //  Q : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

        char[] letter = {'a', 'b', 'c', 'd'};
        char target = 'f';
        char ans = nextGreatestLetter(letter, target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}