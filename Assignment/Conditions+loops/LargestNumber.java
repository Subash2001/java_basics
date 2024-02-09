package com.subash;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Q : Take integer inputs till the user enters 0 and print the largest number from all.

        Scanner input = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;
        int currentValue;

        do {
            System.out.print("Enter the integer value : ");
            currentValue = input.nextInt();
            if (currentValue != 0 && currentValue > largestNumber) {
                largestNumber = currentValue;
            }
        }
        while (currentValue != 0);
        if (largestNumber != Integer.MIN_VALUE) {
            System.out.print("The largest Number user input is : " + largestNumber);
        } else {
            System.out.println("enter correct value ");
        }
    }
}
