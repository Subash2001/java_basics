package com.subash;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
        //sum(); // sum - method : () is calling function;
    }

    // return the values
    /*
        return type, which specifies the type of value that the method will return
        after it completes its execution.
        when return function is used after that function of the code will not execute.
     */
    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
    }
    /*
        return_type name (){
        //body
        return statement;
        }
     */
}
