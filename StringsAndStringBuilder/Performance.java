package com.subash;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series = series + ch; // series += ch : also same
            System.out.println(ch);
        }
        System.out.println(series);
    }
}
