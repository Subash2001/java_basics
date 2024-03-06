package com.subash;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // a =97
        System.out.println("a" + "b");
        System.out.println((char )('a' + 1));
        System.out.println("a" + 1);
        // this is same as after a few steps "a" + "1"
        // when integer is concatenated with string converted into wrapper class
        // integer will be converted to Integer that will call toString()

        System.out.println("Subash" + new ArrayList<>());
        // operator + only allow to use primitive data types or any one of value is a String
        String ans = Integer.valueOf(89) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
