package com.subash.bitwise;

public class SetBits {
    public static void main(String[] args) {
        // check binary value
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count = 0;

        while (n > 0){
            count++;
            n-= (n & -n); //  we can use this to : n = n & (n-1);
        }

        return count;
    }
}
