package com.subash.bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        // amazon question :
        // using binary number calculating this : 1 - 5 : 2 - 25 : 3 - 30 : 4 - 125 : 5 - 130 : 6 - 150..... so on.
        // the loop run that number of binary code times
        int n = 6;

        int ans = 0;

        // powering
        int base = 5;

        while (n > 0 ){
            int last = n & 1; // 0
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
