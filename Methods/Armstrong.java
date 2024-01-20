package com.subash;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        //System.out.println(isArmstrong(n));

        // all 3 digit Armstrong Number;
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }
}
