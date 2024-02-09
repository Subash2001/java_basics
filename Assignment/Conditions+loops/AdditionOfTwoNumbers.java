package com.subash;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 , num2 , sum;

        while (true){
            System.out.print("Enter the num1 value : ");
            num1 = input.nextDouble();
            System.out.print("Enter the num2 value : ");
            num2 = input.nextDouble();
            sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " value is " + sum);
            break;
        }

    }

}
