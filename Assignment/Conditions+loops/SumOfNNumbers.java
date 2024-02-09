package com.subash;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        // Q : To find a Sum Of N Numbers.
        // formula = N * (N + 1) / 2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 0; i <=N; i++) {
            sum +=1;
        }
        System.out.println("The sum of N Numbers = " + sum);

    }
}
