package com.subash;

import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
}
