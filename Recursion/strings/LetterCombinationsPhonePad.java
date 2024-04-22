package com.subash.recursion.strings;

import java.util.ArrayList;

public class LetterCombinationsPhonePad {
    // Q: https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padReturn("", "12")); // .size() -->
        System.out.println(returnCount("", "12"));
    }

    static void pad(String process, String unProcess){
        if (unProcess.isEmpty()){
            System.out.println(process);
            return;
        }
        int digit = unProcess.charAt(0) - '0'; // this will convert '2' into 2 --> char to int
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            pad(process + ch , unProcess.substring(1));
        }
    }

    static ArrayList<String> padReturn(String process, String unProcess) {
        if (unProcess.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }
        int digit = unProcess.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padReturn(process + ch, unProcess.substring(1)));
        }
        return ans;
    }

    static int returnCount(String process, String unProcess){
        if (unProcess.isEmpty()){
            return 1;
        }
        int digit = unProcess.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            char ch = (char) ('a' + i);
            count = count + returnCount(process + ch, unProcess.substring(1));
        }
        return count;
    }
}
