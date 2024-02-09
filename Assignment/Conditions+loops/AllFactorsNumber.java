package com.subash;

import java.util.Scanner;

public class AllFactorsNumber {
    public static void main(String[] args) {
        // Q : Input a number and print all the factors of that number (use loops).

        Scanner input = new Scanner (System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        PrintFactor(num);
        System.out.print("All Factor of number : " + num);

    }
    static void PrintFactor (int num ){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
}
